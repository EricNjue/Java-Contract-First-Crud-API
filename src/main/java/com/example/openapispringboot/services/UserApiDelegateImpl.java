package com.example.openapispringboot.services;

import com.example.openapispringboot.api.UserApiDelegate;
import com.example.openapispringboot.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserApiDelegateImpl implements UserApiDelegate {

    @Override
    public ResponseEntity<User> getUserByName(String username) {

        User user = new User();
        user.setFirstName("Eric");
        user.setId(1L);
        user.setLastName("Njue");
        user.setUsername(username);
        user.setUserStatus(2);

        return ResponseEntity.ok(user);
    }
}
