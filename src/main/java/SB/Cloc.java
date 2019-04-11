package SB;

import java.io.Serializable;
import java.util.Date;

public class Cloc implements Serializable {
    private String name;
    private transient Date clocDateNow;
    private Date clocAlarm;
    private int energyUsing;
    private int capacity;

    public Cloc ()
    {
        name = "";
        clocDateNow = new Date();
        clocAlarm = new Date();
        energyUsing = 0;
        capacity = 0;
    }

    public Cloc(String name, int capacity) {
        this.name = name;
        this.clocDateNow = new Date();
        this.clocAlarm = new Date();
        this.energyUsing = 0;
        this.capacity = capacity;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Date getClocDateNow() {return clocDateNow;}

    public void setClocDateNow(Date clocDateNow) {this.clocDateNow = clocDateNow;}

    public Date getClocAlarm() {return clocAlarm;}

    public void setClocAlarm(Date clocAlarm) {this.clocAlarm = clocAlarm;}

    public int getEnergyUsing() {return energyUsing;}

    public void setEnergyUsing(int energyUsing) {this.energyUsing = energyUsing;}

    public int getCapacity() {return capacity;}

    public void setCapacity(int capacity) {this.capacity = capacity;}
}
