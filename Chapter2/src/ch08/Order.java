package ch08;

public class Order {
    public Long orderNumber;
    public String orderPhoneNumber;
    public String orderAddress;
    public int orderDate;
    public int orderTime;
    public int orderPrice;
    public String menuNumber;

    public void showOrderInfo(){
        System.out.println("주문 접수 번호 : "+ orderNumber);
        System.out.println("주문 핸드폰 번호 : "+ orderPhoneNumber);
        System.out.println("주문 집 주소 : "+ orderAddress);
        System.out.println("주문 날짜 : "+orderDate);
        System.out.println("주문 시간 : "+orderDate);
        System.out.println("주문 가격 : "+orderPrice);
        System.out.println("메뉴 번호 : "+menuNumber);
    }
}
