package ch10;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println("자율 주행을 합니다.");
        System.out.println("자동차가 스스로 장향을 바꿉니다");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아서 정지합니다.");
    }

    @Override
    public void wiper() {


    }

    @Override
    public void washCar() {
        System.out.println("자동 세차를 합니다.");
    }
}
