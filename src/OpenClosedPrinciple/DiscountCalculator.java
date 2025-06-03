package src.OpenClosedPrinciple;

public class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy customer, double amount) {
        return customer.getDiscount(amount);
    }
}

