package com.prologapp.batepapodev.api.controller;

import com.prologapp.batepapodev.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    @GetMapping("/{nome}")
    public List<User> helloFulano(@PathVariable String nome) {
        return null;
    }
}
