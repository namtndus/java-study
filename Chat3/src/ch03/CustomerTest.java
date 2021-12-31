package ch03;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer(10010,"이순신");

        customerLee.bonusPoint = 10000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020,"김유신");

        customerKim.bonusPoint=10000;
        System.out.println(customerKim.showCustomerInfo());

        // 업캐스팅
        Customer vc = new VIPCustomer(1234,"noname");

    }

}
