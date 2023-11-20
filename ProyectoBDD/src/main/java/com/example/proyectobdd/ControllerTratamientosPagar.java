package com.example.proyectico2.controller;


import com.example.proyectico2.DTO.DTOTratamientoPagar;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class ControllerTratamientosPagar implements Initializable {

    @FXML
    private TableView<DTOTratamientoPagar> tablaTratamientoPagar;

    @FXML
    private TableColumn<DTOTratamientoPagar, String> descripcion;

    @FXML
    private TableColumn<DTOTratamientoPagar, Integer> estado_tratamiento;

    @FXML
    private TableColumn<DTOTratamientoPagar, Date> fecha_tratamiento;

    @FXML
    private TableColumn<DTOTratamientoPagar, Integer> id_mascota;

    @FXML
    private TableColumn<DTOTratamientoPagar, Integer> id_tratamiento;

    private final ObservableList<DTOTratamientoPagar> tratamientoList = FXCollections.observableArrayList();

    // Other variables...

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize columns
        descripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        estado_tratamiento.setCellValueFactory(new PropertyValueFactory<>("estadoTratamiento"));
        fecha_tratamiento.setCellValueFactory(new PropertyValueFactory<>("fechaTratamiento"));
        id_mascota.setCellValueFactory(new PropertyValueFactory<>("idMascota"));
        id_tratamiento.setCellValueFactory(new PropertyValueFactory<>("idTratamiento"));

        // Set items to the table


        // Load data into tratamientoList (populate the ObservableList)
        // You need to implement a method to load data into the tratamientoList.
        loadData();
    }

    // Implement a method to load data into the tratamientoList
    private void loadData() {
        // Add sample data or fetch data from your data source
        tratamientoList.add(new DTOTratamientoPagar("Description 1", 1, new Date(), 101, 201));
        tratamientoList.add(new DTOTratamientoPagar("Description 2", 2, new Date(), 102, 202));
        tablaTratamientoPagar.setItems(tratamientoList);
        // Add more data as needed
    }
}   
