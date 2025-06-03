package src.OpenClosedPrinciple;

public class main {
    public class Main {
        public static void main(String[] args) {
            DiscountCalculator calculator = new DiscountCalculator();

            DiscountStrategy regular = new RegularCustomer();
            DiscountStrategy vip = new VIPCustomer();

            System.out.println("Regular discount: " + calculator.calculateDiscount(regular, 1000)); // 50.0
            System.out.println("VIP discount: " + calculator.calculateDiscount(vip, 1000));       // 200.0
        }
    }

}
