package com.webapp.model;

/**
 * Created by Ian on 20/10/2017.
 */

public class User {
    public boolean login(String username, String password){
     if(username.equals("admin")&& password.equals("abc123"))
            return true;
    else
            return false;
}
}

