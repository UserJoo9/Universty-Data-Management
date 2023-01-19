package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
   private static Stage stg1;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stg1 = primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("DTU Data Management System");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg1.getScene().setRoot(pane);
    }

    public static void main(String[] args) {

        launch(args);

    }
}
