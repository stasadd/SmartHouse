package GV;

import SB.Cloc;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;


public class tableRefrigerator {
    private TableView<Refrigerator> table;

    public tableRefrigerator(Refrigerator ref){
        table = new TableView<Refrigerator>();
        table.setEditable(true);
        TableColumn<Refrigerator,String> nameCol = new TableColumn<Refrigerator, String>("Name");
        TableColumn<Refrigerator,Integer> energyUsingCol = new TableColumn<Refrigerator, Integer>("EnergyUsing");
        TableColumn<Refrigerator,Integer> capacityCol = new TableColumn<Refrigerator, Integer>("Capacity");
        TableColumn<Refrigerator,Integer> temperatureCol = new TableColumn<Refrigerator, Integer>("Temperature");
        nameCol.setCellValueFactory(new PropertyValueFactory<Refrigerator, String>("name"));
        energyUsingCol.setCellValueFactory(new PropertyValueFactory<Refrigerator, Integer>("energyUsing"));
        capacityCol.setCellValueFactory(new PropertyValueFactory<Refrigerator, Integer>("capacity"));
        capacityCol.setCellFactory(TextFieldTableCell.<Refrigerator,Integer> forTableColumn(new IntegerStringConverter()));
        capacityCol.setOnEditCommit((TableColumn.CellEditEvent<Refrigerator, Integer> event) -> {
            TablePosition<Refrigerator, Integer> pos = event.getTablePosition();

            Integer capacity = event.getNewValue();

            int row = pos.getRow();
            Refrigerator refr = event.getTableView().getItems().get(row);

            refr.setCapacity(capacity);
        });
        temperatureCol.setCellValueFactory(new PropertyValueFactory<Refrigerator, Integer>("temperature"));
        temperatureCol.setCellFactory(TextFieldTableCell.<Refrigerator,Integer> forTableColumn(new IntegerStringConverter()));
        temperatureCol.setOnEditCommit((TableColumn.CellEditEvent<Refrigerator, Integer> event) -> {
            TablePosition<Refrigerator, Integer> pos = event.getTablePosition();

            Integer temperature = event.getNewValue();

            int row = pos.getRow();
            Refrigerator refr = event.getTableView().getItems().get(row);

            refr.setTemperature(temperature);
        });
        ObservableList<Refrigerator> list = FXCollections.observableArrayList(ref);
        table.setItems(list);
        table.getColumns().addAll(nameCol,energyUsingCol,capacityCol,temperatureCol);
    }

    public TableView<Refrigerator> getTable(){return this.table;}
}
