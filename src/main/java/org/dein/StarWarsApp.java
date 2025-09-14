package org.dein;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación JavaFX "StarWarsApp".
 * <p>
 * Esta clase inicia la aplicación gráfica, cargando la interfaz definida en el archivo FXML
 * <code>horocon.fxml</code> y aplicando los estilos definidos en <code>style.css</code>.
 * </p>
 *
 * <ul>
 *   <li>Deshabilita el redimensionamiento de la ventana principal.</li>
 *   <li>Establece el título de la ventana como "Iniciando la Fuerza…".</li>
 * </ul>
 *
 * <p>
 * Para iniciar la aplicación, utilice el método {@link #main(String[])}.
 * </p>
 *
 * @author Wara Pacheco
 * @version 1.0
 */
public class StarWarsApp extends Application {

    /** Escena principal de la aplicación. */
    private static Scene scene;

    /**
     * Método principal de inicio de la aplicación JavaFX.
     *
     * <p>
     * Carga el archivo FXML <code>horocon.fxml</code>, aplica la hoja de estilos <code>style.css</code>,
     * deshabilita el redimensionamiento y muestra la ventana principal con el título correspondiente.
     * </p>
     *
     * @param stage El escenario principal de la aplicación.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
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
    /**
     * Método para lanzar la aplicación JavaFX.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        launch();
    }

}