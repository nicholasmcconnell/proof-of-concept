package com.nickdemos.spring_boot.dtos;

import javax.validation.constraints.NotEmpty;

public class Credentials {

    //Validation
    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    public Credentials(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
