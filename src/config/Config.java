package config;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Config {
    
    boolean Debug;

    public Config(boolean debug) {
        this.Debug = debug;
    }
    
    public boolean getDebug() {
        return this.Debug;
    }

    public static Config getConfig() {
        
        File configFile = new File("Config.cfg");
        boolean debug = false;
        try {
            Scanner fileScan = new Scanner(configFile);
                Scanner lineScan = new Scanner(fileScan.nextLine());
                lineScan.next();
                
                if(lineScan.next().toLowerCase().equals("true")) {
                    debug = true;
                }
                
            
                
        } catch (FileNotFoundException e) {
            System.out.println("config file does not exist");
        }
        return new Config(debug);
    }
}
