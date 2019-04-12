package TD;

import GV.Cooker;
import GV.Refrigerator;
import GV.Сoffeemaker;
import SB.Cloc;
import SB.Сonditioner;

import java.io.*;

public class SmartHome {

    private static String devicesDir = "Devices";

    public Refrigerator refrigerator;
    public WashingMachine washingMachine;
    public Cloc clock;
    public Сonditioner conditioner;
    public Cooker cooker;
    public Сoffeemaker coffeemaker;

    Runnable myRunnable = new Runnable(){
        @Override
        public void run() {
            while (true) {
                try{
                    save();
                    Thread.sleep(30000);
                }
                catch(InterruptedException e){
                    System.out.println("runnable error");
                }
            }
        }
    };

    Thread thread = new Thread(myRunnable);

    public SmartHome() {
        load();
        thread.setDaemon(true);
        thread.start();
    }

    public void load() {
        if(new File(devicesDir + "\\washing.ser").exists()) {
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(devicesDir + "\\washing.ser"))) {
                washingMachine = (WashingMachine) ois.readObject();
                washingMachine.threadCreate();
            }
            catch(Exception ex){
                System.out.println("washing error");
                System.out.println(ex.getMessage());
            }
        }
        else {
            washingMachine = new WashingMachine("WHIRLPOOL", 69, 6, 38, 15, 62.5, 83.7, 59.5, 42.5);
        }

        if(new File(devicesDir + "\\refrigerator.ser").exists()) {
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(devicesDir + "\\refrigerator.ser"))) {
                refrigerator = (Refrigerator) ois.readObject();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        else {
            refrigerator = new Refrigerator("Nord", 500, -4);
        }

        if(new File(devicesDir + "\\clock.ser").exists()) {
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(devicesDir + "\\clock.ser"))) {
                clock = (Cloc) ois.readObject();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        else {
            clock = new Cloc("Alarm", 10);
        }

        if(new File(devicesDir + "\\conditioner.ser").exists()) {
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(devicesDir + "\\conditioner.ser"))) {
                conditioner = (Сonditioner) ois.readObject();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        else {
            conditioner = new Сonditioner("Samsung", 50);
        }

        if(new File(devicesDir + "\\cooker.ser").exists()) {
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(devicesDir + "\\cooker.ser"))) {
                cooker = (Cooker) ois.readObject();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        else {
            cooker = new Cooker("Кухонна плита",40,140);
        }

        if(new File(devicesDir + "\\coffeemaker.ser").exists()) {
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(devicesDir + "\\coffeemaker.ser"))) {
                coffeemaker = (Сoffeemaker) ois.readObject();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        else {
            coffeemaker = new Сoffeemaker("Кавоварка",15);
        }
    }

    public void save() {

        checkDirExists(devicesDir);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(devicesDir + "\\washing.ser")))
        {
            oos.writeObject(washingMachine);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(devicesDir + "\\refrigerator.ser")))
        {
            oos.writeObject(refrigerator);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(devicesDir + "\\clock.ser")))
        {
            oos.writeObject(clock);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(devicesDir + "\\conditioner.ser")))
        {
            oos.writeObject(conditioner);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(devicesDir + "\\cooker.ser")))
        {
            oos.writeObject(cooker);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(devicesDir + "\\coffeemaker.ser")))
        {
            oos.writeObject(coffeemaker);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    private void checkDirExists(String dirName){
        File file = new File(dirName);
        if(!file.exists())
            file.mkdir();
    }

}
