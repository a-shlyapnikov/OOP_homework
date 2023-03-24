package HW05.Model.Service;

import HW05.Model.Service.Impl.TeacherCreatorImpl;
import HW05.Model.Users.Teacher;

import java.util.Scanner;

public class TeacherCreator extends UserCreator implements TeacherCreatorImpl {
    Scanner in = new Scanner(System.in);

    @Override
    public Teacher createTeacher() {
        Teacher teacher = new Teacher(getDateBirth(), getFullName());
        System.out.print("\nВведите стаж преподавателя: ");
        teacher.setExp(in.nextInt());
        return teacher;
    }
}
