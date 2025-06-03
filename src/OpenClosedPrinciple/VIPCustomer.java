package src.OpenClosedPrinciple;

public class VIPCustomer implements DiscountStrategy{
    public double getDiscount(double amount) {
        return amount * 0.2;
    }
}
