package SB;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;

import java.util.Date;

public class tableCloc {
    private TableView<Cloc> refrigerators;

    public tableCloc(Cloc ref){
        refrigerators = new TableView<Cloc>();
        TableColumn<Cloc,String> nameCol = new TableColumn<Cloc, String>("Name");
        TableColumn<Cloc,Integer> energyUsingCol = new TableColumn<Cloc, Integer>("EnergyUsing");
        TableColumn<Cloc,Integer> capacityCol = new TableColumn<Cloc, Integer>("Capacity");
        TableColumn<Cloc, Date> DateCol = new TableColumn<Cloc, Date>("Date");
        TableColumn<Cloc, Date> AlarmCol = new TableColumn<Cloc, Date>("Date Alarm");

        nameCol.setCellValueFactory(new PropertyValueFactory<Cloc, String>("name"));
        energyUsingCol.setCellValueFactory(new PropertyValueFactory<Cloc, Integer>("energyUsing"));
        capacityCol.setCellValueFactory(new PropertyValueFactory<Cloc, Integer>("capacity"));
        DateCol.setCellValueFactory(new PropertyValueFactory<Cloc, Date>("clocDateNow"));
        AlarmCol.setCellValueFactory(new PropertyValueFactory<Cloc, Date>("clocAlarm"));
        ObservableList<Cloc> list = FXCollections.observableArrayList(ref);
        refrigerators.setItems(list);
        refrigerators.getColumns().addAll(nameCol,energyUsingCol,capacityCol,DateCol,AlarmCol);
    }

    public TableView<Cloc> getRefrigerators(){return this.refrigerators;}
}
