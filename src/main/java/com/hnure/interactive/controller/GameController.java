package com.hnure.interactive.controller;

import com.hnure.interactive.jpa.Game;
import com.hnure.interactive.jpa.User;
import com.hnure.interactive.repository.GameRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GameController {
    private final GameRepository gameRepository;
    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
    @GetMapping("/game")
    public Optional<Game> getGame(Long id) {
        return gameRepository.findById(id);
    }

}
