package org.dein;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class SaludoController {
    private void cerrarVentana(ActionEvent event) {
        // Obtenemos el Stage de cualquier nodo del evento (por ejemplo, el botón que clickeó)
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
