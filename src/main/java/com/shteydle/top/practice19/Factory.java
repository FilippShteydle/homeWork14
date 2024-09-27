package com.shteydle.top.practice19;

public class Factory {
    public static Torch createTorch() {
        return new Torch(new SimpleBattery());
    }
}
