package org.dein;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HoroconController {

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnRetirarse;

    @FXML
    private TextField txtNombre;

    @FXML
    private Text saludoTitle;

    @FXML
    void enviarMensaje(ActionEvent event) {
        String nombre = txtNombre.getText();
        if(nombre.equalsIgnoreCase("Obi Wan"))
        {
            saludoTitle.setText("");
            abrirModal();
        }
        else{
            saludoTitle.setText("BIENVENIDX "+ nombre.toUpperCase());

        }
    }

    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void abrirModal() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(StarWarsApp.class.getResource("fxml/saludoModal.fxml"));
            Parent root = fxmlLoader.load();

            Stage modalStage = new Stage();
            modalStage.setTitle("Holocrón Activado");
            Scene escena = new Scene(root);
            String url = getClass().getResource("css/style.css").toString();
            escena.getStylesheets().addAll(url);
            modalStage.setScene(escena);
            // Esto hace que sea modal: bloquea la ventana padre
            modalStage.initModality(Modality.APPLICATION_MODAL);

            modalStage.showAndWait(); // muestra y espera hasta que se cierre
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
