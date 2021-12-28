package ch14;

public class Student {
    String studnetName;
    int money;

    public Student(String studnetName, int money){
        this.studnetName = studnetName;
        this.money = money;
    }

    //학생이 버스를 타는 메소드
    public void  ta4keBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }
    //학생이 지하철을 타는 메소드
    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo(){
        System.out.println(studnetName + "님의 남은 돈은 " + money + "원입니다.");
    }
}
