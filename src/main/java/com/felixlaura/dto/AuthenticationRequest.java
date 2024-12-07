package com.felixlaura.dto;

import lombok.Data;

/**
 * @author felixlaura
 **/

@Data
public class AuthenticationRequest {

    private String email;

    private String password;
}
