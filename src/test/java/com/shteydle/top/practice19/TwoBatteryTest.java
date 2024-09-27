package com.shteydle.top.practice19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoBatteryTest {

    @Test
    void testTwoTorches() {
        TorchWithTwoBattery torch = new TorchWithTwoBattery();
        torch.switchOnOff();
        torch.switchOnOff();
        torch.switchOnOff();
        torch.switchOnOff();
        assertEquals(4, torch.getChargeBaterry1());
        assertEquals(4, torch.getChargeBaterry2());
    }
    @Test
    void setTwoBatteryTest() {
        TorchWithTwoBattery torch = new TorchWithTwoBattery();
        torch.setBattery(new DuracellBattery());
        assertEquals(50, torch.getChargeBaterry1());
        assertEquals(50, torch.getChargeBaterry2());
    }
}
