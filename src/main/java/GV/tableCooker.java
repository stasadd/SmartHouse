package GV;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;

public class tableCooker {
    private TableView<Cooker> table;

    public tableCooker(Cooker cook){
        table = new TableView<Cooker>();
        table.setEditable(true);
        TableColumn<Cooker,String> nameCol = new TableColumn<Cooker, String>("Name");
        TableColumn<Cooker,Integer> energyUsingCol = new TableColumn<Cooker, Integer>("EnergyUsing");
        TableColumn<Cooker,Integer> capacityCol = new TableColumn<Cooker, Integer>("Capacity");
        TableColumn<Cooker,Integer> temperatureCol = new TableColumn<Cooker, Integer>("Temperature");
        nameCol.setCellValueFactory(new PropertyValueFactory<Cooker, String>("name"));
        energyUsingCol.setCellValueFactory(new PropertyValueFactory<Cooker, Integer>("energyUsing"));
        capacityCol.setCellValueFactory(new PropertyValueFactory<Cooker, Integer>("capacity"));
        capacityCol.setCellFactory(TextFieldTableCell.<Cooker,Integer> forTableColumn(new IntegerStringConverter()));
        capacityCol.setOnEditCommit((TableColumn.CellEditEvent<Cooker, Integer> event) -> {
            TablePosition<Cooker, Integer> pos = event.getTablePosition();

            Integer capacity = event.getNewValue();

            int row = pos.getRow();
            Cooker coo = event.getTableView().getItems().get(row);

            coo.setCapacity(capacity);
        });
        temperatureCol.setCellValueFactory(new PropertyValueFactory<Cooker, Integer>("temperature"));
        temperatureCol.setCellFactory(TextFieldTableCell.<Cooker,Integer> forTableColumn(new IntegerStringConverter()));
        temperatureCol.setOnEditCommit((TableColumn.CellEditEvent<Cooker, Integer> event) -> {
            TablePosition<Cooker, Integer> pos = event.getTablePosition();

            Integer temperature = event.getNewValue();

            int row = pos.getRow();
            Cooker coo = event.getTableView().getItems().get(row);

            coo.setTemperature(temperature);
        });
        ObservableList<Cooker> list = FXCollections.observableArrayList(cook);
        table.setItems(list);
        table.getColumns().addAll(nameCol,energyUsingCol,capacityCol,temperatureCol);
    }

    public TableView<Cooker> getTable(){return this.table;}
}
