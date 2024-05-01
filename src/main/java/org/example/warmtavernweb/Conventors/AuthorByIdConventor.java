package org.example.warmtavernweb.Conventors;

import org.example.warmtavernweb.Entity.Author;
import org.springframework.cglib.core.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AuthorByIdConventor implements Converter {
    private Map<String, Author> authorsMap = new HashMap<String, Author>();
    public AuthorByIdConventor() {
        authorsMap.put("")
    }
    @Override
    public Object convert(Object value, Class target, Object context) {
        return null;
    }
}
