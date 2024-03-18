package com.capstone.api.capstoneapi.controller;

import com.capstone.api.capstoneapi.model.User;
import com.capstone.api.capstoneapi.model.Verifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link UserApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-28T16:12:15.884358400-05:00[America/Toronto]")
public interface UserApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /user : Create User for capstone
     *
     * @param user Create User for capstone (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     * @see UserApi#createUser
     */
    default ResponseEntity<User> createUser(User user) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2000-01-23\", \"password\" : \"password\", \"userName\" : \"userName\", \"userId\" : \"userId\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /user/{userId} : delete User
     *
     * @param userId The id of the User (required)
     * @return Expected response to a valid request (status code 200)
     * or unexpected error (status code 200)
     * @see UserApi#deleteUser
     */
    default ResponseEntity<Integer> deleteUser(String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2000-01-23\", \"password\" : \"password\", \"userName\" : \"userName\", \"userId\" : \"userId\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /user : get user info
     *
     * @param email start data search (required)
     * @param password end data search (required)
     * @return An paged array of pets (status code 200)
     *         or unexpected error (status code 200)
     * @see UserApi#getUser
     */
    default ResponseEntity<User> getUser(String email,
        String password) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2000-01-23\", \"password\" : \"password\", \"userName\" : \"userName\", \"userId\" : \"userId\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /user/{userId} : update User info
     *
     * @param userId The id of the user (required)
     * @param user user information (required)
     * @return An paged array of pets (status code 200)
     *         or unexpected error (status code 200)
     * @see UserApi#updateUserInfo
     */
    default ResponseEntity<User> updateUserInfo(String userId,
        User user) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2000-01-23\", \"password\" : \"password\", \"userName\" : \"userName\", \"userId\" : \"userId\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /user/verify : verify User for capstone
     *
     * @param verifier verify User for capstone (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     * @see UserApi#verifyUser
     */
    default ResponseEntity<String> verifyUser(Verifier verifier) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
