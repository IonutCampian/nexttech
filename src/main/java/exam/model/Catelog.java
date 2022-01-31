package exam.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Catalog")
public class Catelog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private long Id;

    @Column(name = "Class Name")
    private String className;

    List<Student> studentList = new ArrayList<Student>();
    public Catelog() {
    }

    public Catelog(String className) {
        this.className = className;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double calculateClassAverage(List<Student> studentList){
        double average = 0;
        for(int i = 0; i < studentList.size(); ++i) {
            average += studentList.get(i).calculateStudentGradeAverage();
        }
        return average / studentList.size();
    }
    public double getAverageBySubject(String subject, List<Student> studentList) {
        int average = 0;
        int div = 0;
        for(int i = 0; i < studentList.size(); ++i) {
            average += studentList.get(i).getAverageForSubject( subject);
            ++div;
        }
        return average / div;
    }
}
