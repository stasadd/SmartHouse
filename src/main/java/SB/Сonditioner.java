package SB;

import java.io.Serializable;
import java.util.Date;

public class Сonditioner implements Serializable {
    private String name;
    private transient Date clocDateNow;
    private transient int tempetature;
    private int energyUsing;
    private int capacity;

    public Сonditioner() {
        name = "";
        clocDateNow = new Date();
        tempetature = 0;
        energyUsing = 0;
        capacity = 0;
    }

    public Сonditioner(String name, int capacity) {
        this.name = name;
        this.clocDateNow = new Date();
        this.tempetature = 0;
        this.energyUsing = 0;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getClocDateNow() {
        return clocDateNow;
    }

    public void setClocDateNow(Date clocDateNow) {
        this.clocDateNow = clocDateNow;
    }

    public int getTempetature() {
        return tempetature;
    }

    public void setTempetature(int tempetature) {
        this.tempetature = tempetature;
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
}
