package src.OpenClosedPrinciple;

public class RegularCustomer implements DiscountStrategy{
    public double getDiscount(double amount) {
        return amount * 0.05;
    }
}



