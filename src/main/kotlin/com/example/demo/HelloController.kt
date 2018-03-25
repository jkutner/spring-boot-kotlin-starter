package com.example.demo

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class HelloController {

    @GetMapping("/hello")
    fun helloKotlin(): String {
        return "hello world"
    }
}
