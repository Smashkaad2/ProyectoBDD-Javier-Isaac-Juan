package com.example.proyectobdd;

import com.example.proyectobdd.controller.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Aplicacion extends Application {
    private Stage primaryStage;
    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("iniciarSesion.fxml"));
        AnchorPane pane = fxmlLoader.load();
        ControllerIniciarSesion controller = fxmlLoader.getController();
        controller.setAplicacion(this);
        Scene scene = new Scene(pane);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void abrirAgendarCita(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("agendarCita.fxml"));
            AnchorPane pane = fxmlLoader.load();
            ControllerAgendarCita controller = fxmlLoader.getController();
            controller.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            System.out.println("MAL");

        }
    }
    public void abrirPagarFactura(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("pagarFactura.fxml"));
            AnchorPane pane = fxmlLoader.load();
            ControllerPagarFactura controller = fxmlLoader.getController();
            controller.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            System.out.println("MAL");

        }
    }

    public void abrirRegistrarUsuario(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("registrarUsuario.fxml"));
            Pane pane = fxmlLoader.load();
            ControllerRegistrarUsuario controller = fxmlLoader.getController();
            controller.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            System.out.println("MAL");

        }
    }

    public void abrirActualizarUser(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("actualizarUser.fxml"));
            Pane pane = fxmlLoader.load();
            ControllerActualizarUser controller = fxmlLoader.getController();
            controller.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            System.out.println("MAL");

        }
    }

    public void abrirBUscarMascota(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("buscarMascota.fxml"));
            AnchorPane pane = fxmlLoader.load();
            ControllerBuscarMascota controller = fxmlLoader.getController();
            controller.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            System.out.println("MAL");

        }
    }
    public void abrirEliminarCuenta(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("eliminarCuenta.fxml"));
            AnchorPane pane = fxmlLoader.load();
            ControllerEliminarCuenta controller = fxmlLoader.getController();
            controller.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            System.out.println("MAL");

        }
    }

    public void abrirModificarEliminarMascota(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("modificarEliminarMascota.fxml"));
            Pane pane = fxmlLoader.load();
            ControllerModificarEliminarMascota controller = fxmlLoader.getController();
            controller.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            System.out.println("MAL");

        }
    }
    public void abrirModificarEliminarUsuarioDuenio(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("modificarEliminarUsuarioDuenio.fxml"));
            AnchorPane pane = fxmlLoader.load();
            ControllerModificarEliminarMascota controller = fxmlLoader.getController();
            controller.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            System.out.println("MAL");

        }
    }
    public void abrirModificarEliminarUsuarioStaff(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("modificarEliminarUsuarioStaff.fxml"));
            Pane pane = fxmlLoader.load();
            ControllerModificarEliminarStaff controller = fxmlLoader.getController();
            controller.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            System.out.println("MAL");

        }
    }
    public void abrirTratamientosPagar(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("tratamientosPagar.fxml"));
            Pane pane = fxmlLoader.load();
            ControllerTratamientosPagar controller = fxmlLoader.getController();
            controller.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            System.out.println("MAL");

        }
    }
    public void abrirVerHistoriaClinica(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("verHistoriaClinica.fxml"));
            AnchorPane pane = fxmlLoader.load();
            ControllerVerHistoriaClinica controller = fxmlLoader.getController();
            controller.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            System.out.println("MAL");

        }
    }
    public void abrirRegistrarExamen(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("registrarExamen.fxml"));
            AnchorPane pane = fxmlLoader.load();
            ControllerRegistrarExamen controller = fxmlLoader.getController();
            controller.setAplicacion(this);
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            System.out.println("MAL");

        }
    }

    public static void main(String[] args) {
        launch();
    }
}