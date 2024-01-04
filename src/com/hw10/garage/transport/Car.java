package com.hw10.garage.transport;

import com.hw10.garage.LandTrans;
import com.hw10.garage.list.type;

public class Car extends LandTrans {
    private type type;

    public Car(int id, String name, int capacity, int yearEnding, boolean isAvailable) {
        super(id, name, capacity, yearEnding, isAvailable);
        this.type = type.car;
    }

    @Override
    public String toString() {
        return "com.hw10.exam.garage.Car{" +
                "com.hw10.exam.garage.list.type=" + type +
                "} " + super.toString();
    }
}
