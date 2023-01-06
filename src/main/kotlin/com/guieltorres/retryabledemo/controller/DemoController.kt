package com.guieltorres.retryabledemo.controller

import com.guieltorres.retryabledemo.service.RetryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class DemoController(val retryService: RetryService) {

    @GetMapping("/run")
        fun get() {
            val initialTime = java.time.LocalDateTime.now()
            println("initialTime: $initialTime")
            retryService.run()
        }
}