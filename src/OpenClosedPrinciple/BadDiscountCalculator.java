package src.OpenClosedPrinciple;

//Violates the Open/closed principle because every time a new type (e.g., Premium) is added, you must modify the method.
//Violates OCP because it’s not closed for modification.
public class BadDiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.05;
        } else if (customerType.equals("VIP")) {
            return amount * 0.20;
        } else if (customerType.equals("Student")) {
            return amount * 0.15;
        }
        return 0;
    }

    public static void main(String[] args) {
        BadDiscountCalculator calculator = new BadDiscountCalculator();
        System.out.println("Regular Discount: " + calculator.calculateDiscount("Regular", 1000));
        System.out.println("VIP Discount: " + calculator.calculateDiscount("VIP", 1000));
    }
}



