package ch02;

public class VIPCustomer extends Customer {

    double saleseRatio;
    String agentID;

    public VIPCustomer(){

        bonusdRatio = 0.05;
        saleseRatio = 0.1;
        customerGrade = "VIP";

    }

    public String getAgentID(){
        return agentID;
    }

}
