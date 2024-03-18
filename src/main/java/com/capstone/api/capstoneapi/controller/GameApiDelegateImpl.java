package com.capstone.api.capstoneapi.controller;

import com.capstone.api.capstoneapi.exception.BusinessValidationException;
import com.capstone.api.capstoneapi.model.Error;
import com.capstone.api.capstoneapi.model.Game;
import com.capstone.api.capstoneapi.model.User;
import com.capstone.api.capstoneapi.service.CapstoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GameApiDelegateImpl implements GameApiDelegate{

    @Autowired
    CapstoneService capstoneService;
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<Game> createGame(Game game) {
        if (game ==null) {
            List<Error> errors = new ArrayList<>();
            errors.add(new Error().code(INVALID_INPUT_PARAMETER).message( "Missing input parameters."));
            throw new BusinessValidationException(errors, "Business Validation error.");
        }
        return ResponseEntity.status(HttpStatus.OK)
                .body(capstoneService.createGame(game));
    }

    @Override
    public ResponseEntity<Game> updateGameInfo(String gameId, Game game) {
        if (game == null) {
            List<Error> errors = new ArrayList<>();
            errors.add(new Error().code(INVALID_INPUT_PARAMETER).message( "Missing input parameters."));
            throw new BusinessValidationException(errors, "Business Validation error.");
        }
        return ResponseEntity.status(HttpStatus.OK)
                .body(capstoneService.updateGame(gameId, game));
    }

    @Override
    public ResponseEntity<List<Game>> getAllGamesByUser(String email) {
        if (email == null) {
            List<Error> errors = new ArrayList<>();
            errors.add(new Error().code(INVALID_INPUT_PARAMETER).message( "Missing input parameters."));
            throw new BusinessValidationException(errors, "Business Validation error.");
        }
        return ResponseEntity.status(HttpStatus.OK)
                .body(capstoneService.getGamesByUser(email));
    }
}
