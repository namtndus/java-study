package ch09;

public class Desktop extends Computer{

    @Override
    void turnOff() {
        System.out.println("Desktop Trun Off");
    }

    @Override
    public void display() {
        System.out.println("Disktop display");
    }

    @Override
    public void typing() {
        System.out.println("전원을 끕니다.");
    }
}
