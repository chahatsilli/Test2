package com.example.test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    public Label username;
    public Label password;


    @FXML
    protected void login() {

        try {
            Parent secondScene = FXMLLoader.load(getClass().getResource("dash-view.fxml"));

            Stage secondStage = new Stage();
            secondStage.setTitle("dash-view");
            secondStage.setScene(new Scene(secondScene));
            Stage firstSceneStage = (Stage) username.getScene().getWindow();

            firstSceneStage.close();


            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
