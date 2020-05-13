package com.hnure.interactive.controller;


import com.hnure.interactive.jpa.PlayerStats;
import com.hnure.interactive.repository.PlayerStatsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RateController {
    private final PlayerStatsRepository playerStatsRepository;

    public RateController(PlayerStatsRepository playerStatsRepository) {
        this.playerStatsRepository = playerStatsRepository;
    }

    @GetMapping("/rate")
    public List<PlayerStats> getRate() {
        return playerStatsRepository.findAll();
    }
}
