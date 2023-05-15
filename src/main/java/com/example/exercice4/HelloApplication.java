package com.example.exercice4;

import javafx.application.Application;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

import java.io.IOException;

import static javafx.beans.binding.Bindings.when;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        BorderPane borderPane = new BorderPane();
        Label text1 = new Label("Couleur choisie x fois");
        HBox hb1 = new HBox();
        HBox hb2 = new HBox();
        HBox hb3 = new HBox();

        //borderPane.setTop(text1);
        //borderPane.setBottom(hb1);
        text1.setAlignment(Pos.TOP_CENTER);
        hb1.setAlignment(Pos.BOTTOM_LEFT);
        hb2.setAlignment(Pos.BOTTOM_CENTER);
        hb3.setAlignment(Pos.BOTTOM_RIGHT);

        // Création boutons
        Button b1 = new Button("Vert");
        Button b2 = new Button("Rouge");
        Button b3 = new Button("Bleu");

        // Postionnement boutons
        hb1.getChildren().add(b1);
        hb2.getChildren().add(b2);
        hb3.getChildren().add(b3);

        // Changement de couleur
        when(b1 , MouseEvent.MOUSE_CLICKED) ; {
            hb1.setStyle("-fx-background-color: green");
        }

        when(b2 , MouseEvent.MOUSE_CLICKED) ; {
            hb1.setStyle("-fx-background-color: red");
        }

        when(b3 , MouseEvent.MOUSE_CLICKED) ; {
            hb1.setStyle("-fx-background-color: blue");
        }

        // Ajout du conteneur à la scene
        Scene scene = new Scene(borderPane);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        stage.setScene(scene);
        stage.setWidth(400);
        stage.setHeight(200);
        stage.setTitle("Ex4");

        // Affichage de la fenêtre
        stage.show();

    }

    private void when(Button b1, EventType<MouseEvent> mouseClicked) {
    }

    public static void main(String[] args) {
        launch();
    }
}

