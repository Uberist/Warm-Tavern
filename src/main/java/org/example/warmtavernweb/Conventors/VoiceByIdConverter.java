package org.example.warmtavernweb.Conventors;

import org.example.warmtavernweb.Entity.Author;
import org.example.warmtavernweb.Entity.Voice;
import org.springframework.cglib.core.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class VoiceByIdConverter implements Converter {
    private Map<String, Voice> voiceMap = new HashMap<String, Voice>();
    public VoiceByIdConverter(){
        voiceMap.put("1", new Voice(1, "Igor", "Knizev", "hs"));
        voiceMap.put("2", new Voice(2, "oleg", "bulgacov", "hs"));
    }

    @Override
    public Voice convert(Object value, Class target, Object context) {
        return voiceMap.get(value);
    }
}
