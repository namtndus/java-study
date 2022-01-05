package ch06;

public class GoldCustomer extends Customer{

    double salseRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        salseRatio = 0.1;
        bonusdRatio = 0.02;
        customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusdRatio;
        return price - (int)(price * salseRatio);
        
    }
}
