package company.devices;

public class Car extends Devices{
    private Double value;

    public Double getValue(){
        return value;
    }
    public void setValue(Double value){
        this.value=value;
    }
    public String toString(){
        return model+" "+producer+" "+value;
    }
    @Override
    void turnOn() {

    }
}
