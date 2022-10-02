package com.example.schoolsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentDataController {


    @FXML
    private Label Field1;
    @FXML
    private Label Field2;
    @FXML
    private Label Field3;
    @FXML
    private Label Midterm1;
    @FXML
    private Label Midterm2;
    @FXML
    private Label Final;
    @FXML
    private Label total;
    @FXML
    private Label Grade;
    @FXML
    private Label CourseCode;
    @FXML
    private Label CourseName;
    @FXML
    private Label CourseTecher;
    @FXML
    private Label CourseClass;
    @FXML
    private Label CourseDay;
    @FXML
    private Button Profile;
    @FXML
    private Button Results;
    @FXML
    private Button Courses;
    @FXML
    private Button Logoutt;
    @FXML
    private Button Studentinfo;
    @FXML
    private Button ViewAccount;
    @FXML
    private Button Mathresult;
    @FXML
    private Button Chemistryresult;
    @FXML
    private Button Biologyresult;
    @FXML
    private Button Englishresult;
    @FXML
    private Button Arabicresult;
    @FXML
    private Button Physicsresult;
    @FXML
    private Button Mathcourse;
    @FXML
    private Button Chemistrycourse;
    @FXML
    private Button Biologycourse;
    @FXML
    private Button Englishcourse;
    @FXML
    private Button Arabiccourse;
    @FXML
    private Button Physicscourse;
    @FXML
    private Button backres;
    @FXML
    private Button backcor;
    @FXML
    private Button backpro;
    File MathResults=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\MathResults.txt");
    File ChemistryResults=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\ChemistryResults.txt");
    File EnglishResults=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\EnglishResults.txt");
    File ArabicResults=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\ArabicResults.txt");
    File PhysicsResults=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\PhysicsResults.txt");
    File BilologyResults=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\BiologyResults.txt");
    File Login = new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\Logins.txt");
    File MathTimetable=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\MathScheduels.txt");
    File ArabicTimetable=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\ArabicScheduels.txt");
    File ChemistryTimetable=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\ChemistrySchedules.txt");
    File BiologyTimetables=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\BiologyScedules.txt");
    File PhysicsTimeTable=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\PhysicsSchedules.txt");
    File EnglishTimeTable=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\EnglishShecdules.txt");
    Search search=new Search();
    Student student=new Student();
    @FXML
    protected void onProfileMouse(){Profile.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outProfileMouse(){Profile.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onResultsMouse(){Results.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outResultsMouse(){Results.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onCoursesMouse(){Courses.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outCoursesMouse(){Courses.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onLogoutMouse(){Logoutt.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outLogoutMouse(){Logoutt.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onStudentInfoMouse(){Studentinfo.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outStudentInfoMouse(){Studentinfo.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onStudentAccountMouse(){ViewAccount.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outStudentAccountMouse(){ViewAccount.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onMathresMouse(){Mathresult.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outMathresMouse(){Mathresult.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onChemresMouse(){Chemistryresult.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outChemresMouse(){Chemistryresult.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onBiologyresMouse(){Biologyresult.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outBiologyresMouse(){Biologyresult.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onPhysicsresMouse(){Physicsresult.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outPhysicsresMouse(){Physicsresult.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onEnglishresMouse(){Englishresult.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outEnglishresMouse(){Englishresult.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onArabicresMouse(){Arabicresult.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outArabicresMouse(){Arabicresult.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onEnglishcouMouse(){Englishcourse.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outEnglishcouMouse(){Englishcourse.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onArabiccouMouse(){Arabiccourse.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outArabiccouMouse(){Arabiccourse.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onMathcouMouse(){Mathcourse.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outMathcouMouse(){Mathcourse.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onPhysicscouMouse(){Physicscourse.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outPhysicscouMouse(){Physicscourse.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onChemcouMouse(){Chemistrycourse.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outChemcouMouse(){Chemistrycourse.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onBiologycouMouse(){Biologycourse.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outBiologycouMouse(){Biologycourse.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onbackspaseresMouse(){backres.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outbackspaseresMouse(){backres.setStyle("-fx-background-color: #000326");}
    @FXML
    protected void onbackspacecouMouse(){backcor.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outbackspacecouMouse(){backcor.setStyle("-fx-background-color: #000326");}
    @FXML
    protected void onbackspaceproMouse(){backpro.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outbackspaceproMouse(){backpro.setStyle("-fx-background-color: #000326");}

    @FXML
    protected void StudentProfile() {
        try {
            new Main().changeScene("StudentProfile.fxml");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
    @FXML
    protected void backspace() {
        try {
            new Main().changeScene("StudentData.fxml");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
    @FXML
    protected void onResultsClick()  {
        try {
            new Main().changeScene("StudentResult.fxml");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    @FXML
    protected void setProfileinfo()  {
        try {

            Student s = new Student();
            Field1.setText("Name:-"+s.getName());
            Field2.setText("Age:-"+s.getAge() +"\t" +"Grade:-"+s.getGrade()+"\t"+s.getGender());
            Field3.setText("Email:-"+s.getEmail());
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
    @FXML
    protected void setAccountinfo(){
        Field1.setText("Username:-"+Logincontroller.getUsername());
        Field2.setText("Password:-"+Logincontroller.getPassword());
    }
    @FXML
    protected void onMathClick()  {
        try{
            ArrayList<Integer> Maths=new ArrayList<>();
            Scanner Math=new Scanner(MathResults) ;
            Maths=student.getResults(Math);
            SetGrades(Maths);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found in The Specified Directory");
        }
        }
    @FXML
    protected void onChemistryClick() {
        try{
            ArrayList<Integer> Chemistry=new ArrayList<>();
            Scanner Chem = new Scanner(ChemistryResults);
            Chemistry=student.getResults(Chem);
            SetGrades(Chemistry);

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found in The Specified Directory");
        }

    }
    @FXML
    protected void onArabicClick()  {
        try {
            ArrayList<Integer> Arabic=new ArrayList<>();
            Scanner Arab = new Scanner(ArabicResults);
            Arabic=student.getResults(Arab);
            SetGrades(Arabic);

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found in The Specified Directory");
        }

    }
    @FXML
    protected void onBiologyClick()  {
        try {
            ArrayList<Integer> Biology=new ArrayList<>();
            Scanner Bio=new Scanner(BilologyResults);
            Biology=student.getResults(Bio);
            SetGrades(Biology);

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found in The Specified Directory");
        }

    }
    @FXML
    protected void onPhysicsClick() {

        try {

            ArrayList<Integer> Physics=new ArrayList<>();
            Scanner physics = new Scanner(PhysicsResults);
            Physics=student.getResults(physics);
            SetGrades(Physics);

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found in The Specified Directory");
        }

    }
    @FXML
    protected void onEnglishClick()  {
        try {
            ArrayList<Integer> English=new ArrayList<>();
            Scanner english=new Scanner(EnglishResults);
            English=student.getResults(english);
            SetGrades(English);

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found in The Specified Directory");
        }

    }
    @FXML
    protected void SetGrades(ArrayList<Integer> v){
       try {
           Midterm1.setText(String.valueOf(v.get(0)));
           Midterm2.setText(String.valueOf(v.get(1)));
           Final.setText(String.valueOf(v.get(2)));
           int x =v.get(0)+v.get(1)+v.get(2);
           total.setText(String.valueOf(v.get(0)+v.get(1)+v.get(2)));
           Grade.setText(student.setResGrade(x));
       }
       catch (IndexOutOfBoundsException e)
       {
           System.out.println("You Exceded The Index of Array");
       }

    }



    @FXML
    protected void onCoursesClick() {
        try {
            new Main().changeScene("StudentCourses.fxml");
        } catch (IOException e) {
            System.out.println("Input doesnt Match");
        }
    }
    @FXML
    protected void onCourseMath()  {
        try {
            Course course=new Course();
            Scanner s = new Scanner(MathTimetable);
            course=student.getTimeTable(s,"Math");
            SetCourse(course);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    protected void onCoursePhysics()  {
       try {
           Course course=new Course();
           Scanner s = new Scanner(PhysicsTimeTable);
           course=student.getTimeTable(s,"Physics");
           SetCourse(course);
       }
       catch (FileNotFoundException e)
       {
           System.out.println(e.getMessage());
       }

    }

    @FXML
    protected void onCourseChemistry()  {
        try {
            Course course=new Course();
            Scanner s = new Scanner(ChemistryTimetable);
            course=student.getTimeTable(s,"Chemistry");
            SetCourse(course);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    protected void onCourseBiology() {
        try {
            Course course=new Course();
            Scanner s = new Scanner(BiologyTimetables);
            course=student.getTimeTable(s,"Biology");
            SetCourse(course);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    protected void onCourseArabic()  {
        try {
            Course course=new Course();
            Scanner s = new Scanner(ArabicTimetable);
            course=student.getTimeTable(s,"Arabic");
            SetCourse(course);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    protected void onCourseEnglish()  {
        try {
            Course course=new Course();
            Scanner s = new Scanner(EnglishTimeTable);
            course=student.getTimeTable(s,"English");
            SetCourse(course);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
    @FXML
    protected void SetCourse(Course c){
        CourseCode.setText("Code:-"+c.getCourseCode());
        CourseClass.setText("Class:-"+c.getclass());
        CourseDay.setText("Day:-"+c.getDay());
        CourseTecher.setText("Teacher:-"+c.getCourseTeacher());
        CourseName.setText("Name:-"+c.getName());
    }
    @FXML
    protected void Logout() {
        try {
            Student s = new Student();
            s.logout();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }


    }
}
