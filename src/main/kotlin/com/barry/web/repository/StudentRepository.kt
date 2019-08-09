package com.barry.web.repository

import com.barry.web.domain.document.Student
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface StudentRepository : ReactiveMongoRepository<Student, String>