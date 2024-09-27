package com.shteydle.top.practice19;

public class RecherBattery implements Battery {

    private double chargeAmount;

    public RecherBattery() {
        setChargeAmount(70);
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
    public void reCharge(double charge) {
        setChargeAmount(charge);
    }

    @Override
    public double printCharge() {
        System.out.println(getChargeAmount());
        return getChargeAmount();
    }
}
