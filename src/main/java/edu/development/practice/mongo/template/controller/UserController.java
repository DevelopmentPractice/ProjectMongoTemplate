package edu.development.practice.mongo.template.controller;

import edu.development.practice.mongo.template.entity.User;
import edu.development.practice.mongo.template.request.UserRequest;
import edu.development.practice.mongo.template.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/crud")
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/insert")
    public ResponseEntity<User> insert(@RequestBody UserRequest request) {
        return new ResponseEntity<>(userService.insert(request), HttpStatus.OK);
    }
}
