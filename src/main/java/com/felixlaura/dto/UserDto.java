package com.felixlaura.dto;

import com.felixlaura.enums.UserRole;
import lombok.Data;

/**
 * @author felixlaura
 **/

@Data
public class UserDto {

    private Long id;

    private String name;

    private String email;

    private String password;

    private UserRole userRole;
}
