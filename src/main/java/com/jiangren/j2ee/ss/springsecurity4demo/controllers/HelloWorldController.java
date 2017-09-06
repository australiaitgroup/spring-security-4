package com.jiangren.j2ee.ss.springsecurity4demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by seabook on 6/9/17.
 */
@RestController
public class HelloWorldController {

    @GetMapping(value = "/helloworld/{name}")
    public String home(@PathVariable("name") String name) {
        return "Hello " + name;
    }
}
