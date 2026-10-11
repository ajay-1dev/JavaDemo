package oops;

public class Lamp {
    boolean isOn;
    void turnOn(){
        isOn=true;
        System.out.println("Light is turned on");
    }
    void turnoff(){
        isOn=false;
        System.out.println("Light is turned off");
    }
}
