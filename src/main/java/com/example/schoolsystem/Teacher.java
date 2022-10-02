package com.example.schoolsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Teacher extends Person{
    File MathResults=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\MathResults.txt");
    File ChemistryResults=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\ChemistryResults.txt");
    File EnglishResults=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\EnglishResults.txt");
    File ArabicResults=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\ArabicResults.txt");
    File PhysicsResults=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\PhysicsResults.txt");
    File BilologyResults=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\BiologyResults.txt");
    File TeacherTimetable=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\TeacherTimetables.txt");
    File Teachers=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\Teachers (2).txt");
    private String Id;
    private String password;
    private double salary;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
    public String getPassword() {
        return password;
    }
    public Teacher(){

    }

    public Teacher(String id, String password){

    }

    public void setPassword(String password) {
        this.password = password;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public FileWriter getFile(String s) throws IOException {
        if(Objects.equals(s, "Math")){
            FileWriter scanmath= new FileWriter(MathResults,true);
            return scanmath;
        }
        else if (Objects.equals(s, "Physics")) {
            FileWriter scanphy = new FileWriter(PhysicsResults,true);
            return scanphy;
        } else if (Objects.equals(s, "English")) {
            FileWriter scaneng=new FileWriter(EnglishResults,true);
            return scaneng;
        }
        else if (Objects.equals(s, "Arabic")) {
            FileWriter scanar=new FileWriter(ArabicResults,true);
            return scanar;
        }
        else if (Objects.equals(s, "Biology")) {
            FileWriter scanbi=new FileWriter(BilologyResults,true);
            return scanbi;
        }
        else if (Objects.equals(s, "Chemistry")) {
            FileWriter scancm=new FileWriter(ChemistryResults,true);
            return scancm;
        }


        return null;
    }
    public String gettimetable(String username) throws FileNotFoundException {
        Scanner s=new Scanner(TeacherTimetable);
        for (int i=0;s.hasNext();i++)
        {
            if (s.next().equals(username))
            {
                return s.nextLine();
            }
        }
        return null;
    }

    @Override
    public boolean Login(String name, String password) throws FileNotFoundException {
        Scanner scan = new Scanner(Teachers);
        for (int i = 0; scan.hasNext(); i++) {
            if (scan.next().equals(name) && scan.next().equals(password)) {
                return true;}
        }

        return false;
    }

    @Override
    public boolean logout() throws IOException {
        new Main().changeScene("Login.fxml");
        return true;
    }





}
