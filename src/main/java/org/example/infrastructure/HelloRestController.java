package org.example.infrastructure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping
    public String getHello() {
        return "Spring Boot Init";
    }

}
