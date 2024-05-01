package org.example.warmtavernweb.Conventors;

import org.example.warmtavernweb.Entity.Genre;
import org.springframework.cglib.core.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GenreByIdConverter implements Converter {
    private Map<String, Genre> genreMap = new HashMap<String, Genre>();
    public GenreByIdConverter() {
        genreMap.put("1", new Genre(1, "Romantic"));
        genreMap.put("2", new Genre(2, "Detectiv"));
        genreMap.put("3", new Genre(3, "Action"));
        genreMap.put("4", new Genre(4, "Document"));
        genreMap.put("5", new Genre(5, "Fantastic"));
    }

    @Override
    public Genre convert(Object value, Class target, Object context) {
        return genreMap.get(value);
    }
}
