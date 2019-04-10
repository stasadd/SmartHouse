package TD;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class XMLFormControllerTable {

    public static SmartHome smartHome1;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane forTable;

    @FXML
    void initialize() {

        GV.tableRefrigerator tableRefrigerator = new GV.tableRefrigerator(smartHome1.refrigerator);

        forTable.setTopAnchor(tableRefrigerator.getRefrigerators(), 0.0);
        forTable.setLeftAnchor(tableRefrigerator.getRefrigerators(), 0.0);
        forTable.setRightAnchor(tableRefrigerator.getRefrigerators(), 0.0);
        forTable.setBottomAnchor(tableRefrigerator.getRefrigerators(), 0.0);
        forTable.getChildren().add(tableRefrigerator.getRefrigerators());


    }

}
