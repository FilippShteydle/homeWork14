package com.shteydle.top.practice19;

public class SimpleBattery implements Battery {

    private double chargeAmount;

    public SimpleBattery() {
        setChargeAmount(5);
    }

    @Override
    public double getChargeAmount() {
        return chargeAmount;
    }

    @Override
    public void setChargeAmount(double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }
    @Override
    public double printCharge() {
        System.out.println("Not function");
        return getChargeAmount();
    }

    @Override
    public void reCharge(double charge) {
        System.out.println("Not function");
    }
}
