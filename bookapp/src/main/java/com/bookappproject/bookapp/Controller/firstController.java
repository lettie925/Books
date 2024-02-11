package com.bookappproject.bookapp.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class firstController {

    @GetMapping("/welcome")
    public String first_api() {
        return "welcome!";
    }
    
}
