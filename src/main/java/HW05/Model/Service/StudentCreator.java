package HW05.Model.Service;

import HW05.Model.Service.Impl.StudentCreatorImpl;
import HW05.Model.Users.Student;

public class StudentCreator extends UserCreator implements StudentCreatorImpl {

    @Override
    public Student createStudent() {
        Student student = new Student(getDateBirth(), getFullName());
        return student;

    }
}
