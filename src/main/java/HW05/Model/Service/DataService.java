package HW05.Model.Service;

import HW05.Model.Groups.StudyGroup;
import HW05.Model.Users.Student;
import HW05.Model.Users.Teacher;
import HW05.Model.Users.User;

import java.util.List;

public interface DataService {
    Student createStudent();

    Teacher createTeacher();

    List<User> read(List<User> userList);
    StudyGroup createStudyGroup(List<Teacher> teachers, List<Student> students);

}
