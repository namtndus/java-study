package ch04;

public class StudentTest {

    public static void main(String[] args) {
        Student studentLee = new Student();

        studentLee.studentId = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address="서울시 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentId = 54321;
        studentKim.address = "경기도 성남시";
        studentKim.studentName= "Kim";

        studentKim.showStudentInfo();
    }
}
