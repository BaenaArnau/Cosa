package example.cosa;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * Metodo que se ejecuta cuando el rpograma inicia
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("menu-principal.fxml"));
        primaryStage.setScene(new Scene(root, 700, 600));
        primaryStage.setTitle("Tres en Raya");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
