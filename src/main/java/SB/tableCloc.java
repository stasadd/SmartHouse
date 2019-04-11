package SB;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;
import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.util.Date;

public class tableCloc {
    private TableView<Cloc> table;

    public tableCloc(Cloc ref){
        table = new TableView<Cloc>();
        table.setEditable(true);

        TableColumn<Cloc,String> nameCol = new TableColumn<Cloc, String>("Name");
        TableColumn<Cloc,Integer> energyUsingCol = new TableColumn<Cloc, Integer>("EnergyUsing");
        TableColumn<Cloc,Integer> capacityCol = new TableColumn<Cloc, Integer>("Capacity");
        TableColumn<Cloc, Date> DateCol = new TableColumn<Cloc, Date>("Date");
        TableColumn<Cloc, Date> AlarmCol = new TableColumn<Cloc, Date>("Date Alarm");

        nameCol.setCellValueFactory(new PropertyValueFactory<Cloc, String>("name"));
        nameCol.setCellFactory(TextFieldTableCell.<Cloc> forTableColumn());
        nameCol.setMinWidth(200);
        nameCol.setOnEditCommit((CellEditEvent<Cloc, String> event) -> {
            TablePosition<Cloc, String> pos = event.getTablePosition();

            String newFullName = event.getNewValue();

            int row = pos.getRow();
            Cloc сloc = event.getTableView().getItems().get(row);

            сloc.setName(newFullName);
        });

        energyUsingCol.setCellValueFactory(new PropertyValueFactory<Cloc, Integer>("energyUsing"));
        capacityCol.setCellValueFactory(new PropertyValueFactory<Cloc, Integer>("capacity"));


        DateCol.setCellValueFactory(new PropertyValueFactory<Cloc, Date>("clocDateNow"));
        AlarmCol.setCellValueFactory(new PropertyValueFactory<Cloc, Date>("clocAlarm"));

        ObservableList<Cloc> list = FXCollections.observableArrayList(ref);
        table.setItems(list);
        table.getColumns().addAll(nameCol,energyUsingCol,capacityCol,DateCol,AlarmCol);
    }

    public TableView<Cloc> getTable(){return this.table;}
}
