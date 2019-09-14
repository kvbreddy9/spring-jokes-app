package vijay.springframework.joke.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements  JokeService {

    private final ChuckNorrisQuotes norrisQuotes;

    public JokeServiceImpl() {
        norrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return this.norrisQuotes.getRandomQuote();
    }
}
