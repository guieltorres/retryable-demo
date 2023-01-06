package com.guieltorres.retryabledemo.service

import org.springframework.retry.annotation.Backoff
import org.springframework.retry.annotation.Retryable
import org.springframework.stereotype.Service

@Service
class RetryService {

    @Retryable(value = [Exception::class], maxAttempts = 3,
        backoff = Backoff(
            delayExpression = "\${retry.backoff.delay}",
            multiplierExpression = "\${retry.backoff.multiplier}",
            maxDelayExpression = "\${retry.backoff.maxDelay}"
        ),
        maxAttemptsExpression = "\${retry.backoff.maxAttempts}"
    )
    fun run() {
        println("Running")

        val datetime = java.time.LocalDateTime.now()
        println("retryTime: $datetime")

        throw RuntimeException("Error")
    }
}