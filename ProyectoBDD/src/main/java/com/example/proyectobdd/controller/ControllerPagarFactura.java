package com.example.clonada2.Controller;

import com.example.clonada2.entity.DTOTratamientosPagar;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableIntegerValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import java.net.URL;

import java.util.ResourceBundle;

public class ControllerPagarFactura implements Initializable {

    // Animals is equal to havng a list o tratamientos, the problem is that I cannot change that because then explotes and gives me an error :)
    @FXML
    private TableView<DTOTratamientosPagar> animals;

    @FXML
    private TableColumn<DTOTratamientosPagar, Integer> idCol;

    @FXML
    private TableColumn<DTOTratamientosPagar, String> descripcionCol;

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
    private Label labelFactura;
    @FXML
    private Label labelTotal;

    @FXML
    private Label labelFecha;
    @FXML
    private Label labelPropiertarioId;

    @FXML
    private Label labelNombrePropietario;

    @FXML
    private Label labelDireccion;

    @FXML
    private ComboBox <String> comboBoxMetodoPago;

    @FXML
    private TextField textFieldAbono;

    @FXML
    private Label labelTotalRestante;

    private Integer contadorSaldo;
    private Integer saldoTotalInicial;
    private Integer saldoTotalFaltante;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //setupLabels();
        setupCombox();

        // Those same attributes with simple names are in here, don't change it, it functions like that, this are based on the DTOTratamientos pagar class
        idCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, Integer>("id"));
        descripcionCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, String>("descripcion"));
        estadoCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, String>("estado"));
        nameCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, String>("name"));
        mascotaCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, Integer>("mascota"));
        fechaCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, Date>("fecha"));
        costoCol.setCellValueFactory(new PropertyValueFactory<DTOTratamientosPagar, Integer>("costo"));
        setupTable();

        setupLabels();

        // Aqui lo que se tiene que obtener es toda la info de unsos query




    }

    @FXML
    void submit(ActionEvent event) {
        saldoTotalInicial = 0;
        for(DTOTratamientosPagar paguito: animals.getItems() ) {
            saldoTotalInicial =  (saldoTotalInicial) + (Integer)paguito.getCosto();
        }


        if(this.contadorSaldo == null) {
            this.contadorSaldo = 1;
            saldoTotalFaltante = saldoTotalInicial;
            saldoTotalFaltante = saldoTotalFaltante - Integer.parseInt(textFieldAbono.getText());

        }
        else if(saldoTotalFaltante > 0) {
            saldoTotalFaltante = saldoTotalFaltante - Integer.parseInt(textFieldAbono.getText());
            // aqui se debe hacer un insert a la tabla de infopago con el abono respectivo


        }

        if(saldoTotalFaltante <= 1) {
            System.out.println("Aqui se hace el insert");
        }


        System.out.println("saldo total: " + saldoTotalInicial);
        System.out.println(saldoTotalFaltante);
        labelTotalRestante.setText(String.valueOf(saldoTotalFaltante));
        //ObservableList<DTOTratamientosPagar> currentTableData = animals.getItems();
        /*
        int currentAnimalId = Integer.parseInt(inputId.getText());

        for (DTOTratamientosPagar animal : currentTableData) {
            if(animal.getId() == currentAnimalId) {
                animal.setEstado(inputType.getText());
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
        }*/
    }

    @FXML
    void rowClicked(MouseEvent event) {
        /*/
        DTOTratamientosPagar clickedAnimal = animals.getSelectionModel().getSelectedItem();
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
        // aqui esto se debe llenar con lo que viene de tratamientos por pagar
        // lo que se tiene que cargar es una lista, en vez de hacer todos estos add, se mete la lista por dentro animals
        DTOTratamientosPagar animal0 = new DTOTratamientosPagar(0,"Vivo","Buddy", 24,date,200, "basectomia canina" );
        DTOTratamientosPagar animal1 = new DTOTratamientosPagar(1,"Muerto","Bella",23, date,100, "reanimacion" );
        DTOTratamientosPagar animal2 = new DTOTratamientosPagar(2,"Vivo","Buddy", 24, date,50, "cuidados post operatorios");
        DTOTratamientosPagar animal3 = new DTOTratamientosPagar(3,"Muerto","Bella", 23, date,140, "muerte asistida" );
        animals.getItems().addAll(animal0,animal1,animal2,animal3);
    }

    void setupLabels () {
        labelFactura.setText("<id_factura>");
        labelPropiertarioId.setText(" <id_dueno>");
        labelTotal.setText(" <total_pagar>");
        labelFecha.setText(" <fecha>");
        labelNombrePropietario.setText(" <nombre_propietario>");
        labelDireccion.setText(" <direccion>");

        saldoTotalInicial = 0;
        for(DTOTratamientosPagar paguito: animals.getItems() ) {
            saldoTotalInicial =  (saldoTotalInicial) + (Integer)paguito.getCosto();
        }
        labelTotalRestante.setText(String.valueOf(saldoTotalInicial));


    }
    void setupCombox () {
        ArrayList<String> arregloMetodoPago = new ArrayList<String>(Arrays.asList("TarjetaCredio", "Efectivo", "Cheque"));
        comboBoxMetodoPago.setItems(FXCollections.observableArrayList(arregloMetodoPago));

    }


}
