package src.OpenClosedPrinciple;

public class PremiumCustomer implements  DiscountStrategy{
    public double getDiscount(double amount) {
        return amount * 0.1;
    }
}
