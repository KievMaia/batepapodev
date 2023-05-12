package com.prologapp.batepapodev.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @GetMapping("/{nome}")
    public String helloFulano(@PathVariable String nome) {
        return String.format("Hello %s", nome);
    }
}
