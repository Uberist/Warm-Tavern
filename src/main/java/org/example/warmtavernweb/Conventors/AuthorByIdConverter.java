package org.example.warmtavernweb.Conventors;

import org.example.warmtavernweb.Entity.Author;
import org.springframework.cglib.core.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AuthorByIdConverter implements Converter {
    private Map<String, Author> authorsMap = new HashMap<String, Author>();
    public AuthorByIdConverter() {
        authorsMap.put("1", new Author(1, "Striven", "Kink", "hs"));
        authorsMap.put("2", new Author(2, "Alecsandr" ,"Sergeevic", "Pushckin"));
        authorsMap.put("3", new Author(3, "alecandr", "noname", "hs"));
    }

    @Override
    public Author convert(Object value, Class target, Object context) {
        return authorsMap.get(value);
    }
}
