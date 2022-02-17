package company.devices;

import company.Salleable;

public abstract class Devices implements Salleable {
    String model;
    String producer;
    int yearOfProduction;
    Double value;

    public String toString() {
        return model + " " + producer + " " + yearOfProduction;
    }

    abstract void turnOn();

    public int getYear() {
        return yearOfProduction;
    }

}
