package com.shteydle.top.practice19;

public class TorchWithTwoBattery implements ITorch{

    private  boolean isOn;
    private Battery battery, battery2;

    int bulb;

    public TorchWithTwoBattery() {
        battery = new SimpleBattery();
        battery2 = new SimpleBattery();
        bulb = 1;
    }

    public TorchWithTwoBattery(Battery battery) {
        this.battery = battery;
        battery2 = battery;
        bulb = 1;
    }

    @Override
    public void switchOnOff() {
        if (battery.getChargeAmount() == 0 && battery2.getChargeAmount() == 0) {
            System.out.println("Battery has no charge.");
            isOn = false;
        } else {
            isOn = !isOn;
            if (isOn) {
                battery.setChargeAmount(battery.getChargeAmount() - (double) bulb / 2);
                battery2.setChargeAmount(battery2.getChargeAmount() - (double) bulb / 2);
            }
            String message = isOn ? "Torch is ON" : "Torch is OFF";
            System.out.println(message);
        }
    }

    @Override
    public void setBattery(Battery battery) {
        this.battery = battery;
        battery2 = battery;
    }

    @Override
    public double getBulb() {
        return bulb;
    }

    @Override
    public Battery getBattery() {
        return battery;
    }

    public double getChargeBaterry1() {
        return battery.getChargeAmount();
    }
    public double getChargeBaterry2() {
        return battery2.getChargeAmount();
    }
}
