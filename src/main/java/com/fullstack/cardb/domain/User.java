package com.fullstack.cardb.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, updatable = false)
    private long id;

    @Column(nullable = false, unique = true)
    @NonNull
    private String username;

    @Column(nullable = false, name = "password")
    @NonNull
    private String pass;

    @Column(nullable = false)
    @NonNull
    private String role;

}
