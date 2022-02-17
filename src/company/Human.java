package company;

import company.creatures.Animal;
import company.devices.Car;
import company.devices.Phone;

public class Human {
    public Double cash;
    Animal pet;
    private Car[] garage;
    private Phone phone;

    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Error");
        } else {
            System.out.println("new data has been marked for the accounting system");
            System.out.println("be sure to pick up the annex to the contract from Mrs. Hania from human resources");
            System.out.println(
                    "ZUS and US already know about the payment change and it makes no sense to hide your income");
            this.salary = salary;
        }
    }

    public void setGarage(int number) {
        garage = new Car[number];
    }

    public Double garageValue() {
        double value = 0;
        if (garage.length > 0) {
            for (int i = 0; i < garage.length; i++) {
                value += garage[i].getValue();
            }
        }
        return value;
    }

    public int garageSize() {
        return garage.length;
    }

    public void sortByYear() {
        if (garage.length > 0) {
            int i = 0, j = 1;
            Car temp = null;
            while (i < garage.length) {
                if (garage[i].getYear() > garage[j].getYear()) {
                    temp = garage[i];
                    garage[i] = garage[j];
                    garage[j] = temp;
                }
                i++;
                j++;
            }
        }
    }

    public void setCar(Car car, int number) {
        if (number >= garage.length)
            System.out.println("worng number");
        else if (garage[number] == null)
            garage[number] = car;
        else
            System.out.println("there is no space in garage");
    }

    public void deleteCar(int number) {
        if (number >= garage.length)
            System.out.println("worng number");
        else if (garage[number] != null)
            garage[number] = null;
        else
            System.out.println("there is no car on this place");
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Car getCar(int number) {
        if (number >= garage.length) {
            System.out.println("worng number");
            return null;
        } else
            return garage[number];
    }

    public Phone getPhone() {
        return phone;
    }

    public String toString() {
        return pet.toString() + " " + salary + " " + garage.toString();
    }

    public Animal getAnimal() {
        return pet;
    }

    public void setAnimal(Animal animal) {
        pet = animal;
    }
}
