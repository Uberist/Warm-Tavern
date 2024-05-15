package org.example.warmtavernweb;

import org.example.warmtavernweb.controller.MainPageController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MainPageController.class)
public class MainPageControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testMainPage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/WarmTavernMain"))
                .andExpect(status().isOk())
                .andExpect(view().name("MainPage"));
    }
}
