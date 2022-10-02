package com.example.schoolsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {

    private String Grade;
    ArrayList<Course> Courses=new ArrayList<>();
    ArrayList<Teacher> Teachers=new ArrayList<>();
    File Login = new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\Logins.txt");
    public void setGrade(String grade) {
        Grade = grade;
    }
    public Student(){

    }
    public Student(String id ,String password){

    }

    public ArrayList<Course> getCourses() {
        return Courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        Courses = courses;
    }

    public ArrayList<Teacher> getTeachers() {
        return Teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        Teachers = teachers;
    }
    public String getName() throws FileNotFoundException {
        Scanner s=new Scanner(Login);
        for(int i=0;s.hasNext();i++){
            if(s.next().equals(Logincontroller.getUsername()))
            {
                s.next();

                return s.next()+" "+s.next()+" "+s.next()+" "+s.next();
            }
        }
        return null;
    }
    public String getAge()throws FileNotFoundException {
        Scanner s=new Scanner(Login);
        for (int i=0;s.hasNext();i++){
            if(s.next().equals(Logincontroller.getUsername()))
            {
                for (int j = 0;j<5;j++)
                {
                    s.next();
                }
                return s.next();

            }

        }

        return null;
    }
    public String getGrade()throws FileNotFoundException {
        Scanner s=new Scanner(Login);
        for (int i=0;s.hasNext();i++){
            if(s.next().equals(Logincontroller.getUsername()))
            {
                for (int j = 0;j<6;j++)
                {
                    s.next();
                }
                return s.next();

            }
        }

        return null;
    }
    public String getGender()throws FileNotFoundException {
        Scanner s=new Scanner(Login);
        for (int i=0;s.hasNext();i++){
            if(s.next().equals(Logincontroller.getUsername()))
            {
                for (int j = 0;j<7;j++)
                {
                    s.next();
                }
                return s.next();

            }
        }

        return null;
    }

    public String getEmail()throws FileNotFoundException {
        Scanner s=new Scanner(Login);
        for (int i=0;s.hasNext();i++){
            if(s.next().equals(Logincontroller.getUsername()))
            {
                for (int j = 0;j<8;j++)
                {
                    s.next();
                }
                return s.next();

            }
        }

        return null;
    }

    public ArrayList<Integer> getResults(Scanner s) throws FileNotFoundException {
        ArrayList<Integer> results =new ArrayList<>();
        for (int i=0;s.hasNext();i++)
        {if(s.next().equals(Logincontroller.getUsername()))
        {
            results.add(s.nextInt());
            results.add(s.nextInt());
            results.add(s.nextInt());
        }}
        return results;
    }
    protected String setResGrade(int x)
    {
        if (x>=94) {return "A+";}
        else if (x<94 &&x>=89) {return "A";}
        else if (x<89 &&x>=85) {return "A-";}
        else if (x<85 &&x>=80) {return "B+";}
        else if (x<80 &&x>=75) {return "B";}
        else if (x<75 &&x>=70) {return "B-";}
        else if (x<70 &&x>=65) {return "C";}
        else if (x<65 &&x>=60) {return "D";}
        else {return "F";}
    }
    public Course getTimeTable(Scanner s,String name) throws FileNotFoundException{
        Course course=new Course();
        for (int i=0;s.hasNext();i++){
            if(s.next().equals(Logincontroller.getUsername()))
            {
                course.setName(name);
                course.setCourseCode(s.next());
                course.setCourseTeacher(s.next());
                course.setDay(s.next());
                course.setclass(s.next());
            }


        }
        return course;
    }

    @Override
    public boolean Login(String name,String password) throws FileNotFoundException {
        Scanner scan = new Scanner(Login);
        for (int i = 0; scan.hasNext(); i++) {
            if (scan.next().equals(name) && scan.next().equals(password)) {

                return true;
            }
        }
        return false;
    }

    @Override
    public  boolean logout() throws IOException {
        new Main().changeScene("Login.fxml");

        return false;
    }
}
