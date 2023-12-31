package com.musenbi.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @GetMapping("/")
    fun index(): ResponseEntity<String> {
        return ResponseEntity.ok("Kotlin Spring Boot")
    }
}