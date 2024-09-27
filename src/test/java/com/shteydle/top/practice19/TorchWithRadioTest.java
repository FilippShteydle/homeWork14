package com.shteydle.top.practice19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TorchWithRadioTest {

    @Test
    void switchOnOffRadioAndTorchTest() {
        TorchWithRadio tr = new TorchWithRadio();
        for (int i = 0; i < 4; i++) {
            tr.switchOnOfTorchAndRadio();
        }
        assertEquals(3.33, tr.getChargeBaterry1());
    }

    @Test
    void switchOnOfTorch() {
        TorchWithRadio tr = new TorchWithRadio();
        tr.switchOnOff();
        tr.switchOnOff();
        tr.switchOnOff();
        tr.switchOnOff();
        assertEquals(4, tr.getChargeBaterry1());
    }

    @Test
    void switchOnOffRadio() {
        TorchWithRadio tr = new TorchWithRadio();
        tr.switchOnOffRadio();
        tr.switchOnOffRadio();
        tr.switchOnOffRadio();
        tr.switchOnOffRadio();
        assertEquals(4.33, tr.getChargeBaterry1());
    }

}
