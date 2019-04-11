package TD;

import java.net.URL;
import java.util.ResourceBundle;

import GV.tableRefrigerator;
import SB.tableCloc;
import SB.tableConditioner;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class XMLFormControllerTable {

    public static SmartHome smartHome;
    public static int index;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane forTable;

    @FXML
    void initialize() {

        switch (index) {
            case 1: {
                tableCloc table = new tableCloc(smartHome.clock);
                forTable.setTopAnchor(table.getTable(), 0.0);
                forTable.setLeftAnchor(table.getTable(), 0.0);
                forTable.setRightAnchor(table.getTable(), 0.0);
                forTable.setBottomAnchor(table.getTable(), 0.0);
                forTable.getChildren().add(table.getTable());
                break;
            }
            case 2: {
                tableWashingMachine table = new tableWashingMachine(smartHome.washingMachine);
                forTable.setTopAnchor(table.getTable(), 0.0);
                forTable.setLeftAnchor(table.getTable(), 0.0);
                forTable.setRightAnchor(table.getTable(), 0.0);
                forTable.setBottomAnchor(table.getTable(), 0.0);
                forTable.getChildren().add(table.getTable());
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                tableRefrigerator table = new tableRefrigerator(smartHome.refrigerator);
                forTable.setTopAnchor(table.getTable(), 0.0);
                forTable.setLeftAnchor(table.getTable(), 0.0);
                forTable.setRightAnchor(table.getTable(), 0.0);
                forTable.setBottomAnchor(table.getTable(), 0.0);
                forTable.getChildren().add(table.getTable());
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                tableConditioner table = new tableConditioner(smartHome.conditioner);
                forTable.setTopAnchor(table.getTable(), 0.0);
                forTable.setLeftAnchor(table.getTable(), 0.0);
                forTable.setRightAnchor(table.getTable(), 0.0);
                forTable.setBottomAnchor(table.getTable(), 0.0);
                forTable.getChildren().add(table.getTable());
                break;
            }
        }
    }
}
