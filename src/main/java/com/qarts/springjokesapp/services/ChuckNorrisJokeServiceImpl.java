package com.qarts.springjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeServiceImpl implements ChuckNorrisJokeService {

    @Override
    public String showJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
