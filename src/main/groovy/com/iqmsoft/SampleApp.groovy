package com.iqmsoft

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SampleApp {
    static def timer = new Timer()
    static void main(String[] args) {
        SpringApplication.run(SampleApp.class, args)
    }
}



