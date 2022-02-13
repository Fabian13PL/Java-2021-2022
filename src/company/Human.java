package company;

public class Human {
    Animal pet = new Animal("Lion");

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
}
