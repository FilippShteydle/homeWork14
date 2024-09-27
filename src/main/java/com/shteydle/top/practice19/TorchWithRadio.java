package com.shteydle.top.practice19;

public class TorchWithRadio implements  IRadio, ITorch {

    private String station;
    private boolean isOn;
    private Battery battery, battery2;
    private double charge;
    private int bulb;

    public TorchWithRadio() {
        battery = new SimpleBattery();
        battery2 = new SimpleBattery();
        bulb = 1;
        charge = 0.67;
        station = "Energy";
    }

    public TorchWithRadio(Battery battery) {
        this.battery = battery;
        battery2 = battery;
        bulb = 1;
        charge = 0.67;
        station = "Energy";
    }

    public void switchOnOfTorchAndRadio() {
        if (battery.getChargeAmount() == 0 && battery2.getChargeAmount() == 0) {
            System.out.println("Battery has no charge.");
            isOn = false;
        } else {
            isOn = !isOn;
            if (isOn) {
                battery.setChargeAmount(battery.getChargeAmount()  - (bulb + charge) / 2);
                battery2.setChargeAmount(battery2.getChargeAmount() - (bulb + charge) / 2);
            }
            String message = isOn ? "Torch is ON, Radio is on, Station is " + station : "Torch is OFF, Radio is OFF";
            System.out.println(message);
        }
    }

    @Override
    public void switchOnOffRadio() {
        if (battery.getChargeAmount() == 0 && !isOn) {
            System.out.println("Battery has no charge.");
            isOn = false;
        } else {
            isOn = !isOn;
            if (isOn) {
                battery.setChargeAmount(battery.getChargeAmount() - charge / 2);
                battery2.setChargeAmount(battery2.getChargeAmount() - charge / 2);
            }
            String message = isOn ? "Radio is on, Station is " + station : "Radio is OFF";
            System.out.println(message);
        }
    }

    @Override
    public String getStation() {
        return station;
    }

    @Override
    public void setStation(String station) {
        this.station = station;
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

    public double getChargeBaterry1() {
        return battery.getChargeAmount();
    }

    public double getChargeBaterry2() {
        return battery2.getChargeAmount();
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
        this.battery = battery;
        battery2 = battery;
    }
}
