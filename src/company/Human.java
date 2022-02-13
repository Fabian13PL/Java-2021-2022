package company;

import company.devices.Car;
import company.devices.Phone;

public class Human {
    public Double cash;
    Animal pet = new Animal("Lion");
    private Car car = new Car();
    private Phone phone = new Phone();

    private Double salary;

    public Double getSalary(){
        return salary;
    }
    public void setSalary(Double salary){
        if(salary<0){
            System.out.println("Error");
        }else {
            System.out.println("new data has been marked for the accounting system");
            System.out.println("be sure to pick up the annex to the contract from Mrs. Hania from human resources");
            System.out.println("ZUS and US already know about the payment change and it makes no sense to hide your income");
            this.salary=salary;
        }
    }

    public void setCar(Car car){
        this.car=car;
    }
    public void setPhone(Phone phone){
        this.phone=phone;
    }
    public Car getCar(){
        return car;
    }
    public Phone getPhone(){
        return phone;
    }

    public String toString(){
        return pet.toString()+" "+salary+" "+car.toString();
    }
    public Animal getAnimal() {
        return pet;
    }

    public void setAnimal(Animal animal) {
        pet=animal;
    }
}
