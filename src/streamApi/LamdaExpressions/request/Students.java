package streamApi.LamdaExpressions.request;

import java.util.List;

public class Students {

    Integer standard;

    String studentName;

    public Students(Integer standard, Integer rollNo, List<Subjects> subjectsList, String  studentName) {
        this.standard = standard;
        this.rollNo = rollNo;
        this.subjectsList = subjectsList;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public List<Subjects> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(List<Subjects> subjectsList) {
        this.subjectsList = subjectsList;
    }

    Integer rollNo;

    List<Subjects> subjectsList;



}
