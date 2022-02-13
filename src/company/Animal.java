package company;

public class Animal {
    final String species;
    private Double weight;
    boolean life = true;

    public Animal(String species) {
        this.species=species;
        switch (species){
            case "Lion":
                weight=100.0;
                break;
            case "Dog":
                weight=10.0;
                break;
            case "Cat":
                weight=5.0;
                break;
        }
    }

    void feed(){
        if(life) {
            weight += 1.0;
            System.out.println("You feed this "+species);
        }else {
            System.out.println("This "+species+" is dead, you can't feed him");
        }
    }
    void takeForAWalk(){
        if(life) {
            weight -= 0.5;
            System.out.println("You take for a walk "+species);
        }else {
            System.out.println("This "+species+" is dead");
        }
    }
}
