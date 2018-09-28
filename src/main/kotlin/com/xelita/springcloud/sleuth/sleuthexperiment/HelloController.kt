package com.xelita.springcloud.sleuth.sleuthexperiment

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RequestMapping("/api")
@RestController
class HelloController(@Autowired val service: HelloService) {

    val log: Logger = LoggerFactory.getLogger(HelloController::class.java)

    @GetMapping("/test")
    fun test(): Mono<String> {
        log.info("in HelloController > test()")
        return this.service.test()
    }
}