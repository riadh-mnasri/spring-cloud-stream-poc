package com.wehightech

import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Processor
import org.springframework.messaging.handler.annotation.SendTo


class MyEntryPointListener {

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    fun handle(person: ByteArray) {
        println("Received: $person")
    }

   data class Person(val name: String)
}
