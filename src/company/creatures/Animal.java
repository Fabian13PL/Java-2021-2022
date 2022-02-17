package company.creatures;

import company.Human;
import company.Salleable;

public abstract class Animal implements Salleable, Feedable {
    final String species;
    private Double weight;
    boolean life = true;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "Lion":
                weight = 100.0;
                break;
            case "Dog":
                weight = 10.0;
                break;
            case "Cat":
                weight = 5.0;
                break;
        }
    }

    public void feed() {
        if (life) {
            weight += 1.0;
            System.out.println("You feed this " + species);
        } else {
            System.out.println("This " + species + " is dead, you can't feed him");
        }
    }

    public void feed(double foodWeight) {
        if (life) {
            weight += foodWeight;
            System.out.println("You feed this " + species);
        } else {
            System.out.println("This " + species + " is dead, you can't feed him");
        }
    }

    public void takeForAWalk() {
        if (life) {
            weight -= 0.5;
            System.out.println("You take for a walk " + species);
        } else {
            System.out.println("This " + species + " is dead");
        }
    }

    public String toString() {
        return species + " " + weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getAnimal() == null) {
            System.out.println("seller don't have animal to sell");
        } else if (buyer.cash < price) {
            System.out.println("buyer don't have cash");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.setAnimal(seller.getAnimal());
            seller.setAnimal(null);
            System.out.println(seller + " sold " + buyer.getPhone() + " to " + buyer + " for " + price);
        }
    }
}
