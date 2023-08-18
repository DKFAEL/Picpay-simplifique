package com.picpaysimplified.dtos;


import com.picpaysimplified.domain.user.User.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {
}
