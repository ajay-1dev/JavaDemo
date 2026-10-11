package oops;

public class LampClient {
    public static void main(String[] args) {
        //creating the object for Lamp
        Lamp lamp1 = new Lamp();
        lamp1.turnOn();
        System.out.println(lamp1.isOn);
        lamp1.turnoff();
        System.out.println(lamp1.isOn);
    }
}
