package com.example.schoolsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.Scanner;


public class PrincipleDataController {
    @FXML
    private TextField TeacherName;
    @FXML
    private TextField TeacherId;
    @FXML
    private TextField TeacherCourse;
    @FXML
    private TextField TeacherSalary;
    @FXML
    private TextField TeacherEmail;
    @FXML
    private TextField TeacherPassword;
    @FXML
    private TextField StudentName;
    @FXML
    private TextField StudentId;
    @FXML
    private TextField StudentGrade;
    @FXML
    private TextField StudentGender;
    @FXML
    private TextField StudentEmail;
    @FXML
    private TextField StudentPassword;
    @FXML
    private TextField StudentAge;
    @FXML
    private Label AddedStudent;
    @FXML
    private Label AddedTeacher;
    @FXML
    private TextField ReSId;
    @FXML
    private TextField TeId;
    @FXML
    private Button PrincipleStudentRemove;
    @FXML
    private Button PrincipleTeacherRemove;
    @FXML
    private Button PrincipleTeacherAdd;
    @FXML
    private Button PrincipleStudentAdd;
    @FXML
    private Button AddnewStudent;
    @FXML
    private Button Removeastudent;
    @FXML
    private Button AddnewTeacher;
    @FXML
    private Button RemoveaTeacher;
    @FXML
    private Button backtc;
    @FXML
    private Button bachsc;
    @FXML
    private Button backas;
    @FXML
    private Button backat;
    @FXML
    private Button backrs;
    @FXML
    private Button backrt;
    @FXML
    private Button backsi;
    @FXML
    private Button PrincipleTeacher;
    @FXML
    private Button PrincipleStudent;
    @FXML
    private Button PrincipleSchoolAccounts;
    @FXML
    private Button PrincipleLogout;



    protected int getNOS() throws FileNotFoundException {
        int i=0;
        Scanner s = new Scanner(Students);
        while (s.hasNext())
        {
         s.next();

        i++;
        }
        return i/10;
    }
    protected int getNOT() throws FileNotFoundException {
        int i=0;
        Scanner s = new Scanner(Teachers);
        while (s.hasNext())
        {
            s.next();
            i++;
        }
        return i/10;
    }



    File Teachers = new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\Teachers (2).txt");
    File Students = new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\Logins.txt");

    @FXML
    protected void onPrincipleTeacherMouse(){
        PrincipleTeacher.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outPrincipleTeacherMouse(){ PrincipleTeacher.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onPrincipleStudentMouse(){
        PrincipleStudent.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outPrincipleStudentMouse(){ PrincipleStudent.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onPrincipleSchoolAccountsMouse(){ PrincipleSchoolAccounts.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outPrincipleSchoolAccountsMouse(){ PrincipleSchoolAccounts.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onPrincipleLogoutMouse(){ PrincipleLogout.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outPrincipleLogoutMouse(){ PrincipleLogout.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onPrincipleStudentRemoveMouse(){ PrincipleStudentRemove.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outPrincipleStudentRemoveMouse(){ PrincipleStudentRemove.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onPrincipleTeacherRemoveMouse(){ PrincipleTeacherRemove.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outPrincipleTeacherRemoveMouse(){ PrincipleTeacherRemove.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onPrincipleTeacherAddMouse(){ PrincipleTeacherAdd.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outPrincipleTeacherAddMouse(){ PrincipleTeacherAdd.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onPrincipleStudentAddMouse(){ PrincipleStudentAdd.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outPrincipleStudentAddMouse(){ PrincipleStudentAdd.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onAddnewStudentMouse(){ AddnewStudent.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outAddnewStudentMouse(){ AddnewStudent.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onRemoveastudentMouse(){ Removeastudent.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outRemoveastudentMouse(){ Removeastudent.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onAddnewTeacherMouse(){ AddnewTeacher.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outAddnewTeacherMouse(){ AddnewTeacher.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onRemoveaTeacherMouse(){ RemoveaTeacher.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outRemoveaTeacherMouse(){ RemoveaTeacher.setStyle("-fx-background-color: #f2a532");
    }

    @FXML
    protected void onbacktcMouse(){ backtc.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outbacktcMouse(){ backtc.setStyle("-fx-background-color: #000326");}


    @FXML
    protected void onbackscMouse(){ bachsc.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outbackscMouse(){ bachsc.setStyle("-fx-background-color: #000326");}

    @FXML
    protected void onbackasMouse(){ backas.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outbackasMouse(){ backas.setStyle("-fx-background-color: #000326");}


    @FXML
    protected void onbackatMouse(){ backat.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outbackatMouse(){ backat.setStyle("-fx-background-color: #000326");}


    @FXML
    protected void onbackrsMouse(){ backrs.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outbackrsMouse(){ backrs.setStyle("-fx-background-color: #000326");}



    @FXML
    protected void onbackrtMouse(){ backrt.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outbackrtMouse(){ backrt.setStyle("-fx-background-color: #000326");}


    @FXML
    protected void onbacksiMouse(){ backsi.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outbacksiMouse(){ backsi.setStyle("-fx-background-color: #000326");}
    @FXML
    protected void NorBackspace() throws IOException {
        new Main().changeScene("PrincipleData.fxml");
    }
    @FXML
    protected void stuBackspace() throws IOException {
        new Main().changeScene("StudentControl.fxml");
    }
    @FXML
    protected void techBackspace() throws IOException {
        new Main().changeScene("TeacherControl.fxml");
    }


    @FXML
    protected void onTeachersClick() {
        try {
            new Main().changeScene("TeacherControl.fxml");
        } catch (IOException e) {
            e.getMessage();
        }
    }

    @FXML
    protected void onStudentsClick() {
        try {
            new Main().changeScene("StudentControl.fxml");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    protected void onSchoolAccounts() {
        try {
            new Main().changeScene("SchoolInfo.fxml");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    protected void onLogout(){

       try{
           Principal p = Principal.getPrincipal("Mohamed Maghraby", "1452001");
           p.logout();
       }
       catch (IOException e)
       {
           System.out.println(e.getMessage());
       }

    }

    @FXML
    protected void onAddStudent(){
        try{
            new Main().changeScene("AddStudent.fxml");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    protected void onRemoveStudent(){
        try {
            new Main().changeScene("RemoveStudent.fxml");
        }
        catch (IOException e)
        {
            e.getMessage();
        }
    }

    @FXML
    protected void onAddTeacher()  {
       try
       {
           new Main().changeScene("AddTeacher.fxml");
       }
       catch (IOException e)
       {
           System.out.println(e.getMessage());
       }
    }


    @FXML
    protected void onRemoveTeacher()  {
        try
        {
            new Main().changeScene("RemoveTeacher.fxml");
        }
        catch (IOException e)
        {
            e.getMessage();
        }
    }

    @FXML
    protected void onConfirmNewTeacher() {
        try (FileWriter file = new FileWriter(Teachers, true);
             BufferedWriter Buffer = new BufferedWriter(file);
             PrintWriter newtecher = new PrintWriter(Buffer))
        {
            newtecher.println(TeacherId.getText() + " " + TeacherPassword.getText() + " " + TeacherName.getText() + " " + TeacherCourse.getText() + " " + TeacherSalary.getText() + " " + TeacherEmail.getText());
            AddedTeacher.setText("Teacher Added Succesfully!");


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    protected void onConfirmNewStudent() {
        try (FileWriter file = new FileWriter(Students, true);
             BufferedWriter Buffer = new BufferedWriter(file);
             PrintWriter newtecher = new PrintWriter(Buffer)) {
            newtecher.println("\n");
            newtecher.println(Integer.parseInt(StudentId.getText()) + " " + StudentPassword.getText() + " " + StudentName.getText() + " " + Integer.parseInt(StudentAge.getText()) + " " +Integer.parseInt( StudentGrade.getText()) + " " + StudentGender.getText() + " " + StudentEmail.getText() + "\n");

            AddedStudent.setText("Student Added Succesfully!");



        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e)
        {
            AddedStudent.setText("id,age and grade must be integers");
        }
    }

    @FXML
    protected void onRemoveATeacher()  {

        try {

            String ID, record;
            File tempDB = new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\untitled2\\myTempFile.txt");
            tempDB.createNewFile();
            BufferedReader br = new BufferedReader( new FileReader( Teachers ) );
            BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );

            ID =  TeId.getText();

            while( ( record = br.readLine() ) != null ) {
                if( record.contains(ID) )
                    continue;

                bw.write(record);
                bw.flush();
                bw.newLine();
            }

            br.close();
            bw.close();
            Teachers.delete();
            tempDB.renameTo(Teachers);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    protected void onRemoveAStudent() {
       try {
           String ID, record;
           File tempDB = new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\untitled2\\myTempFile.txt");
           tempDB.createNewFile();
           BufferedReader br = new BufferedReader( new FileReader( Students ) );
           BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );

           ID =  ReSId.getText();

           while( ( record = br.readLine() ) != null ) {
               if( record.contains(ID) )
                   continue;

               bw.write(record);
               bw.flush();
               bw.newLine();
           }

           br.close();
           bw.close();
           Students.delete();
           tempDB.renameTo(Students);

       }
       catch (Exception e)
       {
           System.out.println(e.getMessage());
       }
    }



    protected double getTotalRevenue() throws FileNotFoundException {
        Principal p = Principal.getPrincipal("Mohamed Maghraby", "1452001");

        return p.Revenue() * getNOS();
    }

    protected double getTotalCost() throws FileNotFoundException {
        Principal p = Principal.getPrincipal("Mohamed Maghraby", "1452001");

        return p.Cost() * getNOT();
    }


    protected double getProfit() throws FileNotFoundException {
        Principal p = Principal.getPrincipal("Mohamed Maghraby", "1452001");
        return p.getProfit(getTotalRevenue(),getTotalCost());
    }
    @FXML
    private Label StudentInfo;
    @FXML
    private Label TeacherInfo;
    @FXML
    private Label Revenue;
    @FXML
    private Label Cost;
    @FXML
    private Label profit;
    @FXML
    protected void onSchoolInfo() {
       try{ StudentInfo.setText("Number of Students:-"+" "+getNOS()+"\t"+"\t"+getTotalRevenue()+"$");
        TeacherInfo.setText("Number of Teachers:-"+" "+getNOT()+"\t"+"\t"+getTotalCost()+"$");
        Revenue.setText("Total Revenue:-"+" "+getTotalRevenue()+"$");
        Cost.setText("Total Cost:-"+" "+getTotalCost()+"$");
        profit.setText("Profit:-"+" "+getProfit()+"$");}
       catch (FileNotFoundException e)
       {
           System.out.println(e.getMessage());
       }
    }
}







