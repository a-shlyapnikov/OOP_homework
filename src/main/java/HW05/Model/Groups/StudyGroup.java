package HW05.Model.Groups;

import HW05.Model.Users.Student;
import HW05.Model.Users.Teacher;

import java.util.List;

public class StudyGroup extends Group<Teacher, Student> {
    int groudId;

    public StudyGroup(Teacher teacher, List<Student> students, int groudId) {
        super(teacher, students);
        this.groudId = groudId;
    }
    public int getGroudId() {
        return groudId;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "groudId=" + groudId +
                ", teacher =" + leadership.getFio() +
                ", count of students =" + members.size() +
                '}';
    }


}
