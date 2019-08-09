package com.barry.web.service

import com.barry.web.domain.document.Student
import com.barry.web.exception.ResourceNotFoundException
import com.barry.web.repository.StudentRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class StudentServiceImpl : StudentService {

    private val logger = LoggerFactory.getLogger(StudentServiceImpl::class.java)

    @Autowired
    lateinit var studentRepository: StudentRepository

    override fun find(id: String): Mono<Student> {
        return studentRepository.findById(id)
                .switchIfEmpty(Mono.error(ResourceNotFoundException("Student Not Found")))
    }

    override fun list(): Flux<Student> {
        return studentRepository.findAll()
    }

    override fun create(student: Student): Mono<Student> {
        return studentRepository.save(student)
    }

    override fun delete(id: String): Mono<Void> {
        return studentRepository.deleteById(id)
    }
}