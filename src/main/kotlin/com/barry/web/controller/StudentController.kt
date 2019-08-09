package com.barry.web.controller

import com.barry.web.domain.document.Student
import com.barry.web.service.StudentService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/student")
class StudentController {

    @Autowired
    lateinit var studentService: StudentService

    private val logger = LoggerFactory.getLogger(StudentController::class.java)

    @GetMapping("/{id}")
    fun student(@PathVariable("id") id : String): Mono<Student> {
        logger.info("find : {}", id)
        return studentService.find(id)
    }

    @PostMapping
    fun create(@RequestBody student: Student) : Mono<Student> {
        logger.info(" create : {}", student)
        return studentService.create(student)
    }

    @PutMapping
    fun update(@RequestBody student: Student) : Mono<Student> {
        logger.info(" update : {}", student)
        return studentService.create(student)
    }

    @DeleteMapping
    fun delete(@RequestParam id: String): Mono<Void> {
        logger.info("delete : {}", id)
        return studentService.delete(id)
    }

}