package company;

import company.devices.Car;

public class Main {

    public static void main(String[] args) {
        Animal lion = new Animal("Lion");

        lion.feed();
        lion.takeForAWalk();

        Human jaba = new Human();

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.equals(car2));
        System.out.println(car1==car2);

        System.out.println(car1);
        System.out.println(jaba);
        System.out.println(lion);
    }
}
