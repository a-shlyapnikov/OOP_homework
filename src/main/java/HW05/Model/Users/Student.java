package HW05.Model.Users;

import java.time.LocalDate;
import java.util.List;

public class Student extends User {
    int groupId;
    List<Integer> grades;

    public Student(String dateBirth, String fio, int id) {
        super(dateBirth, fio, id);
    }
    public Student(String dateBirth, String fio){
        this(dateBirth, fio, getCount());
    }
    public Student() {
        super(LocalDate.now().toString(), "Ivanov Ivan", getCount());
    }


    public List<Integer> getGrades() {
        return grades;
    }

    public int getGroupId() {
        return groupId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupId=" + groupId +
                ", grades=" + grades +
                ", dateBirth=" + dateBirth +
                ", fio='" + fio + '\'' +
                ", Id=" + id +
                '}';
    }
}
