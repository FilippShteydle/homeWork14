package com.shteydle.top.practice19;

public class DuracellBattery implements Battery {

    private double chargeAmount;

    public DuracellBattery() {
        setChargeAmount(50);
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
