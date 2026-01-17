package com.mycompany;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ApiController {


    @GetMapping("/api/v1/hello")
    public Response hello() {
        return new Response ("Hello, World! Welcome to my API!");
    }
}
