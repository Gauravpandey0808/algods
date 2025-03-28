package streamApi.LamdaExpressions.request;

public class Subjects {

    String subject;

    public String getSubject() {
        return subject;
    }

    public Subjects(String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    int marks;
}
