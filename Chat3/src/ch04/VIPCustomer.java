package ch03;

public class VIPCustomer extends Customer{

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
        System.out.println("VIPCustomer(int, String) 호출.");
    }

    public String getAgentID(){
        return agentID;
    }

}
