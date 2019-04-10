package TD;

import java.io.Serializable;

public class WashingMachine implements Serializable {
    private String name;
    private int capacity;
    private int energyUsing;


    public WashingMachine() {
        this.name = "";
        this.capacity = 0;
        this.energyUsing = 0;
    }

}
