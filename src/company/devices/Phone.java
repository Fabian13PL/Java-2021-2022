package company.devices;

import company.Human;

import java.net.URL;
import java.util.List;

public class Phone extends Devices {

    static final String AppAddress = "address";
    static final String AppProtocol = "protocol";
    static final String AppVersion = "1.0";

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    void turnOn() {
        System.out.println("Phone turn on");
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

    public void installAnnApp(String name) {

    }

    public void installAnnApp(String name, String version) {

    }

    public void installAnnApp(String name, String version, String address) {

    }

    public void installAnnApp(List<String> name) {

    }

    public void installAnnApp(URL url) {

    }
}
