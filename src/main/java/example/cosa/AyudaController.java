package example.cosa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class AyudaController {

    /**
     * Boton que nos permite regresar al menu principal
     */
    public Button salir;

    /**
     * Metodo que se ejecuta cuando clickamos en el boton de salir
     *
     * @param actionEvent
     * @throws IOException
     */
    public void volverAtras(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu-principal.fxml"));
        Parent root = loader.load();

        MenuPrincipalController controller2 = loader.getController();

        Scene currentScene = salir.getScene();
        Stage stage = (Stage) currentScene.getWindow();
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
    }
}
