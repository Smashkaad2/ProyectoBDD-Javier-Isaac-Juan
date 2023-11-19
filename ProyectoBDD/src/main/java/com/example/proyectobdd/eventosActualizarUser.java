package com.example.proyectobdd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class eventosActualizarUser {

    @FXML
    private Button buttonSubmit;

    @FXML
    private Label labelAnswer;

    @FXML
    private PasswordField passwordFieldConfirmPassword;

    @FXML
    private PasswordField passwordFieldPassword;

    @FXML
    private Text txtConfirmPassword;

    @FXML
    private Text txtConfirmUser;

    @FXML
    private Text txtNewPassword;

    @FXML
    private Text txtNewUser;

    @FXML
    private Text txtUpdateDescription;

    @FXML
    private Text txtUpdateInfo;

    @FXML
    private PasswordField txtfieldConfirmUser;

    @FXML
    private TextField txtfieldUser;

    @FXML
    void onClickSubmit(ActionEvent event) {
        labelAnswer.setText("Account succesfully updated!");
    }

}
