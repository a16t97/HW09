package com.hw10.garage.transport;

import com.hw10.garage.LandTrans;
import com.hw10.garage.list.type;

public class Bike extends LandTrans {
    private type type;

    public Bike(int id, String name, int capacity, int yearEnding, boolean isAvailable) {
        super(id, name, capacity, yearEnding, isAvailable);
        type = type.bike;
    }

    @Override
    public String toString() {
        return "com.hw10.exam.garage.Bike{" +
                "com.hw10.exam.garage.list.type=" + type +
                "} " + super.toString();
    }
}
