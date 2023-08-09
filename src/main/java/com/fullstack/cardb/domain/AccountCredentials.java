package com.fullstack.cardb.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountCredentials {
    private String username;
    private String password;
}
