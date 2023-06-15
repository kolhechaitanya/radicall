package com.example.Radical;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class aws {
    @GetMapping("/aws")
    public String getData(){
        return "Welcome to the Amazon web services";
    }
}
