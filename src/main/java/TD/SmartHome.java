package TD;

import GV.Refrigerator;
import SB.Cloc;
import SB.Сonditioner;

import java.io.*;

public class SmartHome {

    private static String devicesDir = "Devices";

    public Refrigerator refrigerator;
    public WashingMachine washingMachine;
    public Cloc clock;
    public Сonditioner conditioner;

    public SmartHome() {
        load();
    }

    public void load() {
        if(new File(devicesDir + "\\washing.ser").exists()) {
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(devicesDir + "\\washing.ser"))) {
                washingMachine = (WashingMachine) ois.readObject();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        else {
            washingMachine = new WashingMachine("Samsung", 69, 6, 38, 15, 62.5, 83.7, 59.5, 42.5);
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

        clock = new Cloc("Alarm", 10);
        conditioner = new Сonditioner("Samsung", 50);

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

    }

    private void checkDirExists(String dirName){
        File file = new File(dirName);
        if(!file.exists())
            file.mkdir();
    }

}
