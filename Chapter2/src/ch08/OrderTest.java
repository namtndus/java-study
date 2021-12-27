package ch08;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderNumber= 202011020003L;
        order.orderPhoneNumber = "01023450001";
        order.orderAddress = "서울시 강남구 역삼동 111-333";
        order.orderDate = 20201102;
        order.orderTime = 130258;
        order.orderPrice = 35000;
        order.menuNumber = "0003";

        order.showOrderInfo();
    }
}
