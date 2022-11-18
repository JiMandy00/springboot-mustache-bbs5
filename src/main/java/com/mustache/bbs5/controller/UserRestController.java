package com.mustache.bbs5.controller;

import com.mustache.bbs5.UserRequest;
import com.mustache.bbs5.UserResponse;
import com.mustache.bbs5.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserRestController {
    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    // ResponseEntity class : Http request, response에 해당하는 http header, body를 포함
    public ResponseEntity<UserResponse> getUser(@PathVariable Long id) {
        return ResponseEntity.ok().body(userService.getUser(id));
    }

    @PostMapping(("/post"))
    public ResponseEntity<UserResponse> addUser(@RequestBody UserRequest dto) {
        return ResponseEntity.ok().body(userService.addUser(dto));
    }
}
