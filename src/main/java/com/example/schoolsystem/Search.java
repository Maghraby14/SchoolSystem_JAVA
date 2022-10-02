package com.example.schoolsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Search {


    File Login = new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\Logins.txt");
    File Course=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\Courses.txt");
    File f2=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\Results.txt");
    File Teachers=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\Teachers (2).txt");
    File MathResults=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\MathResults.txt");

Course course = new Course();


public Search() {}



    public boolean LoginStaff(String Id, String Pass) throws FileNotFoundException {

        Scanner scan = new Scanner(Teachers);
        for (int i = 0; scan.hasNext(); i++) {
            if (scan.next().equals(Id) && scan.next().equals(Pass)) {

                return true;
            }
        }

        return false;
    }


}
