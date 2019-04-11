package GV;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;

public class tableCoffemaker {
    private TableView<Сoffeemaker> table;

    public tableCoffemaker(Сoffeemaker cof){
        table = new TableView<Сoffeemaker>();
        TableColumn<Сoffeemaker,String> nameCol = new TableColumn<Сoffeemaker, String>("Name");
        TableColumn<Сoffeemaker,Integer> energyUsingCol = new TableColumn<Сoffeemaker, Integer>("EnergyUsing");
        TableColumn<Сoffeemaker,Integer> capacityCol = new TableColumn<Сoffeemaker, Integer>("Capacity");
        TableColumn<Сoffeemaker,Boolean> isCoffeCol = new TableColumn<Сoffeemaker, Boolean>("IsCoffe");
        nameCol.setCellValueFactory(new PropertyValueFactory<Сoffeemaker, String>("name"));
        energyUsingCol.setCellValueFactory(new PropertyValueFactory<Сoffeemaker, Integer>("energyUsing"));
        capacityCol.setCellValueFactory(new PropertyValueFactory<Сoffeemaker, Integer>("capacity"));
        isCoffeCol.setCellValueFactory(new PropertyValueFactory<Сoffeemaker, Boolean>("isCoffe"));
        ObservableList<Сoffeemaker> list = FXCollections.observableArrayList(cof);
        table.setItems(list);
        table.getColumns().addAll(nameCol,energyUsingCol,capacityCol,isCoffeCol);
    }

    public TableView<Сoffeemaker> getTable(){return this.table;}

}
