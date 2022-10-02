package com.example.schoolsystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public abstract class Person implements System_user{
    private String name;
    private String age;
    private Date DateOfBirth;
    private String address;
    private String gender;
    private String email;
    private String id;
    Search search=new Search();

    public abstract boolean logout() throws IOException;


    public void setName(String name) {

        this.name = name;
    }

    public void setAge(String age ) {

        this.age = age;
    }
    public Date getDateOfBirth() {

        return DateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {

        DateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setEmail(String email) {

        this.email = email;
    }
    public Person (){

    }
    public Person (String name ,int age ,Date DateOfBirth ,String address ,String gender , String email ){

    }

    public String getId(){
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract boolean Login(String name, String password) throws FileNotFoundException;
}
