package com.qarts.springjokesapp.controllers;

import com.qarts.springjokesapp.services.ChuckNorrisJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final ChuckNorrisJokeService service;

    public JokesController(ChuckNorrisJokeService service) {
        this.service = service;
    }

    @RequestMapping(path = "/")
    public String displayRandomJoke(Model model) {
        model.addAttribute("joke", service.showJoke());
        return "chucknorris/joke";
    }

}
