package com.jebert.rsa.entities.user.model.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record UserVo(@NotNull(message = "Please enter Username!") String userName,
                     @NotNull(message = "Please enter fullName!")String fullName,
                     @NotNull(message = "Please enter password!")String password,
                     @NotNull(message = "Please enter a e-mail!") @Email String email,
                     @NotNull(message = "Please define - Account isn´t Expired?")Boolean accountNonExpired,
                     @NotNull(message = "Please define - Account isn´t Locked?")Boolean accountNonLocked,
                     @NotNull(message = "Please define - Credentials aren´t Expired?")Boolean credentialsNonExpired,
                     @NotNull(message = "Please define - Account is enabled?")Boolean enabled,
                     @NotNull(message = "Please enter Role!") String[] roleDescription) {
}
