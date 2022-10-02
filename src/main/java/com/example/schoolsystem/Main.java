package com.example.schoolsystem;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.fxml.FXMLLoader.load;

public class Main extends Application {
    private static Stage stg;
        @Override
        public void start(Stage stage) throws Exception {
            stg=stage;
            stage.setResizable(false);
            Parent root= load((getClass().getResource("Login.fxml")));
            stage.setTitle("School System");
            stage.setScene(new Scene(root,600,400));
            stage.show();

        }
        public void  changeScene(String fxml)throws IOException{
            Parent pane= load(getClass().getResource(fxml));
            stg.getScene().setRoot(pane);
        }

        public static void main(String[] args) {
            launch();
        }
    }

