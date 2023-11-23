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

    public static void main(String[] args) {
        launch();
    }
}