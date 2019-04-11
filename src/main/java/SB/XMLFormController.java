package SB;

import TD.SmartHome;
import TD.XMLFormControllerTable;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class XMLFormController {

    public static SmartHome smartHome;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label TextName1;

    @FXML
    private Label TextName2;

    @FXML
    private Label TextName3;

    @FXML
    private Label TextName4;

    @FXML
    private Label TextName6;

    @FXML
    private Label TextName5;


    @FXML
    private JFXButton ButtonAlarm;

    @FXML
    private JFXButton ButtonWashing;

    @FXML
    private JFXButton ButtonCoffe;

    @FXML
    private JFXButton ButtonRefrigerator;

    @FXML
    private JFXButton ButtonStove;

    @FXML
    private JFXButton ButtonСonditioner;

    @FXML
    private JFXButton ButtonTurnoff;

    @FXML
    void initialize() {

    }
    public void btnShowWahsing(ActionEvent actionEvent) throws IOException {
        XMLFormControllerTable.index = 2;
        loadTable("Washing machine");
    }

    public void btnShowAlarm(ActionEvent actionEvent) throws IOException {
        XMLFormControllerTable.index = 1;
        loadTable("Clock");
    }

    public void btnShowRefrigerator(ActionEvent actionEvent) throws IOException {
        XMLFormControllerTable.index = 4;
        loadTable("Refrigerator");
    }

    public void btnShowCoffe(ActionEvent actionEvent) throws IOException {
        XMLFormControllerTable.index = 3;
        loadTable("Coffe machine");
    }

    public void btnShowStove(ActionEvent actionEvent) throws IOException {
        XMLFormControllerTable.index = 5;
        loadTable("Stove");
    }

    public void btnShowСonditioner(ActionEvent actionEvent) throws IOException {
        XMLFormControllerTable.index = 6;
        loadTable("Air conditioning");
    }

    public void btnShowTurnoff(ActionEvent actionEvent){

    }

    private void loadTable(String title) throws IOException {
        if(title == null)
            title = "Table";

        XMLFormControllerTable.smartHome = smartHome;
        Parent root = FXMLLoader.load(getClass().getResource("/forTableFXML.fxml"));
        Scene scene = new Scene(root);
        Stage secondStage = new Stage();
        Stage mainStage = (Stage) ButtonWashing.getScene().getWindow();
        secondStage.setScene(scene);
        secondStage.initOwner(mainStage);
        secondStage.setWidth(750);
        secondStage.setHeight(500);
        secondStage.setTitle(title);
        secondStage.show();
    }

}
