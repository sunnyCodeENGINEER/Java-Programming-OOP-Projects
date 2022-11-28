import java.util.ArrayList;

public class Headphone {
    private String brand;
    private String model;
    private String[] controls = {"power on", "power off", "volume up", "volume down", "mute"};
    static private boolean mute = false;
    static private int volumeLevel = 10;
    private int batteryLevel = 85;


    Headphone(String brand, String model ) {
        this.brand = brand;
        this.model = model;
        
    }

    static void increaseVolume() {
        volumeLevel++;
    }

    static void muteSpeaker() {
        mute = true;
    }

    static void unmuteSpeaker() {
        mute = false;
    }

    String getInformation() {
        return String.format("This is a %s - %s headphone. It has the following functions %s.\nCurrent Battery Level is %d.\nCurrent Volume Level %d.", brand, model, controls.toString(), batteryLevel, volumeLevel);
    }

    boolean isMuted() {
        return mute;
    }
}
