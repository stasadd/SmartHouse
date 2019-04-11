import SB.XMLFormController;
import TD.SmartHome;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Start extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/MainWindowFXML.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setWidth(450);
        primaryStage.setHeight(400);
        primaryStage.setTitle("Smart home");
        primaryStage.show();
    }


    public static void main(String[] args) {
        System.out.println("success");
        SmartHome smartHome = new SmartHome();
        XMLFormController.smartHome = smartHome;
        launch(args);
    }
}
