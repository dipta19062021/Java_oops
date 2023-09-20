// Parent class
class Jungle {
    private double weight;

    public Jungle(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

// Child class
class Lion extends Jungle{
    private String name;

    public Lion(String name, double weight) {
        super(weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void roar() {
        System.out.println(name + " is roaring!");
    }
}

public class Weight{
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 200.5);
        lion.roar();
        System.out.println(lion.getName() + "'s weight is " + lion.getWeight() + " kg");
    }
}
