package ch06;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusdRatio;

    /*public Customer(){
        customerGrade = "SILVER";
        bonusdRatio = 0.01;

        System.out.println("Customer 호출.");
    }*/

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusdRatio = 0.01;

    }

    public int calcPrice(int price){
        bonusdRatio += price * bonusdRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + " 의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String  getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}