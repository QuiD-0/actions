package com.quid.sample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping
    fun hello(): String {
        return "Hello, World!"
    }
}
