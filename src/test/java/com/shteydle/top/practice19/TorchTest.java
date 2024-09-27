package com.shteydle.top.practice19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TorchTest {

    @Test
    void switchOn() {
        Torch torch = Factory.createTorch();
        torch.switchOnOff();
        torch.switchOnOff();
        torch.switchOnOff();
        torch.switchOnOff();
        assertEquals(3, torch.getBattery().getChargeAmount());
    }

    @Test
    void outOfCharge() {
        Torch torch = Factory.createTorch();
        for (int i = 0; i < 12; i++) {
            torch.switchOnOff();
        }
        assertTrue(torch.getBattery().getChargeAmount() >= 0);
    }
    @Test
    void outOfChargeDuracell() {
        Torch torch = new Torch(new DuracellBattery());
        for (int i = 0; i < 50; i++) {
            torch.switchOnOff();
        }
        assertEquals(25, torch.getBattery().getChargeAmount());
    }
    @Test
    void outOfChargeRecher() {
        Torch torch = new Torch(new RecherBattery());
        for (int i = 0; i < 50; i++) {
            torch.switchOnOff();
        }
        assertEquals(45, torch.getBattery().printCharge());
    }

    @Test
    void reChargeTest() {
        Torch torch = new Torch(new RecherBattery());
        for (int i = 0; i < 50; i++) {
            torch.switchOnOff();
        }
        torch.getBattery().reCharge(70);
        assertEquals(70, torch.getBattery().printCharge());

    }

}
