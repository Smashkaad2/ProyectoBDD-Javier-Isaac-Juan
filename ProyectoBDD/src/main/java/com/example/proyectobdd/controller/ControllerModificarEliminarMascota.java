package com.example.proyectobdd.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerModificarEliminarMascota {
    @FXML
    private Label labelNombreMascota;
    @FXML
    private Label labelId;
    @FXML
    private TextField txtFieldNombre;
    @FXML
    private TextArea txtAreaDescripcion;
    @FXML
    private DatePicker datePickerNacimiento;

    @FXML
    protected void onClickGuardar(){}

    @FXML
    protected void onClickEliminar(){}

    public void onClickRegistrar(ActionEvent actionEvent) {
    }
}