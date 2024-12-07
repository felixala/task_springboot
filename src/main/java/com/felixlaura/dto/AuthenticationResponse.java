package com.felixlaura.dto;

import com.felixlaura.enums.UserRole;
import lombok.Data;

/**
 * @author felixlaura
 **/

@Data
public class AuthenticationResponse {

    private String jwt;

    private long userId;

    private UserRole userRole;
}
