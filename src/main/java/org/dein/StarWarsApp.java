package org.dein;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class StarWarsApp extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StarWarsApp.class.getResource(  "fxml/horocon.fxml"));
        scene = new Scene( fxmlLoader.load());
        String url = getClass().getResource("css/style.css").toString();
        scene.getStylesheets().addAll(url);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Iniciando la Fuerza…");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}