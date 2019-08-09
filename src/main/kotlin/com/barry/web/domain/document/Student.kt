package com.barry.web.domain.document

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Student {
    @Id
    var id: String? = null
    var name: String? = null
    var age: Int? = 0
    var gender: String? = null
    var sClass: String? = null

    override fun toString(): String {
        return ObjectMapper().writeValueAsString(this)
    }
}