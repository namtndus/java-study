package ch24;

import java.util.ArrayList;
import java.util.Stack;

public class Student {

    private int studentId;
    String studentName;
    ArrayList<Subject> subjectsList;


    public Student(int studentId, String studentName) {

        this.studentId = studentId;
        this.studentName = studentName;
        subjectsList = new ArrayList<>();
    }

    public void showStudentInfo() {
        int total=0;
        for(int i =0; i<subjectsList.size(); i++){
            System.out.println("학생 "+ studentName +"의 "+ subjectsList.get(i).getSubjectName()+
                    " 과목의 성적은 "+subjectsList.get(i).getSubjectScore()+"입니다.");
            total+=subjectsList.get(i).getSubjectScore();
        }
        System.out.println("학생 "+ studentName+"의 총점은 "+ total +" 입니다");

    }

    public void addSubject(String subjectName, int score) {

        Subject subject = new Subject(subjectName,score);
        subjectsList.add(subject);
    }
}
