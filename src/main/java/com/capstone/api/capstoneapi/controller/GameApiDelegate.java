package com.capstone.api.capstoneapi.controller;

import com.capstone.api.capstoneapi.model.Error;
import com.capstone.api.capstoneapi.model.Game;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link GameApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-28T16:12:15.884358400-05:00[America/Toronto]")
public interface GameApiDelegate {

    final  String INVALID_INPUT_PARAMETER = "ERR20001";
    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /game : Create game for capstone
     *
     * @param game Create Game for capstone (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     * @see GameApi#createGame
     */
    default ResponseEntity<Game> createGame(Game game) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"gameId\" : \"gameId\", \"result\" : true, \"score\" : 0, \"gameDate\" : \"2000-01-23\", \"userId\" : \"userId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /game/{gameId} : update Game info
     *
     * @param gameId The id of the user (required)
     * @param game user information (required)
     * @return An paged array of pets (status code 200)
     *         or unexpected error (status code 200)
     * @see GameApi#updateGameInfo
     */
    default ResponseEntity<Game> updateGameInfo(String gameId,
        Game game) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"gameId\" : \"gameId\", \"result\" : true, \"score\" : 0, \"gameDate\" : \"2000-01-23\", \"userId\" : \"userId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    default ResponseEntity<List<Game>> getAllGamesByUser(String email) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"gameId\" : \"gameId\", \"result\" : true, \"score\" : 0, \"gameDate\" : \"2000-01-23\", \"userId\" : \"userId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
}
