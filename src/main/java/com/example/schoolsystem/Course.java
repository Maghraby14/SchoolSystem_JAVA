package com.example.schoolsystem;

public class Course {
    private String name;

    private String CourseCode;
    private String CourseTeacher;
    private String Day;
    private double CourseMark;
    private String Class;


    public String getclass() {
        return Class;
    }

    public void setclass(String aClass) {
        Class = aClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public String getCourseTeacher() {
        return CourseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        CourseTeacher = courseTeacher;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public void setCourseMark(double courseMark) {
        CourseMark = courseMark;
    }

    public double getCourseMark() {
        return CourseMark;
    }

    public Course(){

    }

    public Course(String name, String CourseCode){

    }

    public Course(String name, String CourseCode, double CourseMark){

    }

}
