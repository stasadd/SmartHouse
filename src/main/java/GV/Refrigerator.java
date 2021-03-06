package GV;

import java.io.Serializable;

public class Refrigerator implements Serializable {
    private String name;
    private int energyUsing;
    private int capacity;
    private int temperature;

    public Refrigerator(){
        name = "";
        energyUsing = 0;
        capacity = 0;
        temperature = 0;
    }

    public Refrigerator(String name, int capacity, int temperature){
        this.name = name;
        this.capacity = capacity;
        this.temperature = temperature;
        this.energyUsing = 0;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getEnergyUsing(){
        return energyUsing;
    }
    public void setEnergyUsing(int energyUsing){
        this.energyUsing = energyUsing;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getTemperature(){
        return temperature;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
}
