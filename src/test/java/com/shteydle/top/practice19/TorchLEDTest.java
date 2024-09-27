package com.shteydle.top.practice19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TorchLEDTest {

    @Test
    void printChargeTest() {
        TorchLED torch = new TorchLED();
        assertEquals(210, torch.printCharge());
        assertEquals(70, torch.getBattery().getChargeAmount());
        assertEquals(70, torch.getChargeAmount());
    }

    @Test
    void switchOnOffTorch() {
        TorchLED torch = new TorchLED();

        for (int i = 0; i < 6; i++) {
            torch.switchOnOff();
        }
        BigDecimal bd = new BigDecimal(torch.getChargeAmount());
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        BigDecimal bd2 = new BigDecimal(torch.getChargeBaterry2());
        bd2 = bd2.setScale(2, RoundingMode.HALF_UP);

        assertEquals(69.67, bd.doubleValue());
        assertEquals(69.67, bd2.doubleValue());
    }

    @Test
    void batteryTest() {

        TorchLED torchLED = new TorchLED();

        for (int i = 0; i < 40; i++) {
            torchLED.switchOnOff();
        }
        BigDecimal bd = new BigDecimal(torchLED.getChargeAmount());
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        assertEquals(67.78, bd.doubleValue());

        BigDecimal bd2 = new BigDecimal(torchLED.getChargeBaterry3());
        bd2 = bd2.setScale(2, RoundingMode.HALF_UP);

        torchLED.reChargeBattery2(68.7);
        assertEquals(68.7, torchLED.getChargeBaterry2());


    }
    @Test
    void printTest() {
        TorchLED torch = new TorchLED();
        for (int i = 0; i < 6; i++) {
            torch.switchOnOff();
        }
        BigDecimal bd = new BigDecimal(torch.printCharge());
        bd = bd.setScale(2, RoundingMode.HALF_UP);


        assertEquals(209.0, bd.doubleValue());
    }
}
