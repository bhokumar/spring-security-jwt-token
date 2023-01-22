package com.techindeepth.jwt.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @RequestMapping("hellouser")
    @PreAuthorize("hasAuthority('VIEW_USER')")
    public String getUser() {
        return "Hello User";
    }

    @RequestMapping("helloadmin")
    @PreAuthorize("hasAuthority('VIEW_ADMIN')")
    public String getAdmin() {
        return "Hello Admin";
    }
}
