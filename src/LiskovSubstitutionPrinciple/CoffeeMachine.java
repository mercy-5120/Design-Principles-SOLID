package LiskovSubstitutionPrinciple;

//Violates Liskov Substitution Principle
public class CoffeeMachine  {
    public void brewCoffee() {
        System.out.println("Brewing regular coffee");
    }
}

class FancyCoffeeMachine extends CoffeeMachine {
    @Override
    public void brewCoffee() {
        throw new RuntimeException("Out of beans!");
    }
}

public class Main {
    public static void makeCoffee(CoffeeMachine machine) {
        machine.brewCoffee();
    }

    public static void main(String[] args) {
        CoffeeMachine basic = new CoffeeMachine();
        makeCoffee(basic);

        CoffeeMachine fancy = new FancyCoffeeMachine();
        makeCoffee(fancy);
    }
}
{
}
