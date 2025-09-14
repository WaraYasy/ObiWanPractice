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


/**
 * Controlador de la vista principal para la aplicación StarWarsApp.
 * <p>
 * Gestiona la interacción del usuario con los elementos de la interfaz,
 * permitiendo enviar un mensaje de saludo personalizado o activar un
 * modal especial al ingresar el nombre "Obi Wan".
 * </p>
 *
 * <ul>
 *   <li>Si el usuario ingresa "Obi Wan", se abre un modal especial.</li>
 *   <li>Si se ingresa otro nombre, se muestra un saludo personalizado.</li>
 *   <li>El botón de salida cierra la aplicación.</li>
 * </ul>
 *
 * @author Wara Pacheco
 */
public class HoroconController {
    /** Botón para enviar el mensaje o activar el modal. */
    @FXML
    private Button btnEnviar;

    /** Botón para salir de la aplicación. */
    @FXML
    private Button btnRetirarse;

    /** Campo de texto donde el usuario ingresa su nombre. */
    @FXML
    private TextField txtNombre;

    /** Texto que muestra el saludo personalizado. */
    @FXML
    private Text saludoTitle;

    /**
     * Lógica para el botón de envío. Si el nombre es "Obi Wan", abre un modal especial;
     * en caso contrario, muestra un saludo personalizado.
     *
     * @param event el evento de acción del botón
     */
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
    /**
     * Lógica para el botón de salir. Cierra la aplicación.
     *
     * @param event el evento de acción del botón
     */
    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }

    /**
     * Abre una ventana modal con un mensaje especial cuando el usuario ingresa
     * "Obi Wan" como nombre.
     * <p>
     * El modal utiliza el archivo FXML <code>saludoModal.fxml</code> y aplica los estilos
     * definidos en <code>style.css</code>. La ventana modal bloquea la ventana principal
     * hasta que se cierra.
     * </p>
     */
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
            // Bloquea la ventana principal
            modalStage.initModality(Modality.APPLICATION_MODAL);

            modalStage.showAndWait(); // muestra y espera hasta que se cierre
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
