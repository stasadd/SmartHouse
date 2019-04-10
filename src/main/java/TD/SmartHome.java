package TD;

import GV.Refrigerator;

import java.io.File;

public class SmartHome {

    private static String devices = "Devices";

    private WashingMachine washingMachine;
    private Refrigerator refrigerator;

    public SmartHome() {


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
