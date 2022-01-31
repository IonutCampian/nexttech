package exam.model;

import javax.persistence.*;

@Entity
@Table(name = "Student grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long Id;

    @Column(name = "Grade Value")
    private double value;

    @Column(name = "Subject")
    private String subject;

    @Column(name = "Teacher")
    private String teacher;


    public Grade() {
    }

    public Grade(double value, String subject, String teacher, String studentName) {
        this.value = value;
        this.subject = subject;
        this.teacher = teacher;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

}
