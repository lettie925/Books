package com.bookappproject.bookapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class firstController {

    @GetMapping("/welcome")
    public String first_api() {
        return "welcome!";
    }

}
