package sm.app_calcu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class APP extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(APP.class.getResource("vista.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 517, 621);
        scene.getStylesheets().add(getClass().getResource("/sm/app_calcu/Estilos/botones.css").toExternalForm());
        stage.setResizable(false);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}