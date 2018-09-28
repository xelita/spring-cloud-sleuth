package com.xelita.springcloud.sleuth.sleuthexperiment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SleuthExperimentApplication

fun main(args: Array<String>) {
    runApplication<SleuthExperimentApplication>(*args)
}
