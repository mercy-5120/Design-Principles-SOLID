package LiskovSubstitutionPrinciple;

//Follows Liskov Substitution Principle
public interface CoffeeMaker {
    void makeCoffee();
}

class BasicCoffeeMachine implements CoffeeMaker {
    public void makeCoffee() {
        System.out.println("Brewing basic coffee");
    }
}

class FancyCoffeeMachine implements CoffeeMaker {
    public void makeCoffee() {
        if (hasBeans()) {
            System.out.println("Brewing gourmet coffee");
        } else {
            System.out.println("Making nothing (no beans)");
        }
    }

    private boolean hasBeans() {
        return false; // Pretend we're out
    }
}

public class Main {
    public static void serveCoffee(CoffeeMaker maker) {
        maker.makeCoffee(); // Always works safely
    }

    public static void main(String[] args) {
        CoffeeMaker basic = new BasicCoffeeMachine();
        serveCoffee(basic);

        CoffeeMaker fancy = new FancyCoffeeMachine();
        serveCoffee(fancy); // Gracefully handles no beans
    }
}