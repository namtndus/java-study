package ch04;

public class Student {
    public int studentId;
    public String address;
    public String studentName;

    public void setStudentName(String name){
        studentName = name;
    }

    public void showStudentInfo(){
        System.out.println(studentId+"학변의 이름음 "+studentName+" 이고, 주소는 "+address+"입니다.");
    }
}
