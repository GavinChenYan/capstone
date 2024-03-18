package com.capstone.api.capstoneapi.repository.mapper;


import com.capstone.api.capstoneapi.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();

        user.setUserName(rs.getString("username"));
        user.setEmail(rs.getString("email"));
        user.setUserId(rs.getString("userId"));
        user.setPassword(rs.getString("Password"));
        //TODO
        //user.setDate(LocalDate.parse(rs.getString("date")));
        return user;
    }
}
