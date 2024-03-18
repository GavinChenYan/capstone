package com.capstone.api.capstoneapi.controller;

import com.capstone.api.capstoneapi.model.Error;
import com.capstone.api.capstoneapi.model.User;
import com.capstone.api.capstoneapi.service.CapstoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
@Service
public class UserApiDelegateImpl implements UserApiDelegate {

    @Autowired
    CapstoneService capstoneService;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<User> createUser(User user) {
        if (user != null) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(capstoneService.createUser(user));
        } else {
            Error error = new Error();
            error.setCode("ERR001");
            error.setMessage("user is null");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(user);
        }

    }

    @Override
    public ResponseEntity<Integer> deleteUser(String userId) {
        if (userId != null) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(capstoneService.deleteUser(userId));
        } else {
            Error error = new Error();
            error.setCode("ERR002");
            error.setMessage("userID is null");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Integer.valueOf(userId));
        }
    }

    @Override
    public ResponseEntity<User> getUser(String email, String password) {
        if (email != null && password != null) {
//            if (password.length() <9){
//            Error error = new Error();
//            error.setCode("ERR004");
//            error.setMessage("Password is too short");
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//                    .body(error);
//            }
            User user = new User();
            user.setUserId("1111");
            user.setEmail(email);
            user.setUserName("test test");
            System.out.println("getUser API calling");
            return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin", "*")
                    .body(user);
//            return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin", "*")
//                    .body(capstoneService.getUser(email, password));
        } else {
            Error error = new Error();
            error.setCode("ERR003");
            error.setMessage("userID is null");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }

    @Override
    public ResponseEntity<User> updateUserInfo(String userId, User user) {
        if (user != null) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(capstoneService.updateUser(userId, user));
        } else {
            Error error = new Error();
            error.setCode("ERR001");
            error.setMessage("user is null");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(user);
        }
    }
}