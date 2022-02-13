package company.devices;

public class Car {
    final String model;
    final String producer;
    private Double value;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }
    public Double getValue(){
        return value;
    }
    public void setValue(Double value){
        this.value=value;
    }
    public String toString(){
        return model+" "+producer+" "+value;
    }
}
