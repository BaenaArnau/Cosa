package example.cosa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPrincipalController {
    public class TuControlador {

        /**
         * Botón para cambiar a la pantalla de juego.
         */
        @FXML
        private Button cambiarJuegoButton;

        /**
         * Botón para cambiar a la pantalla de ayuda.
         */
        @FXML
        private Button cambiarAyudaButton;

        /**
         * Botón para cerrar la aplicación.
         */
        @FXML
        private Button cambiarSalirButton;

        /**
         * Cambia a la pantalla de juego al hacer clic en el botón "Cambiar Juego".
         *
         * @param event Evento de acción generado por el clic del usuario.
         * @throws IOException Si hay un error al cargar la interfaz de usuario.
         */
        @FXML
        void cambiarJuego(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tres_en_raya.fxml"));
            Parent root = loader.load();

            // Obtener el controlador de la nueva pantalla
            Controller controller2 = loader.getController();

            // Cambiar la escena actual a la nueva escena de juego
            Scene currentScene = cambiarJuegoButton.getScene();
            Stage stage = (Stage) currentScene.getWindow();
            Scene newScene = new Scene(root);
            stage.setScene(newScene);
        }

        /**
         * Cambia a la pantalla de ayuda al hacer clic en el botón "Cambiar Ayuda".
         *
         * @param event Evento de acción generado por el clic del usuario.
         * @throws IOException Si hay un error al cargar la interfaz de usuario.
         */
        @FXML
        void cambiarAyuda(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ayuda.fxml"));
            Parent root = loader.load();

            // Obtener el controlador de la nueva pantalla de ayuda
            AyudaController controller2 = loader.getController();

            // Cambiar la escena actual a la nueva escena de ayuda
            Scene currentScene = cambiarJuegoButton.getScene();
            Stage stage = (Stage) currentScene.getWindow();
            Scene newScene = new Scene(root);
            stage.setScene(newScene);
        }

        /**
         * Cierra la aplicación al hacer clic en el botón "Salir".
         *
         * @param event Evento de acción generado por el clic del usuario.
         * @throws IOException Si hay un error al cerrar la aplicación.
         */
        @FXML
        void cambiarSalir(ActionEvent event) throws IOException {
            // Obtener la ventana actual y cerrarla
            Stage stage = (Stage) cambiarSalirButton.getScene().getWindow();
            stage.close();
        }
    }
}