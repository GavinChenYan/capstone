package com.capstone.api.capstoneapi.repository;

import com.capstone.api.capstoneapi.model.Game;
import com.capstone.api.capstoneapi.model.User;
import com.capstone.api.capstoneapi.repository.mapper.GameRowMapper;
import com.capstone.api.capstoneapi.repository.mapper.UserRowMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.capstone.api.capstoneapi.service.Encryption.getSHA;
import static com.capstone.api.capstoneapi.service.Encryption.toHexString;

@Repository
public class CapstoneRepositoryImpl implements CapstoneRepository{

    private static final Logger logger= LoggerFactory.getLogger(CapstoneRepository.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${query.insertUser}")
    private String QUERY_INSERT_USER;

    @Value("${query.deleteUser}")
    private String QUERY_DELETE_USER;

    @Value("${query.getUser}")
    private String QUERY_GET_USER;

    @Value("${query.updateUser}")
    private String UPDATE_USER;

    @Value("${query.createGames}")
    private String QUERY_CREATE_GAME;

    @Value("${query.updateGames}")
    private String UPDATE_GAME;



    @Override
    public User insertClient(User user) {

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(QUERY_INSERT_USER, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getUserName());
            ps.setString(2,user.getEmail());
            ps.setString(3,user.getPassword());
            return ps;
        }, keyHolder);
        user.setUserId(keyHolder.getKey().toString());
        return user;
    }

    @Override
    public int deleteUser(String userId) {
        return jdbcTemplate.update(QUERY_DELETE_USER, userId);
    }

    @Override
    public User getUser(String email, String password) {

        if (logger.isDebugEnabled()) logger.debug("query for get User:" + QUERY_GET_USER);
        return jdbcTemplate.queryForObject(QUERY_GET_USER,  new UserRowMapper(), email, password);
    }

    @Override
    public void updateUser(String email, User user) {
        String encrypted = null;
        try {
            encrypted = toHexString(getSHA(user.getPassword()));

        } catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }

        jdbcTemplate.update(UPDATE_USER, encrypted, email);
    }

    @Override
    public Game createGame(Game game) {
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(QUERY_CREATE_GAME, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, game.getHostId());
            return ps;
        }, keyHolder);
        game.setGameId(keyHolder.getKey().toString());
        return game;
    }

    @Override
    public void updateGame(String gameId, Game game) {
        jdbcTemplate.update(UPDATE_GAME, game.getGuestId(), game.getGuestScore(), game.getHostScore(), gameId);
    }

    @Override
    public Game getGame(String userid) {
        return null;
    }


    @Override
    public List<Game> getGamesByUser(String email) {
        List<Game> games = new ArrayList<>();
        Game game1 = new Game();
        game1.setCode("111");
        game1.setHostId("1111");
        game1.setGuestId("2222");
        game1.setHostScore(10);
        game1.setGuestScore(9);
        games.add(game1);
        Game game2 = new Game();
        game2.setCode("211");
        game2.setHostId("1111");
        game2.setGuestId("2222");
        game2.setHostScore(12);
        game2.setGuestScore(15);
        games.add(game2);
        //TODO
        //return jdbcTemplate.query(QUERY_GET_USER,  new GameRowMapper(), email);
        return games;

    }
}

