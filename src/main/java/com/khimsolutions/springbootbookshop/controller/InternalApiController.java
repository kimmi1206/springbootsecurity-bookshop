package com.khimsolutions.springbootbookshop.controller;

import com.khimsolutions.springbootbookshop.service.IUserService;
import com.khimsolutions.springbootbookshop.util.RouteUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kheiner
 * @date 13/Oct/22
 */
@RestController
@RequestMapping(RouteUtils.API_INTERNAL)
public class InternalApiController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/make-admin/{username}")
    public ResponseEntity<?> makeAdmin(@PathVariable String username) {

        userService.makeAdmin(username);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
