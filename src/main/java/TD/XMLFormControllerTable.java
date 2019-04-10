package TD;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class XMLFormControllerTable {

    public static SmartHome smartHome;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane forTable;

    @FXML
    void initialize() {
        forTable.getChildren().add(new GV.tableRefrigerator().getRefrigerators());

    }

}
