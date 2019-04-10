package TD;

import GV.Refrigerator;

import java.io.File;

public class SmartHome {

    private static String devices = "Devices";

    private WashingMachine washingMachine;
    public Refrigerator refrigerator;

    public SmartHome() {
        refrigerator = new Refrigerator("Nord", 500, -4);


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
