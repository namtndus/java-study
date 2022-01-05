package ch06;

public class VIPCustomer extends Customer {

    double saleseRatio;
    String agentID;

/*    public VIPCustomer(){

        bonusdRatio = 0.05;
        saleseRatio = 0.1;
        customerGrade = "VIP";
        System.out.println("VIPCustomer 호출.");

    }*/

    public VIPCustomer(int customerID, String custonmerName){
        super(customerID,custonmerName);

        bonusdRatio = 0.05;
        saleseRatio = 0.1;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price *bonusdRatio;
        price -= (int) price * saleseRatio;
        return price;
    }

    public String getAgentID(){
        return agentID;
    }

}
