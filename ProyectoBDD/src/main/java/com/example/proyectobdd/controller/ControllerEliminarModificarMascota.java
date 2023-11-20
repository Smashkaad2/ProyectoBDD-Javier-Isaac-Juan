package com.example.proyectobdd.controller;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerEliminarModificarMascota {
    @FXML
    private Label labelNombreMascota;
    @FXML
    private Label labelIdMascota;
    @FXML
    private TextField txtFieldNombreMascota;
    @FXML
    private TextArea txtAreaDescripcionMascota;
    @FXML
    private DatePicker datePickerNacimientoMascota;

    @FXML
    protected void onClickGuardar(){}

    @FXML
    protected void onClickEliminar(){}
}