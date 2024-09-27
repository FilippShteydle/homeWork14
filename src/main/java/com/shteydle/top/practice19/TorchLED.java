package com.shteydle.top.practice19;

public class TorchLED implements ITorch, Battery {

    private  boolean isOn;
    private Battery battery, battery2, battery3;
    private double bulb;
    private double chargeAmount;

    public TorchLED() {
        battery = new RecherBattery();
        battery2 = new RecherBattery();
        battery3 = new RecherBattery();
        bulb =  1 / 3d;
    }

    @Override
    public void switchOnOff() {
        if (battery.getChargeAmount() == 0 && battery2.getChargeAmount() == 0 && battery3.getChargeAmount() == 0) {
            System.out.println("Battery has no charge.");
            isOn = false;
        } else {
            isOn = !isOn;
            if (isOn) {
                battery.setChargeAmount(battery.getChargeAmount() - bulb / 3);
                battery2.setChargeAmount(battery2.getChargeAmount() - bulb / 3);
                battery3.setChargeAmount(battery3.getChargeAmount() - bulb / 3);
            }
            String message = isOn ? "Torch is ON" : "Torch is OFF";
            System.out.println(message);
        }
    }

    @Override
    public double getBulb() {
        return bulb;
    }

    @Override
    public Battery getBattery() {
        return battery;
    }

    @Override
    public void setBattery(Battery battery) {
        battery = new RecherBattery();
        battery2 = new RecherBattery();
        battery3 = new RecherBattery();
    }

    @Override
    public void reCharge(double charge) {
        setChargeAmount(charge);
    }
    public void reChargeBattery2(double charge) {
        battery2.setChargeAmount(charge);
    }
    public void reChargeBattery3(double charge) {
        battery3.setChargeAmount(charge);
    }

    @Override
    public double getChargeAmount() {
        return battery.getChargeAmount();
    }

    public double getChargeBaterry2() {
        return battery2.getChargeAmount();
    }
    public double getChargeBaterry3() {
        return battery3.getChargeAmount();
    }

    @Override
    public void setChargeAmount(double chargeAmount) {
        battery.setChargeAmount(chargeAmount);
    }

    @Override
    public double printCharge() {
        return battery.getChargeAmount() + battery2.getChargeAmount() + battery3.getChargeAmount();
    }
}
