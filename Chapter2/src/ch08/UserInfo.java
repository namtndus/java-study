package ch08;

public class UserInfo {
    public int height;
    public int weight;
    public String gender;
    public String userName;
    public int age;

    public UserInfo(int height, int weight, String gender, String userName, int age6){
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.userName = userName;
        this.age = age;
    }

    public String showUserInfo(){
        return "키가 "+height+" 이고 몸무게가 "+weight +" 킬로인 "+gender+"이 있습니다. 이름은 "+userName+" 이고 나이는 "+age+"세입니다.";
    }
}
