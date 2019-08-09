package com.barry.web.service

import com.barry.web.domain.document.Student
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface StudentService {

    fun find(id: String) : Mono<Student>

    fun list() : Flux<Student>

    fun create(student: Student) : Mono<Student>

    fun delete(id: String) : Mono<Void>

}