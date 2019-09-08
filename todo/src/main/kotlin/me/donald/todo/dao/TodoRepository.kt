package me.donald.todo.dao

import me.donald.todo.domain.Todo
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface TodoRepository : ReactiveCrudRepository<Todo, Long>