package com.example.schoolsystem;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface System_user {
     boolean Login(String username,String Password) throws FileNotFoundException;
    boolean logout() throws IOException;

}
