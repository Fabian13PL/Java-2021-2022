package company.devices;

import company.Human;

public class Phone extends Devices {

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    void turnOn() {

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getPhone() == null) {
            System.out.println("seller don't have phone to sell");
        } else if (buyer.cash < price) {
            System.out.println("buyer don't have cash");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.setPhone(seller.getPhone());
            seller.setPhone(null);
            System.out.println(seller + " sold " + buyer.getPhone() + " to " + buyer + " for " + price);
        }
    }
}
