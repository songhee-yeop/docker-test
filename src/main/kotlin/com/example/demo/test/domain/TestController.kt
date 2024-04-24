package com.example.demo.test.domain

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController {


    @GetMapping("/")
    fun hello(): String {
        println("??")
        return "Hello, World"
    }
}