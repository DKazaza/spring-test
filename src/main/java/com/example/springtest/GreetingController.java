package com.example.springtest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    @GetMapping
    public String greet(@RequestParam("name") String name) {

        return "Привет, "+name;
    }
    @GetMapping("/full")
    public String fullGreeting(@RequestParam("name") String name,
                            @RequestParam("surname") String surname) {
        return "Здравствуй, "+name+" "+surname;
    }
    @GetMapping("/{name}")
    public String greetWithPathVariable(@PathVariable("name") String name) {
        return "Привет, " + name;
    }
    @GetMapping("/{name}/{surname}")
    public String greetWithPathVariable(@PathVariable("name") String name,
                                        @PathVariable("surname") String surname) {
        return "Здравствуй, " + name + " " + surname;
    }
}
