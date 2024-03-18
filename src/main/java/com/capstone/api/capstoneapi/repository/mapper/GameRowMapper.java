package com.capstone.api.capstoneapi.repository.mapper;


import com.capstone.api.capstoneapi.model.Game;
import com.capstone.api.capstoneapi.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GameRowMapper implements RowMapper<Game> {

    @Override
    public Game mapRow(ResultSet rs, int rowNum) throws SQLException {
        Game game = new Game();
        //TODO
        //game.setCode("");

        return game;
    }
}
