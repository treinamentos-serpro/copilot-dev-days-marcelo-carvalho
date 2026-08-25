package com.socops.web;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Defines the server-rendered page contract for the Scavenger Hunt game mode.
 */
@SpringBootTest
@AutoConfigureMockMvc
class ScavengerHuntPageTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Lobby exposes a Scavenger Hunt mode selector")
    void lobbyExposesScavengerHuntModeSelector() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("id=\"scavengerModeButton\"")))
                .andExpect(content().string(containsString("data-game-mode=\"scavenger\"")));
    }

    @Test
    @DisplayName("Scavenger Hunt renders a checklist and native progress meter")
    void scavengerHuntProvidesChecklistAndProgressMeter() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("id=\"scavengerList\"")))
                .andExpect(content().string(containsString("type=\"checkbox\"")))
                .andExpect(content().string(containsString("id=\"scavengerProgress\"")))
                .andExpect(content().string(containsString("<progress")));
    }
}