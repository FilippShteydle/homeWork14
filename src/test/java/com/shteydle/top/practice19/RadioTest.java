package com.shteydle.top.practice19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void chargeRadio() {
        Radio radio = new Radio();
        radio.switchOnOffRadio();
        radio.switchOnOffRadio();
        radio.switchOnOffRadio();
        radio.switchOnOffRadio();
        assertEquals(3.66, radio.getBattery().getChargeAmount());
    }
    @Test
    void setStationTest() {
        Radio radio = new Radio();
        radio.setStation("Hit FM");
        assertEquals("Hit FM", radio.getStation());
    }

    @Test
    void radioSetBattery() {
        Radio radio = new Radio();
        radio.setBattery(new RecherBattery());
        assertEquals(70, radio.getBattery().getChargeAmount());
    }
}
