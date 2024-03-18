package com.capstone.api.capstoneapi.service;

import com.capstone.api.capstoneapi.model.Game;
import com.capstone.api.capstoneapi.model.User;

import java.util.List;

public interface CapstoneService {
    User createUser (User user);

    User getUser (String email, String password);

    int deleteUser (String userId);

    User updateUser (String email, User user);

    Game createGame (Game game);

    Game updateGame (String GameId, Game game);

    List<Game> getGamesByUser (String email);
}
