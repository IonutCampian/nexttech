package exam.model;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long Id;

    @Column(name = "Student name")
    private String studentName;

    @Column(name = "Date of birth")
    private Data birth;
    List<Grade> gradeList = new ArrayList<Grade>();

    public Student(String studentName) {
    }

    public Student(String studentName, Data birth) {
        this.studentName = studentName;
        this.birth = birth;
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Data getBirth() {
        return birth;
    }

    public void setBirth(Data birth) {
        this.birth = birth;
    }

    public double calculateStudentGradeAverage() {
        double average = 0;
        for(int i = 0; i < gradeList.size(); ++i) {
            average += gradeList.get(i).getValue();
        }
        return average/gradeList.size();
    }

    public double getAverageForSubject( String subject) {
        double average = 0;
        int div = 0;
        for(int i = 0; i < gradeList.size(); ++i) {
            if(gradeList.get(i).getSubject().equals(subject)) {
                average += gradeList.get(i).getValue();
                ++div;
            }
        }
        return average / div;
    }

}
