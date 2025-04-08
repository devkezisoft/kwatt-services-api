package com.kezisoft.app.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    @GetMapping
    public List<String> all() {
        return List.of("Alice", "Bob", "Charlie");
    }
}
