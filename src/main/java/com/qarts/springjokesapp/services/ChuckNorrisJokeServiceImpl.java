package com.qarts.springjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeServiceImpl implements ChuckNorrisJokeService {

    private final ChuckNorrisQuotes quotes;

    public ChuckNorrisJokeServiceImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String showJoke() {
        return quotes.getRandomQuote();
    }
}
