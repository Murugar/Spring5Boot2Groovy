package com.iqmsoft.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping (value="/ping")
    String ping() {
        return "{ 'msg': 'I'm a sample test.' }"
    }
}
