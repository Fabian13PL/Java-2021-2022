package company.devices;

public abstract class Devices {
    String model;
    String producer;
    int yearOfProduction;

    public String toString(){
        return model+" "+producer+" "+yearOfProduction;
    }

    abstract void turnOn();

}
