package com.xelita.springcloud.sleuth.sleuthexperiment

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class HelloService {

    val log: Logger = LoggerFactory.getLogger(HelloService::class.java)

    fun test(): Mono<String> {
        log.info("in HelloService > test()")
        return Mono.just("Hello World!")
    }
}