package ch19;

public class CarFactory {

    private static int serialNum = 10000;
    private static CarFactory instance = new CarFactory();

    private CarFactory(){}

    public static CarFactory gatInstance(){
        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(){
        serialNum++;
        return new Car(serialNum);
    }
}
