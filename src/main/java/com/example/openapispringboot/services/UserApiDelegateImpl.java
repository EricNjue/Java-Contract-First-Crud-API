package com.example.openapispringboot.services;

import com.example.openapispringboot.api.UserApiDelegate;
import com.example.openapispringboot.model.RequestResponse;
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
        user.setFirstName("Eric Docker");
        user.setId(1L);
        user.setLastName("Njue Docker");
        user.setUsername(username);
        user.setUserStatus(2);

        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity<RequestResponse> createUser(User user) {
        //todo :- logic to add a user ...
        RequestResponse requestResponse = new RequestResponse();
        requestResponse.setCode("0");
        requestResponse.setDescription("Request processed successfully");
        requestResponse.setMessage("Success");

        return ResponseEntity.ok(requestResponse);
    }
}
