package company.devices;

import java.util.ArrayList;
import java.util.List;

import company.Human;

public abstract class Car extends Devices {

    List<Human> owners = new ArrayList<>();

    public void addOwner(Human owner) {
        owners.add(owner);
    }

    public Human owner() {
        owners.size();
        return owners.get(owners.size() - 1);
    }

    public boolean isThisHumanWasOwner(Human human) {
        for (Human owner : owners) {
            if (owner == human)
                return true;
        }
        return false;
    }

    public boolean sellerAndBuyer(Human seller, Human buyer) {
        for (int i = 0; i < owners.size(); i++) {
            if (seller == owners.get(i)) {
                if (owners.get(i + 1) == buyer) {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    public int howManyOwners() {
        return owners.size();
    }

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

        if (seller.getCar(sellerCar).owner() != seller) {
            throw new Exception("seller is not owner of this car");
        }

        for (int i = 0; i < buyer.garageSize(); i++) {
            if (seller.getCar(i) == null) {
                sellerCar = i;
                break;
            } else if (i == buyer.garageSize())
                throw new Exception("buyer don't have space for new car");
        }

        if (buyer.cash < price) {
            throw new Exception("buyer don't have cash");
        }

        buyer.cash -= price;
        seller.cash += price;
        buyer.setCar(seller.getCar(sellerCar), buyerCar);
        seller.deleteCar(sellerCar);
        buyer.getCar(buyerCar).addOwner(buyer);
        System.out.println(seller + " sold " + buyer.getCar(buyerCar) + " to " + buyer + " for " + price);

    }
}
