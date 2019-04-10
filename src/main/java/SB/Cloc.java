package SB;

import java.util.Date;

public class Cloc {
    private String name;
    private Date clocDateNow;
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
        System.out.println("HI");
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
