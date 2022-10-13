package com.khimsolutions.springbootbookshop.controller;

import com.khimsolutions.springbootbookshop.model.User;
import com.khimsolutions.springbootbookshop.service.IAuthenticationService;
import com.khimsolutions.springbootbookshop.service.IUserService;
import com.khimsolutions.springbootbookshop.util.RouteUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RouteUtils.API_AUTHENTICATION)  // pre-path (no authorization required; accessible for all users)
public class AuthenticationController {

    @Autowired
    private IAuthenticationService authenticationService;

    @Autowired
    private IUserService userService;

    @PostMapping("sign-up")
    public ResponseEntity<User> signUp(@RequestBody User user) {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }
}
