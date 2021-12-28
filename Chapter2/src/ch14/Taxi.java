package ch14;

public class Taxi {

    String taxiName;
    int totalMoney;

    public Taxi(String taxiName){
        this.taxiName = taxiName;
    }

    public void take(int money){
        totalMoney += money;
    }

    public void showTaxiInfo(){
        System.out.println(taxiName + " 수입은 "+totalMoney+"원 입니다.");
    }
}
