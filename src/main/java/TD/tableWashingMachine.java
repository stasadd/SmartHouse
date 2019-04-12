package TD;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;
import javafx.util.converter.DefaultStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class tableWashingMachine {
    private TableView<WashingMachine> table;

    public tableWashingMachine(WashingMachine ref) {
        table = new TableView<WashingMachine>();
        table.setEditable(true);

        TableColumn<WashingMachine,String> nameCol = new TableColumn<WashingMachine, String>("Name");
        TableColumn<WashingMachine,Integer> capacityCol = new TableColumn<WashingMachine, Integer>("Capacity");
        TableColumn<WashingMachine,Integer> energyUsingCol = new TableColumn<WashingMachine, Integer>("EnergyUsing");
        TableColumn<WashingMachine,Integer> maxWeightOfThingsCol = new TableColumn<WashingMachine, Integer>("max weight of things");
        TableColumn<WashingMachine,Integer> waterUsingCol = new TableColumn<WashingMachine, Integer>("water using");
        TableColumn<WashingMachine,Integer> countOfProgramsCol = new TableColumn<WashingMachine, Integer>("count of programs");
        TableColumn<WashingMachine,Double> mashineWeightCol = new TableColumn<WashingMachine, Double>("mashine weight");

        TableColumn<WashingMachine,Double> sizeCol = new TableColumn<WashingMachine, Double>("mashine size");
        TableColumn<WashingMachine,Double> heightCol = new TableColumn<WashingMachine, Double>("height");
        TableColumn<WashingMachine,Double> widthCol = new TableColumn<WashingMachine, Double>("width");
        TableColumn<WashingMachine,Double> thicknessCol = new TableColumn<WashingMachine, Double>("thickness");

        sizeCol.getColumns().addAll(heightCol, widthCol, thicknessCol);

        nameCol.setCellValueFactory(new PropertyValueFactory<WashingMachine, String>("name"));
        nameCol.setCellFactory(TextFieldTableCell.<WashingMachine> forTableColumn());
        nameCol.setMinWidth(200);
        nameCol.setOnEditCommit((TableColumn.CellEditEvent<WashingMachine, String> event) -> {
            TablePosition<WashingMachine, String> pos = event.getTablePosition();

            String newFullName = event.getNewValue();

            int row = pos.getRow();
            WashingMachine washingMachine = event.getTableView().getItems().get(row);

            washingMachine.setName(newFullName);
        });


        capacityCol.setCellValueFactory(new PropertyValueFactory<WashingMachine, Integer>("capacity"));
        capacityCol.setCellFactory(TextFieldTableCell.<WashingMachine,Integer> forTableColumn(new IntegerStringConverter()));
        capacityCol.setOnEditCommit((TableColumn.CellEditEvent<WashingMachine, Integer> event) -> {
            TablePosition<WashingMachine, Integer> pos = event.getTablePosition();

            Integer newFullName = event.getNewValue();

            int row = pos.getRow();
            WashingMachine washingMachine = event.getTableView().getItems().get(row);

            washingMachine.setCapacity(newFullName);
        });

        energyUsingCol.setCellValueFactory(new PropertyValueFactory<WashingMachine, Integer>("energyUsing"));
        energyUsingCol.setCellFactory(TextFieldTableCell.<WashingMachine,Integer> forTableColumn(new IntegerStringConverter()));
        energyUsingCol.setOnEditCommit((TableColumn.CellEditEvent<WashingMachine, Integer> event) -> {
            TablePosition<WashingMachine, Integer> pos = event.getTablePosition();

            Integer newFullName = event.getNewValue();

            int row = pos.getRow();
            WashingMachine washingMachine = event.getTableView().getItems().get(row);

            washingMachine.setEnergyUsing(newFullName);
        });

        maxWeightOfThingsCol.setCellValueFactory(new PropertyValueFactory<WashingMachine, Integer>("maxWeightOfThings"));
        waterUsingCol.setCellValueFactory(new PropertyValueFactory<WashingMachine, Integer>("waterUsing"));
        countOfProgramsCol.setCellValueFactory(new PropertyValueFactory<WashingMachine, Integer>("countOfPrograms"));
        mashineWeightCol.setCellValueFactory(new PropertyValueFactory<WashingMachine, Double>("mashineWeight"));
        heightCol.setCellValueFactory(new PropertyValueFactory<WashingMachine, Double>("height"));
        widthCol.setCellValueFactory(new PropertyValueFactory<WashingMachine, Double>("width"));
        thicknessCol.setCellValueFactory(new PropertyValueFactory<WashingMachine, Double>("thickness"));

        ObservableList<WashingMachine> list = FXCollections.observableArrayList(ref);
        table.setItems(list);
        table.getColumns().addAll(nameCol, capacityCol, energyUsingCol, maxWeightOfThingsCol, waterUsingCol, countOfProgramsCol, mashineWeightCol, sizeCol);
    }

    public TableView<WashingMachine> getTable() {
        return table;
    }

    public static <S> Callback<TableColumn<S,String>, TableCell<S,String>> forTableColumn(DefaultStringConverter defaultStringConverter) {
        return forTableColumn(new DefaultStringConverter());
    }
}
