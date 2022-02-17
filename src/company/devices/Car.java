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
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        int sellerCar = 0, buyerCar = 0;
        for (int i = 0; i < seller.garageSize(); i++) {
            if (seller.getCar(i).getValue() == price)
                sellerCar = i;
            else if (i == seller.garageSize() - 1)
                throw new Exception("seller don't have this car");
        }

        for (int i = 0; i < buyer.garageSize(); i++) {
            if (seller.getCar(i) == null) {
                sellerCar = i;
                break;
            } else if (i == buyer.garageSize())
                throw new Exception("buyer don't have space for new car");
        }

        if (buyer.cash < price)
            throw new Exception("buyer don't have cash");

        buyer.cash -= price;
        seller.cash += price;
        buyer.setCar(seller.getCar(sellerCar), buyerCar);
        seller.deleteCar(sellerCar);
        System.out.println(seller + " sold " + buyer.getCar(buyerCar) + " to " + buyer + " for " + price);

    }
}
