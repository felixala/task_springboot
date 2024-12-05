package com.felixlaura.services.jwt;

import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author felixlaura
 **/
public interface UserService {

    UserDetailsService userDetailsService();

}
