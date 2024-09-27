package com.shteydle.top.practice19;

public class Torch implements ITorch {
    private  boolean isOn;
    private Battery battery;
    private int bulb;

    public Torch(Battery battery) {
        this.battery = battery;
        bulb = 1;
    }

    public Torch() {
        battery = new SimpleBattery();
        bulb = 1;
    }

    @Override
    public void switchOnOff() {

        if (battery.getChargeAmount() == 0 && !isOn) {
            System.out.println("Battery has no charge.");
            isOn = false;
        } else {
            isOn = !isOn;
            if (isOn) {
                battery.setChargeAmount(battery.getChargeAmount() - bulb);
            }
            String message = isOn ? "Torch is ON" : "Torch is OFF";
            System.out.println(message);
        }
    }
    @Override
    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public Battery getBattery() {
        return battery;
    }

    @Override
    public double getBulb() {
        return bulb;
    }
}
