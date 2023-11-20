package com.example.proyectobdd.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ControllerBuscarUser {

    @FXML
    private Button buttonEliminar;

    @FXML
    private Button buttonSearch;

    @FXML
    private Button buttonUpdate;

    @FXML
    private ComboBox<?> comboBoxSelectUsuario;

    @FXML
    private ComboBox<?> comboBoxTipoUsuario;

    @FXML
    private Label labelAnswer;

    @FXML
    private Text txtUserInfoTipo;

    @FXML
    private Text txtUsernameSearchInfo;

    @FXML
    private Text txtUsersInfo;

    @FXML
    private TextField txtfieldFindUser;

    @FXML
    private Text txtselectUser;

    @FXML
    void onClickEliminar(ActionEvent event) {

    }

    @FXML
    void onClickSearch(ActionEvent event) {
        labelAnswer.setText("Aqui deberia mostrar a los usuarios que busque");
    }

    @FXML
    void onClickUpdate(ActionEvent event) {

    }

}