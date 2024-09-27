package com.shteydle.top.practice19;

public class Radio implements IRadio {
    private String station;
    private boolean isOn;
    private Battery battery;
    private double charge;

    public Radio() {
        battery = new SimpleBattery();
        charge = 0.67;
        station = "Energy";
    }

    public Radio(Battery battery) {
        this.battery = battery;
        charge = 0.67;
        station = "Energy";
    }

    @Override
    public void switchOnOffRadio() {

        if (battery.getChargeAmount() == 0 && !isOn) {
            System.out.println("Battery has no charge.");
            isOn = false;
        } else {
            isOn = !isOn;
            if (isOn) {
                battery.setChargeAmount(battery.getChargeAmount() - charge);
            }
            String message = isOn ? "Radio is on, Station is " + station : "Radio is OFF";
            System.out.println(message);
        }
    }

    @Override
    public Battery getBattery() {
        return battery;
    }

    @Override
    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public String getStation() {
        return station;
    }

    @Override
    public void setStation(String station) {
        this.station = station;
    }
}
