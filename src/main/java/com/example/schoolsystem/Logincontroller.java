package com.example.schoolsystem;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Logincontroller {

        @FXML
        private Label WrongStudentLogin;
        @FXML
        private TextField StudentNumber;
        @FXML
        private PasswordField StudentPassword;
        @FXML
        private Label WrongStaffLogin;
        @FXML
        private TextField StaffNumber;
        @FXML
        private PasswordField StaffPassword;
        @FXML
        private Label WrongPrincipalLogin;
        @FXML
        private TextField PrincipalNumber;
        @FXML
        private PasswordField PrincipalPassword;
        @FXML
        private Label Namefield;
        private static String username;
        private static String password;
        @FXML
        private Button Student ;
        @FXML
        private Button Staff;
        @FXML
        private Button Principle;
        @FXML
        private Button StudentLogin;
        @FXML
        private Button StaffLogin;
        @FXML
        private Button PrincipleLogin;




    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Logincontroller.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Logincontroller.password = password;
    }

    public Logincontroller() throws FileNotFoundException {
    }


    @FXML
        protected void onStudentClick() throws IOException {

            new Main().changeScene("StudentLogin.fxml");
        }
        @FXML
        protected void onStaffClick()throws IOException{
            new Main().changeScene("StaffLogin.fxml");
        }
        @FXML
         protected void onPrincipalClick()throws IOException{
            new Main().changeScene("PrincipalLogin.fxml");
        }
        @FXML
    protected void onStudentLogin() throws IOException {
         Student s = new Student();
            boolean x=s.Login(StudentNumber.getText(),StudentPassword.getText());
            if(x){
                username=StudentNumber.getText().toString();
                password=StudentPassword.getText().toString();
                new Main().changeScene("StudentData.fxml");


            }
            else {
                WrongLogin(WrongStudentLogin);
            }
    }
    @FXML
    protected void onStudentMouse(){
        Student.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outStudentMouse(){
        Student.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onStaffMouse(){
        Staff.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outStaffMouse(){
        Staff.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onPrincipleMouse(){
        Principle.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outPrincipleMouse(){
        Principle.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onSLMouse(){
        StudentLogin.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outSLMouse(){
        StudentLogin.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onSTLMouse(){
        StaffLogin.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outSTLfMouse(){
        StaffLogin.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onPLMouse(){
        PrincipleLogin.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outPLMouse(){
        PrincipleLogin.setStyle("-fx-background-color: #f2a532");
    }





    @FXML
    protected void onStaffLogin() throws IOException {
        Teacher t = new Teacher();
        boolean x=t.Login(StaffNumber.getText(),StaffPassword.getText());
        if(x)
        {
            username=StaffNumber.getText().toString();
            new Main().changeScene("TeacherData.fxml");

        }
        else {
            WrongLogin(WrongStaffLogin);
        }
    }
    @FXML
    protected void onPrincipalLogin() throws IOException {
        Principal p =Principal.getPrincipal("Mohamed Maghraby","1452001");
        boolean x =p.Login(PrincipalNumber.getText(),PrincipalPassword.getText());
        if (x)
        {
            new Main().changeScene("PrincipleData.fxml");

        }
        else {

            WrongLogin(WrongPrincipalLogin);
        }
    }
    @FXML
    protected void WrongLogin(Label l)
    {
        l.setText("Invalid Username or Password");
    }





    }

