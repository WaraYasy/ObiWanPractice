package org.dein;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HoroconController {

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnRetirarse;

    @FXML
    private TextField txtNombre;

    @FXML
    void enviarMensaje(ActionEvent event) {

    }

    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }
}
