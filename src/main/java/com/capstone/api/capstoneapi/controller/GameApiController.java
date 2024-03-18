package com.capstone.api.capstoneapi.controller;

import com.capstone.api.capstoneapi.model.Error;
import com.capstone.api.capstoneapi.model.Game;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-28T16:12:15.884358400-05:00[America/Toronto]")
@Controller
@RequestMapping("${openapi.swaggerVolcanoCampsite.base-path:/api}")
public class GameApiController implements GameApi {

    private final GameApiDelegate delegate;

    public GameApiController(@Autowired(required = false) GameApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new GameApiDelegate() {});
    }

    @Override
    public GameApiDelegate getDelegate() {
        return delegate;
    }

}
