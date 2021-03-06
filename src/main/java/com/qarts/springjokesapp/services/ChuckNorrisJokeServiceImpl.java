package com.qarts.springjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeServiceImpl implements ChuckNorrisJokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String showJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
