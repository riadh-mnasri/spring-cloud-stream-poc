package com.wehightech

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.messaging.Processor

@SpringBootApplication
@EnableBinding(Processor::class)
class SpringCloudSampleApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudSampleApplication>(*args)
}
