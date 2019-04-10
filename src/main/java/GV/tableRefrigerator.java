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
        TableColumn<Refrigerator,Integer> energyUsingCol = new TableColumn<Refrigerator, Integer>("EnergyUsing");
        TableColumn<Refrigerator,Integer> capacityCol = new TableColumn<Refrigerator, Integer>("Capacity");
        TableColumn<Refrigerator,Integer> temperatureCol = new TableColumn<Refrigerator, Integer>("Temperature");
        nameCol.setCellValueFactory(new PropertyValueFactory<Refrigerator, String>("name"));
        energyUsingCol.setCellValueFactory(new PropertyValueFactory<Refrigerator, Integer>("energyUsing"));
        capacityCol.setCellValueFactory(new PropertyValueFactory<Refrigerator, Integer>("capacity"));
        temperatureCol.setCellValueFactory(new PropertyValueFactory<Refrigerator, Integer>("temperature"));
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
