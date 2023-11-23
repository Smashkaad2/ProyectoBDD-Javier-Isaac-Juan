package com.example.proyectobdd.controller;

import com.example.proyectobdd.Aplicacion;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class ControllerVerHistoriaClinica {
    private Aplicacion aplicacion;

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }
    @FXML
    private Label labelNombreMascota;
    @FXML
    private ListView listViewProsedimientosMedicos;
    @FXML
    public void onClickRegresar() {
    }
}
