package com.barry.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootMongodbApplication

fun main(args: Array<String>) {
	runApplication<SpringbootMongodbApplication>(*args)
}
