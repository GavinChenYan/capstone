package com.capstone.api.capstoneapi.repository;

import com.capstone.api.capstoneapi.model.Game;
import com.capstone.api.capstoneapi.model.User;

import java.util.List;

public interface CapstoneRepository {

    User insertClient(User user);
    int deleteUser(String userId);

    User getUser(String email, String password);
    void updateUser(String email, User user);

    Game createGame (Game game);
    void updateGame (String gameId, Game game);

    Game getGame(String userid);

    List<Game> getGamesByUser(String email);
}
