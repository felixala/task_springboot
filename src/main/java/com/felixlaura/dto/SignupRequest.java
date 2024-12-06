package com.felixlaura.dto;

import lombok.Data;

/**
 * @author felixlaura
 **/

@Data
public class SignupRequest {

    private String name;

    private String email;

    private String password;
}
