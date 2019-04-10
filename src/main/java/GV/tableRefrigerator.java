package GV;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;


public class tableRefrigerator {
    private TableView<Refrigerator> refrigerators;

    public tableRefrigerator(){
        refrigerators = new TableView<Refrigerator>();
        TableColumn<Refrigerator,String> nameCol = new TableColumn<Refrigerator, String>("Name");
        TableColumn<Refrigerator,String> energyUsingCol = new TableColumn<Refrigerator, String>("EnergyUsing");
        TableColumn<Refrigerator,String> capacityCol = new TableColumn<Refrigerator, String>("Capacity");
        TableColumn<Refrigerator,String> temperatureCol = new TableColumn<Refrigerator, String>("Temperature");
        nameCol.setCellValueFactory(new PropertyValueFactory<Refrigerator, String>("name"));
        energyUsingCol.setCellValueFactory(new PropertyValueFactory<Refrigerator, String>("energyUsing"));
        capacityCol.setCellValueFactory(new PropertyValueFactory<Refrigerator, String>("capacity"));
        temperatureCol.setCellValueFactory(new PropertyValueFactory<Refrigerator, String>("temperature"));
        ObservableList<Refrigerator> list = getRefrigeratorList();
        refrigerators.setItems(list);
        refrigerators.getColumns().addAll(nameCol,energyUsingCol,capacityCol,temperatureCol);
    }

    public TableView<Refrigerator> getRefrigerators(){return this.refrigerators;}

    private ObservableList<Refrigerator> getRefrigeratorList() {

        Refrigerator refrigerator = new Refrigerator("Холодильник",500,-20);

        ObservableList<Refrigerator> list = FXCollections.observableArrayList(refrigerator);
        return list;
    }
}
