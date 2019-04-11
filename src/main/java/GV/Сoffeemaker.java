package GV;

import java.io.Serializable;

public class Сoffeemaker implements Serializable {
    public String name;
    private int energyUsing;
    private int capacity;
    private boolean isCoffe;

    public Сoffeemaker(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.isCoffe = true;
        this.energyUsing = 0;
    }

    public Сoffeemaker() {
        this.name = "";
        this.energyUsing = 0;
        this.capacity = 0;
        this.isCoffe = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergyUsing() {
        return energyUsing;
    }

    public void setEnergyUsing(int energyUsing) {
        this.energyUsing = energyUsing;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isCoffe() {
        return isCoffe;
    }

    public void setCoffe(boolean coffe) {
        isCoffe = coffe;
    }
}
