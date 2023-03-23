package HW05.Model.Service;

import HW05.Model.Users.Student;

public class StudentCreator extends UserCreator {
    public Student createNewStudent(){
        Student student = new Student(getDateBirth(), getFullName());
        return student;
    }

}
