package TD;

import java.io.Serializable;

public class WashingMachine implements Serializable {
    private String name;
    private int capacity;
    private int energyUsing;
    private int maxWeightOfThings;
    private int waterUsing;
    private int countOfPrograms;
    private double mashineWeight;
    private double height;
    private double width;
    private double thickness;

    private transient Runnable myRunnable = new Runnable(){
        @Override
        public void run() {
            while (true) {
                try{
                    setEnergyUsing(getCapacity());
                    Thread.sleep(5000);
                }
                catch(InterruptedException e){
                    System.out.println("runnable error");
                }
            }
        }
    };

    public transient Thread thread = new Thread(myRunnable);

    public WashingMachine() {
        this.name = "";
        this.capacity = 0;
        this.energyUsing = 0;
        this.maxWeightOfThings = 0;
        this.waterUsing = 0;
        this.countOfPrograms = 0;
        this.mashineWeight = 0;
        this.height = 0;
        this.width = 0;
        this.thickness = 0;

        thread.setDaemon(true);
        thread.start();
    }

    public WashingMachine(String name, int capacity, int maxWeightOfThings, int waterUsing, int countOfPrograms, double mashineWeight, double height, double width, double thickness) {
        this.name = name;
        this.capacity = capacity;
        this.energyUsing = 0;
        this.maxWeightOfThings = maxWeightOfThings;
        this.waterUsing = waterUsing;
        this.countOfPrograms = countOfPrograms;
        this.mashineWeight = mashineWeight;
        this.height = height;
        this.width = width;
        this.thickness = thickness;

        thread.setDaemon(true);
        thread.start();
    }

    public void threadCreate() {
        myRunnable = new Runnable(){
            @Override
            public void run() {
                while (true) {
                    try{
                        setEnergyUsing(getCapacity());
                        Thread.sleep(5000);
                    }
                    catch(InterruptedException e){
                        System.out.println("runnable error");
                    }
                }
            }
        };

        thread = new Thread(myRunnable);

        thread.setDaemon(true);
        thread.start();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getEnergyUsing() {
        return energyUsing;
    }

    public void setEnergyUsing(int energyUsing) {
        this.energyUsing = energyUsing;
    }

    public int getMaxWeightOfThings() {
        return maxWeightOfThings;
    }

    public void setMaxWeightOfThings(int maxWeightOfThings) {
        this.maxWeightOfThings = maxWeightOfThings;
    }

    public int getWaterUsing() {
        return waterUsing;
    }

    public void setWaterUsing(int waterUsing) {
        this.waterUsing = waterUsing;
    }

    public int getCountOfPrograms() {
        return countOfPrograms;
    }

    public void setCountOfPrograms(int countOfPrograms) {
        this.countOfPrograms = countOfPrograms;
    }

    public double getMashineWeight() {
        return mashineWeight;
    }

    public void setMashineWeight(double mashineWeight) {
        this.mashineWeight = mashineWeight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }


}
