package com.capstone.api.capstoneapi.service;

import com.capstone.api.capstoneapi.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@ActiveProfiles("test")
public class SampleTest {

    @Test
    public void testCase1()  throws  Exception{
        User user = new User();
        user.setUserName("Hlennn");
        user.setEmail("hel.ddd@cool.com");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        System.out.println(json);
    }
}
