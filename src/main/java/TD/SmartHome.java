package TD;

import GV.Refrigerator;
import SB.Cloc;
import SB.Сonditioner;

import java.io.File;

public class SmartHome {

    private static String devicesDir = "Devices";

    public Refrigerator refrigerator;
    public WashingMachine washingMachine;
    public Cloc clock;
    public Сonditioner conditioner;

    public SmartHome() {
        washingMachine = new WashingMachine("WHIRLPOOL", 69, 6, 38, 15, 62.5, 83.7, 59.5, 42.5);
        refrigerator = new Refrigerator("Nord", 500, -4);
        clock = new Cloc("Alarm", 10);
        conditioner = new Сonditioner("Samsung", 50);
    }

    private void load() {

    }

    private void save() {

    }

    private void checkDirExists(String dirName){
        File file = new File(dirName);
        if(!file.exists())
            file.mkdir();
    }

}
