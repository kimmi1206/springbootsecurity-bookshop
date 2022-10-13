package com.khimsolutions.springbootbookshop.service;

import com.khimsolutions.springbootbookshop.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
