package com.example.proyectobdd.controller;

import com.example.proyectobdd.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ControllerIniciarSesion {
    private Aplicacion aplicacion;

    @FXML
    private PasswordField passwordFieldPassword;

    @FXML
    private Text txtLoginDescription;

    @FXML
    private Text txtLoginInfo;

    @FXML
    private Text txtPassword;

    @FXML
    private Text txtUser;

    @FXML
    private TextField txtfieldUser;

    public void setAplicacion(Aplicacion aplicacion){
        this.aplicacion = aplicacion;
    }

    public void onClickLogin(ActionEvent actionEvent) {
        System.out.println("Login");
        this.aplicacion.abrirPagarFactura();
    }

    public void onClickRegister(ActionEvent actionEvent) {
        aplicacion.abrirRegistrarUsuario();
    }
}