package company.devices;

import company.Human;

public abstract class Car extends Devices {

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String toString() {
        return model + " " + producer + " " + value;
    }

    public abstract void refuel();

    @Override
    void turnOn() {

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getPhone() == null) {
            System.out.println("seller don't have car to sell");
        } else if (buyer.cash < price) {
            System.out.println("buyer don't have cash");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.setCar(seller.getCar());
            seller.setCar(null);
            System.out.println(seller + " sold " + buyer.getCar() + " to " + buyer + " for " + price);
        }
    }
}
