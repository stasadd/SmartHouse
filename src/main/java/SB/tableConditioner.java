package SB;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;

import java.util.Date;

public class tableConditioner  {

    private TableView<Сonditioner> table;

    public tableConditioner(Сonditioner ref){
        table = new TableView<Сonditioner>();
        TableColumn<Сonditioner,String> nameCol = new TableColumn<Сonditioner, String>("Name");
        TableColumn<Сonditioner,Integer> energyUsingCol = new TableColumn<Сonditioner, Integer>("EnergyUsing");
        TableColumn<Сonditioner,Integer> capacityCol = new TableColumn<Сonditioner, Integer>("Capacity");
        TableColumn<Сonditioner, Date> DateCol = new TableColumn<Сonditioner, Date>("Date");
        TableColumn<Сonditioner, Integer> TemperatureCol = new TableColumn<Сonditioner, Integer>("Temperature");


        nameCol.setCellValueFactory(new PropertyValueFactory<Сonditioner, String>("name"));
        nameCol.setCellFactory(TextFieldTableCell.<Сonditioner> forTableColumn());
        nameCol.setMinWidth(200);
        nameCol.setOnEditCommit((TableColumn.CellEditEvent<Сonditioner, String> event) -> {
            TablePosition<Сonditioner, String> pos = event.getTablePosition();

            String newFullName = event.getNewValue();

            int row = pos.getRow();
            Сonditioner сonditioner = event.getTableView().getItems().get(row);

            сonditioner.setName(newFullName);
        });

        energyUsingCol.setCellValueFactory(new PropertyValueFactory<Сonditioner, Integer>("energyUsing"));

        capacityCol.setCellValueFactory(new PropertyValueFactory<Сonditioner, Integer>("capacity"));
        capacityCol.setCellFactory(TextFieldTableCell.<Сonditioner,Integer> forTableColumn(new IntegerStringConverter()));
        capacityCol.setOnEditCommit((TableColumn.CellEditEvent<Сonditioner, Integer> event) -> {
            TablePosition<Сonditioner, Integer> pos = event.getTablePosition();

            Integer newFullName = event.getNewValue();

            int row = pos.getRow();
            Сonditioner сonditioner = event.getTableView().getItems().get(row);

            сonditioner.setCapacity(newFullName);
        });


        DateCol.setCellValueFactory(new PropertyValueFactory<Сonditioner, Date>("clocDateNow"));


        TemperatureCol.setCellValueFactory(new PropertyValueFactory<Сonditioner, Integer>("tempetature"));
        TemperatureCol.setCellFactory(TextFieldTableCell.<Сonditioner,Integer> forTableColumn(new IntegerStringConverter()));
        TemperatureCol.setOnEditCommit((TableColumn.CellEditEvent<Сonditioner, Integer> event) -> {
            TablePosition<Сonditioner, Integer> pos = event.getTablePosition();

            Integer newFullName = event.getNewValue();

            int row = pos.getRow();
            Сonditioner сonditioner = event.getTableView().getItems().get(row);

            сonditioner.setTempetature(newFullName);
        });

        ObservableList<Сonditioner> list = FXCollections.observableArrayList(ref);
        table.setItems(list);
        table.getColumns().addAll(nameCol,energyUsingCol,capacityCol,DateCol,TemperatureCol);
    }

    public TableView<Сonditioner> getTable(){ return this.table; }

}
