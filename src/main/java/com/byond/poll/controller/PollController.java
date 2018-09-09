package com.byond.poll.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {
	@RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
