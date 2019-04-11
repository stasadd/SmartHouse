package GV;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.BooleanStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class tableCoffemaker {
    private TableView<Сoffeemaker> table;

    public tableCoffemaker(Сoffeemaker cof){
        table = new TableView<Сoffeemaker>();
        table.setEditable(true);
        TableColumn<Сoffeemaker,String> nameCol = new TableColumn<Сoffeemaker, String>("Name");
        TableColumn<Сoffeemaker,Integer> energyUsingCol = new TableColumn<Сoffeemaker, Integer>("EnergyUsing");
        TableColumn<Сoffeemaker,Integer> capacityCol = new TableColumn<Сoffeemaker, Integer>("Capacity");
        TableColumn<Сoffeemaker,Boolean> isCoffeCol = new TableColumn<Сoffeemaker, Boolean>("IsCoffe");
        nameCol.setCellValueFactory(new PropertyValueFactory<Сoffeemaker, String>("name"));
        energyUsingCol.setCellValueFactory(new PropertyValueFactory<Сoffeemaker, Integer>("energyUsing"));
        capacityCol.setCellValueFactory(new PropertyValueFactory<Сoffeemaker, Integer>("capacity"));
        capacityCol.setCellFactory(TextFieldTableCell.<Сoffeemaker,Integer> forTableColumn(new IntegerStringConverter()));
        capacityCol.setOnEditCommit((TableColumn.CellEditEvent<Сoffeemaker, Integer> event) -> {
            TablePosition<Сoffeemaker, Integer> pos = event.getTablePosition();

            Integer capacity = event.getNewValue();

            int row = pos.getRow();
            Сoffeemaker cmkr = event.getTableView().getItems().get(row);

            cmkr.setCapacity(capacity);
        });
        isCoffeCol.setCellValueFactory(new PropertyValueFactory<Сoffeemaker, Boolean>("isCoffe"));
        isCoffeCol.setCellFactory(TextFieldTableCell.<Сoffeemaker,Boolean> forTableColumn(new BooleanStringConverter()));
        isCoffeCol.setOnEditCommit((TableColumn.CellEditEvent<Сoffeemaker, Boolean> event) -> {
            TablePosition<Сoffeemaker, Boolean> pos = event.getTablePosition();

            Boolean temperature = event.getNewValue();

            int row = pos.getRow();
            Сoffeemaker cmkr = event.getTableView().getItems().get(row);

            cmkr.setCoffe(temperature);
        });
        ObservableList<Сoffeemaker> list = FXCollections.observableArrayList(cof);
        table.setItems(list);
        table.getColumns().addAll(nameCol,energyUsingCol,capacityCol,isCoffeCol);
    }

    public TableView<Сoffeemaker> getTable(){return this.table;}

}
