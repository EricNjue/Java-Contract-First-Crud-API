package com.example.openapispringboot.services;

import com.example.openapispringboot.api.UsersApiDelegate;
import com.example.openapispringboot.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersApiDelegateImpl implements UsersApiDelegate {

    @Override
    public ResponseEntity<List<User>> getAllUsers() {

        List<User> users = new ArrayList<>();

        User eric = new User();
        eric.setUserStatus(1);
        eric.setUsername("Eric");
        eric.setLastName("Njue");
        eric.setId(3770L);
        eric.setFirstName("Gitonga");


        User eva = new User();
        eva.setFirstName("Evalyne");
        eva.setId(2L);
        eva.setLastName("Woki");
        eva.setUsername("Eva.Gitonga");
        eva.setUserStatus(3);

        User etana = new User();
        etana.setUserStatus(355);
        etana.setUsername("Etana");
        etana.setLastName("Gitonga");
        etana.setId(311L);
        etana.setFirstName("Ruguru");

        users.add(eric);
        users.add(eva);
        users.add(etana);

        return ResponseEntity.ok(users);
    }
}
