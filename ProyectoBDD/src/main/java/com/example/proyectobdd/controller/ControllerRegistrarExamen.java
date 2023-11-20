package com.example.proyectobdd.controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class ControllerRegistrarExamen implements Initializable {

    @FXML
    private Button botonSubmit;

    @FXML
    private TextField descripcionExamen;

    @FXML
    private ComboBox<String> estadoExamen;

    @FXML
    private DatePicker fechaRegistro;

    @FXML
    private TextField horaRegistro;

    @FXML
    private TextField idMascota;

    @FXML
    private TextField idVeterinario;

    @FXML
    private TextField nombreMascota;

    @FXML
    private TextField nombreVeterinario;

    @FXML
    private ComboBox<String> tipoMascota;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<String> arregloTipoMascota = new ArrayList<String>(Arrays.asList("Dog", "Cat", "Bear")); // esto puede ser una consulta que retorna una lista
        ArrayList<String> arregloEstadoExamen = new ArrayList<String>(Arrays.asList("No iniciado", "En curso", "Finalizado")); // esto puede ser una consulta que retorna una lista
        tipoMascota.setItems(FXCollections.observableArrayList(arregloTipoMascota));
        estadoExamen.setItems(FXCollections.observableArrayList(arregloEstadoExamen));

    }

    @FXML
    private void handelSubmit(ActionEvent event) {
        System.out.println("Submit button clicked");
        getAll();


    }

    public ArrayList<String> getAll() {
        ArrayList<String> allValues = new ArrayList<>();

        String descripcion = descripcionExamen.getText();
        String estado = estadoExamen.getValue();
        String fecha = fechaRegistro.getValue().toString();
        String hora = horaRegistro.getText();
        String idMascotaValue = idMascota.getText();
        String idVeterinarioValue = idVeterinario.getText();
        String nombreMascotaValue = nombreMascota.getText();
        String nombreVeterinarioValue = nombreVeterinario.getText();
        String tipoMascotaValue = tipoMascota.getValue();

        allValues.add(descripcion);
        allValues.add(estado);
        allValues.add(fecha);
        allValues.add(hora);
        allValues.add(idMascotaValue);
        allValues.add(idVeterinarioValue);
        allValues.add(nombreMascotaValue);
        allValues.add(nombreVeterinarioValue);
        allValues.add(tipoMascotaValue);

        System.out.println("All values: " + allValues);
        return allValues;
    }
}
