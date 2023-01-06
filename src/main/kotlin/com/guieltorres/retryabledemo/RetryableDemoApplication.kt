package com.guieltorres.retryabledemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.retry.annotation.EnableRetry

@EnableRetry
@SpringBootApplication
class RetryableDemoApplication

fun main(args: Array<String>) {
	runApplication<RetryableDemoApplication>(*args)
}
