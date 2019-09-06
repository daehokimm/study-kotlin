package me.donald.todo.handler

import me.donald.todo.dao.TodoRepository
import me.donald.todo.domain.Todo
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.notFound
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono
import java.time.LocalDateTime
import java.util.*

@Component
class TodoHandler(private val repo: TodoRepository) {
    fun getAll(req: ServerRequest) : Mono<ServerResponse> = ok()
        .contentType(MediaType.APPLICATION_JSON_UTF8)
        .body<List<Todo>>(Mono.just(repo.findAll()))
        .switchIfEmpty(notFound().build())
    fun getById(req: ServerRequest): Mono<ServerResponse> = ok()
        .contentType(MediaType.APPLICATION_JSON_UTF8)
        .body<Todo>(Mono.justOrEmpty(repo.findById(req.pathVariable("id").toLong())))
        .switchIfEmpty(notFound().build())
    fun save(req: ServerRequest): Mono<ServerResponse> = ok()
        .contentType(MediaType.APPLICATION_JSON_UTF8)
        .body(req.bodyToMono(Todo::class.java)
            .switchIfEmpty(Mono.empty())
            .filter(Objects::nonNull)
            .flatMap { todo ->
                Mono.fromCallable {         // TODO ??? 디비 요청을 동기형태로 진행하는 건가?
                    repo.save(todo)
                }.then(Mono.just(todo))
            }
        ).switchIfEmpty(notFound().build())
    fun done(req: ServerRequest) : Mono<ServerResponse> = ok()
        .contentType(MediaType.APPLICATION_JSON_UTF8)
        .body(Mono.justOrEmpty(repo.findById(req.pathVariable("id").toLong()))
            .switchIfEmpty(Mono.empty())
            .filter(Objects::nonNull)
            .flatMap { todo ->
                Mono.fromCallable {
                    todo.done = true
                    todo.modifiedAt = LocalDateTime.now()
                    repo.save(todo)
                }.then(Mono.just(todo))
            }
        ).switchIfEmpty(notFound().build())
    fun delete(req: ServerRequest): Mono<ServerResponse> = ok()
        .contentType(MediaType.APPLICATION_JSON_UTF8)
        .body(Mono.justOrEmpty(repo.findById(req.pathVariable("id").toLong()))
            .switchIfEmpty(Mono.empty())
            .filter(Objects::nonNull)
            .flatMap {todo ->
                Mono.fromCallable {
                    repo.delete(todo)
                }.then(Mono.just(todo))
            }
        ).switchIfEmpty(notFound().build())
}
