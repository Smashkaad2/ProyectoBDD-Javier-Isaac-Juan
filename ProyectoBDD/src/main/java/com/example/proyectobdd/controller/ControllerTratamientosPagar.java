package com.example.proyectobdd.controller;

import com.example.proyectobdd.DTO.DTOTratamientosPagar;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.net.URL;

import java.util.ResourceBundle;

public class ControllerTratamientosPagar {

    // Animals is equal to havng a list o tratamientos, the problem is that I cannot change that because then explotes and gives me an error :)
    @FXML
    private TableView<DTOTratamientosPagar> animals;

    @FXML
    private TableColumn<DTOTratamientosPagar, Integer> idCol;

    @FXML
    private TableColumn<DTOTratamientosPagar, String> estadoCol;

    @FXML
    private TableColumn<DTOTratamientosPagar, String> nameCol;

    @FXML
    private TableColumn<DTOTratamientosPagar, Integer> mascotaCol;

    @FXML
    private TableColumn<DTOTratamientosPagar, Date> fechaCol;

    @FXML
    private TableColumn<DTOTratamientosPagar, Integer> costoCol;

    @FXML
    private TableColumn<DTOTratamientosPagar, String> descripcionCol;
}
