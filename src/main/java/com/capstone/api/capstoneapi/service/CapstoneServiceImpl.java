package com.capstone.api.capstoneapi.service;

import com.capstone.api.capstoneapi.exception.ServiceProcessException;
import com.capstone.api.capstoneapi.model.Game;
import com.capstone.api.capstoneapi.model.User;
import com.capstone.api.capstoneapi.repository.CapstoneRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import static com.capstone.api.capstoneapi.service.Encryption.getSHA;
import static com.capstone.api.capstoneapi.service.Encryption.toHexString;


@Service
public class CapstoneServiceImpl implements CapstoneService{

    private static final Logger logger= LoggerFactory.getLogger(CapstoneService.class);

    @Autowired
    private CapstoneRepository capstoneRepository;
    @Override
    public User createUser(User user) {
        try {
            String encrypted = toHexString(getSHA(user.getPassword()));
            user.setPassword(encrypted);

            //Create user to DB
            //Send email
            capstoneRepository.insertClient(user);

        } catch (NoSuchAlgorithmException e)
        {
            logger.error("Exception thrown for incorrect algorithm: " + e);
            throw new ServiceProcessException("Exception thrown for incorrect algorithm", e);
        }
        return user;
    }

    @Override
    public int deleteUser(String userId) {
        int status = capstoneRepository.deleteUser(userId);
        return status;

    }

    @Override
    public User getUser(String email, String password) {
        String encrypted = null;
        try {
            encrypted = toHexString(getSHA(password));

        } catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
        User user = capstoneRepository.getUser(email, encrypted);
        return user;
    }

    @Override
    public User updateUser(String email, User user) {
        //TODO
        //user.setEmailVerify();
        capstoneRepository.updateUser(email, user);
        return user;

    }

    @Override
    public Game createGame(Game game) {
        capstoneRepository.createGame(game);
        return game;
    }

    @Override
    public Game updateGame(String gameId, Game game) {
        capstoneRepository.updateGame(gameId, game);
        return game;

    }

    @Override
    public List<Game> getGamesByUser(String email) {
        return capstoneRepository.getGamesByUser(email);
    }
}
