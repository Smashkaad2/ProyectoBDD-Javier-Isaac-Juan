package com.example.proyectobdd.controller;

import com.example.proyectobdd.Aplicacion;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ControllerEliminarCuenta {
    private Aplicacion aplicacion;

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }

    @FXML
    private Button buttonDelete;

    @FXML
    private PasswordField passwordFieldPassword;

    @FXML
    private Text txtDeleteDescription;

    @FXML
    private Text txtDeleteInfo;

    @FXML
    private Text txtPassword;

    @FXML
    private Text txtUser;

    @FXML
    private TextField txtfieldUser;

}