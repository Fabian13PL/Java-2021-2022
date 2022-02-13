package company;

import company.devices.Car;

public class Human {
    Animal pet = new Animal("Lion");
    private Car car = new Car();

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
    public Car getCar(){
        return car;
    }

    public void setCar(String model, String producer, Double value){
        if(value<salary){
            System.out.println("You bought car");
            car.setValue(value);
        }else if((value/12)<salary){
            System.out.println("You bought car for credit");
            car.setValue(value);
        }else {
            System.out.println("enroll in studies and find a new job or go for a raise");
        }
    }

    public String toString(){
        return pet.toString()+" "+salary+" "+car.toString();
    }
}
