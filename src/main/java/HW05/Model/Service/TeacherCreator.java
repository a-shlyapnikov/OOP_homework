package HW05.Model.Service;

import HW05.Model.Users.Student;
import HW05.Model.Users.Teacher;

import java.util.Scanner;

public class TeacherCreator extends UserCreator{
    Scanner in = new Scanner(System.in);
    public Teacher createNewTeacher(){
        Teacher teacher = new Teacher(getDateBirth(), getFullName());
        System.out.print("\nВведите стаж преподавателя: ");
        teacher.setExp(in.nextInt());
        return teacher;
    }
}
