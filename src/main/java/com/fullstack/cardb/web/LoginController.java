package com.fullstack.cardb.web;

import com.fullstack.cardb.domain.AccountCredentials;
import com.fullstack.cardb.service.JwtService;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private JwtService jwt;
    @Autowired
    private AuthenticationManager authenticationManager;

    @RequestMapping(value="/login", method= RequestMethod.POST)
    @CrossOrigin
    public ResponseEntity<?> getToken(@RequestBody AccountCredentials credentials) {
        UsernamePasswordAuthenticationToken creds = new UsernamePasswordAuthenticationToken(
                credentials.getUsername(), credentials.getPassword());
        Authentication auth = authenticationManager.authenticate(creds);

        String jwts = jwt.getToken(auth.getName());
        return ResponseEntity.ok()
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + jwts)
                .header(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "Authorization")
                .build();
    }

}
