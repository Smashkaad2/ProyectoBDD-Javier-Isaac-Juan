package com.example.clonada2.Controller;

import com.example.clonada2.entity.DTOTratamientosPagar;
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

public class ControllerTratamientosPagar implements Initializable {

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



    public ArrayList<DTOTratamientosPagar> listaAnimalito = new ArrayList<DTOTratamientosPagar>();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Those same attributes with simple names are in here
        idCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, Integer>("id"));
        descripcionCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, String>("descripcion"));
        estadoCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, String>("estado"));
        nameCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, String>("name"));
        mascotaCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, Integer>("mascota"));
        fechaCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, Date>("fecha"));
        costoCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, Integer>("costo"));
        setupTable();
    }

    @FXML

    void submit(ActionEvent event) {
        /*
        ObservableList<DTOTratamientosPagar> currentTableData = animals.getItems();
        int currentAnimalId = Integer.parseInt(inputId.getText());

        for (DTOTratamientosPagar animal : currentTableData) {
            if(animal.getId() == currentAnimalId) {
                animal.setEstado(inputType.getText());
                animal.setDescripcion(inputDescripcion.getText());
                animal.setName(inputName.getText());

                String stringDate = inputFecha.getText();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                LocalDate localDate = LocalDate.parse(stringDate, formatter);
                animal.setFecha(localDate);
                animal.setCosto(Integer.parseInt(inputCosto.getText()));

                animals.setItems(currentTableData);
                animals.refresh();
                break;
            }
        }

         */
    }

    @FXML
    void rowClicked(MouseEvent event) {
        DTOTratamientosPagar clickedAnimal = animals.getSelectionModel().getSelectedItem();


        DTOTratamientosPagar animalAnadir = new DTOTratamientosPagar(
                clickedAnimal.getId(),
                clickedAnimal.getEstado(),
                clickedAnimal.getName(),
                clickedAnimal.getMascota(),
                clickedAnimal.getFecha(),
                clickedAnimal.getCosto(),
                clickedAnimal.getDescripcion()
                );

        System.out.println(
                        clickedAnimal.getId()+ "," +
                clickedAnimal.getEstado() + "," +
                clickedAnimal.getName()+ "," +
                clickedAnimal.getMascota() + "," +
                clickedAnimal.getFecha()+ "," +
                clickedAnimal.getCosto()
        );

        listaAnimalito.add(animalAnadir);


        //DTOTratamientosPagar(int id, String estado, String name, int mascota, LocalDate fecha, int costo)
        /*
        inputId.setText(String.valueOf(clickedAnimal.getId()));
        inputType.setText(String.valueOf(clickedAnimal.getEstado()));
        inputName.setText(String.valueOf(clickedAnimal.getName()));
        inputMascota.setText(String.valueOf(clickedAnimal.getMascota()));
        inputFecha.setText(String.valueOf(clickedAnimal.getFecha()));
        inputCosto.setText(String.valueOf(clickedAnimal.getCosto()));
    */
    }


    private void setupTable(){

        LocalDate date = LocalDate.of(2023, 11, 20);

        // Convert LocalDate to Date
      //  Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        DTOTratamientosPagar animal0 = new DTOTratamientosPagar(0,"Vivo","Buddy", 24,date,200, "basectomia canina" );
        DTOTratamientosPagar animal1 = new DTOTratamientosPagar(1,"Muerto","Bella",23, date,100, "reanimacion" );
        DTOTratamientosPagar animal2 = new DTOTratamientosPagar(2,"Vivo","Buddy", 24, date,50, "cuidados post operatorios");
        DTOTratamientosPagar animal3 = new DTOTratamientosPagar(3,"Muerto","Bella", 23, date,140, "muerte asistidad" );
        animals.getItems().addAll(animal0,animal1,animal2,animal3);
    }

    public ArrayList<DTOTratamientosPagar> obtenerTratamientoPagar() {
        return listaAnimalito;
    }
}
