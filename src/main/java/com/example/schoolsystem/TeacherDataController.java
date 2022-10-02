package com.example.schoolsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.web.HTMLEditor;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class TeacherDataController {
    ObservableList<String> m = FXCollections.observableArrayList("Math","Physics","English","Arabic","Biology","Chemistry");
    @FXML
    private TextField Midterm1;
    @FXML
    private TextField Midterm2;
    @FXML
    private TextField Final;
    @FXML
    private Label Class1;
    @FXML
    private Label Class2;
    @FXML
    private Label Class3;
    @FXML
    private Label Class4;
    @FXML
    private Label Class5;
    @FXML
    private Label Class6;
    @FXML
    private Label Comment;
    @FXML
    private TextField request;
@FXML
    private TextField StudentNumber;
@FXML
private TextField Subject;
@FXML
private Label Adding;
@FXML
private Button TeacherProfile;
@FXML
private ComboBox mawad;
    @FXML
    private Button TeacherAddGrades;
    @FXML
    private Button TeacherRequest;
    @FXML
    private Button TeacherLogout;

    @FXML
    private Button TeacherRequestHoliday;

    @FXML
    private Button TeacherRequestStudentDiscipline;

    @FXML
    private Button TeacherRequestMeeting;
    @FXML
    private Button TeacherRequestSubmit;
    @FXML
    private Button TeacherAddStudentGrades;
    @FXML
    private Label ConfirmRequest;
    @FXML
            private Button probackspace;
    @FXML
            private Button grabackspace;
    @FXML
            private Button reqbackspace;
File HolidayRequests = new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\HolidayRequests.txt");
File StudentDisipline=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\StudentDisiplineRequests.txt");
File Meeting=new File("C:\\Users\\Mohamed El-maghraby\\IdeaProjects\\SchoolSystem\\MeetingRequests.txt");
@FXML
protected void onTeacherProfileMouse(){
    TeacherProfile.setStyle("-fx-background-color: #2596be");
}
@FXML
protected void outTeacherProfileMouse(){TeacherProfile.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onprobackspaceMouse(){
        probackspace.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outprobackspaceMouse(){probackspace.setStyle("-fx-background-color: #000326");}
    @FXML
    protected void ongrabackspaceMouse(){
        grabackspace.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outgrabackspaceMouse(){grabackspace.setStyle("-fx-background-color: #000326");}
    @FXML
    protected void onreqbackspaceMouse(){
        reqbackspace.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outreqbackspaceeMouse(){reqbackspace.setStyle("-fx-background-color: #000326");}
    @FXML
    protected void onTeacherAddGradesMouse(){
        TeacherAddGrades.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outTeacherAddGradesMouse(){ TeacherAddGrades.setStyle("-fx-background-color: #f2a532");
    }
    @FXML
    protected void onTeacherRequestMouse(){
        TeacherRequest.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outTeacherRequestMouse(){ TeacherRequest.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onTeacherLogoutMouse(){
        TeacherLogout.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outTeacherLogoutMouse(){ TeacherLogout.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onTeacherRequestHolidayMouse(){
        TeacherRequestHoliday.setStyle("-fx-background-color: #2596be");
    }
    @FXML
    protected void outTeacherRequestHolidayMouse(){ TeacherRequestHoliday.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onTeacherRequestStudentDisciplineMouse(){ TeacherRequestStudentDiscipline.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outTeacherRequestMeetingMouse(){ TeacherRequestMeeting.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onTeacherRequestMeetingMouse(){ TeacherRequestMeeting.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outTeacherRequestStudentDisciplineMouse(){ TeacherRequestStudentDiscipline.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onTeacherRequestSubmitMouse(){ TeacherRequestSubmit.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outTeacherRequestSubmitMouse(){ TeacherRequestSubmit.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onTeacherAddStudentGradesMouse(){ TeacherAddStudentGrades.setStyle("-fx-background-color: #2596be");}
    @FXML
    protected void outTeacherAddStudentGradesMouse(){ TeacherAddStudentGrades.setStyle("-fx-background-color: #f2a532");}
    @FXML
    protected void onAddGrades() {

        try {
            new Main().changeScene("AddNewGrades.fxml");
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    @FXML
    protected void onTeacherProfile() {

        try {
            new Main().changeScene("TeacherProfile.fxml");
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    @FXML
    protected void onRequests() {

        try {
            new Main().changeScene("Requests.fxml");
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    @FXML
    protected void onBackspace()  {
    try {
        new Main().changeScene("TeacherData.fxml");
    }
    catch (IOException e)
    {
        System.out.println(e.getMessage());
    }

    }

    @FXML
    protected void onLogout() {

        try {
            Teacher t = new Teacher();
            t.logout();


        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
    @FXML
    protected void onAddGrade()  {
Teacher t = new Teacher();
        try (FileWriter file=t.getFile((String) mawad.getValue());
             BufferedWriter buffer = new BufferedWriter(file);
             PrintWriter write=new PrintWriter(buffer))
        {write.println(StudentNumber.getText()+" "+Integer.parseInt(Midterm1.getText())+" "+Integer.parseInt(Midterm2.getText())+" "+Integer.parseInt(Final.getText()));
        Adding.setText("Student result added Succesfully!");
        Adding.setAlignment(Pos.CENTER);
        }
      catch(IOException e){
        System.out.println(e.getMessage());
        }
        catch (NumberFormatException e)
        {
            Adding.setText("Student Results Are only Numbers Not Letters");
            Adding.setAlignment(Pos.CENTER);
        }
        catch (NullPointerException e)
        {
            Adding.setText("Subject is not setted in the combo box");
            Adding.setAlignment(Pos.CENTER);
        }
    }
@FXML
    protected void oncombo(){
        mawad.setItems(m);

}
@FXML
    protected void OnShowInfo()  {
    try{
        Teacher t = new Teacher();

    String timetable=t.gettimetable(Logincontroller.getUsername());
    Scanner s = new Scanner(timetable);
    for(int i=0;s.hasNext();i++)
    {
        try {
            Class1.setText(s.next());
            Class2.setText(s.next());
            Class3.setText(s.next());
            Class4.setText(s.next());
            Class5.setText(s.next());
            Class6.setText(s.next());
        }
        catch (NoSuchElementException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }}
    catch (FileNotFoundException e)
    {
        System.out.println("TeacherTimetable File is not found in the given directory");
    }



}
@FXML
    protected void onHoliday(){
        Comment.setText("Add a new holiday Request");

}
    @FXML
    protected void onStudentDisipline(){
        Comment.setText("Add a new Student Disiplne Request");
    }
    @FXML
    protected void onMetting(){
        Comment.setText("Add a new Metting Request");
    }
    @FXML
    protected void onSubmit(){
        if(Comment.getText().equals("Add a new holiday Request"))
        {
            try (FileWriter file=new FileWriter(HolidayRequests,true);
                 BufferedWriter buffer = new BufferedWriter(file);
                 PrintWriter write=new PrintWriter(buffer))
            {
                write.println(Logincontroller.getUsername() +" "+ "is requesting a new holiday saying"+" "+request.getText());
                ConfirmRequest.setText("Your request have been submitted Succesfully");
               }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        else if (Comment.getText().equals("Add a new Student Disiplne Request")) {
            try (FileWriter file=new FileWriter(StudentDisipline,true);
                 BufferedWriter buffer = new BufferedWriter(file);
                 PrintWriter write=new PrintWriter(buffer))
            {
                write.println(Logincontroller.getUsername() +" "+ "is requesting a new StudentDisipline saying"+" "+request.getText());
                ConfirmRequest.setText("Your request have been submitted Succesfully");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        else if
        (Comment.getText().equals("Add a new Metting Request")) {
            try (FileWriter file=new FileWriter(Meeting,true);
                 BufferedWriter buffer = new BufferedWriter(file);
                 PrintWriter write=new PrintWriter(buffer))
            {
                write.println(Logincontroller.getUsername() +" "+ "is requesting a new Meeting saying"+" "+request.getText());
                ConfirmRequest.setText("Your request have been submitted Succesfully");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        else {
            ConfirmRequest.setText("Please choose the type of request you want to Send");
        }
    }





}
