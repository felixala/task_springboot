package com.felixlaura.services.auth;

import com.felixlaura.dto.SignupRequest;
import com.felixlaura.dto.UserDto;

/**
 * @author felixlaura
 **/
public interface AuthService {

 UserDto signupUser(SignupRequest signupRequest);

 boolean hasUserWithEmail(String email);
}
