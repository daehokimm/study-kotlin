package me.donald.todo

import me.donald.todo.dao.TodoRepository
import me.donald.todo.domain.Todo
import me.donald.todo.handler.TodoHandler
import me.donald.todo.router.TodoRouter
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito.given
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.reactive.server.WebTestClient
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RunWith(SpringRunner::class)
@WebFluxTest
class TodoApplicationTests {

	@MockBean
	lateinit var repo: TodoRepository

	lateinit var webClient: WebTestClient
	lateinit var todo1: Todo
	lateinit var todo2: Todo

	@Before
	fun setUp() {
		todo1 = Todo(id = 1L, content = "Clean Cats bathroom")
		todo2 = Todo(id = 2L, content = "Feed Cat")
		val routerFunction = TodoRouter(TodoHandler(repo)).routerFunction()
		webClient = WebTestClient.bindToRouterFunction(routerFunction).build()
	}

	@Test
	fun `test should return a list of todo`() {
		given(repo.findAll()).willReturn(Flux.just(todo1, todo2))

		val responseBody = webClient.get().uri("/todos").accept(MediaType.APPLICATION_JSON)
			.exchange()
			.expectStatus().isOk
			.expectBodyList(Todo::class.java).hasSize(2)
			.returnResult().responseBody

		assertThat(responseBody?.get(1)?.id).isEqualTo(2L)
		assertThat(responseBody?.get(1)?.content).isEqualTo("Feed Cat")
	}

	@Test
	fun `test should return an item of todo by id`() {
		given(repo.findById(1L)).willReturn(Mono.just(todo1))

		val responseBody = webClient.get().uri("/todos/{id}", 1L).accept(MediaType.APPLICATION_JSON)
			.exchange()
			.expectStatus().isOk
			.expectBody(Todo::class.java)
			.returnResult().responseBody

		assertThat(responseBody?.content).isEqualTo("Clean Cats bathroom")

	}

}
