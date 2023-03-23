package HW05.Model.Service;

import HW05.Model.Groups.StudyGroup;
import HW05.Model.Service.UserService;
import HW05.Model.Users.Student;
import HW05.Model.Users.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudyGroupCreator {
    UserService us;
    List<Teacher> teachers;
    List<Student> students;
    Scanner in = new Scanner(System.in);

    public StudyGroupCreator(UserService us, List<Teacher> teachers, List<Student> students) {
        this.us = us;
        this.teachers = teachers;
        this.students = students;
    }

    public int getGroupId() {
        System.out.println("Введите номер группы: ");
        return in.nextInt();
    }

    public Teacher getTeacher() {
        System.out.println("Выберите учителя: ");
        System.out.println(us.getUsersList(teachers));
        int choice = in.nextInt();
        return teachers.get(choice - 1);
    }

    public List<Student> getStudents() {
        List<Student> studentsList = new ArrayList<>();
        System.out.println("Добавление студентов");
        System.out.println(us.getUsersList(students));
        System.out.println("Введите номера студентов, которых хотите добавить в группу" +
                "  через Enter\n" +
                "если хотите прекратить набор в группу введите -1 : ");

        int choiceMembers = in.nextInt();
        while (choiceMembers != -1) {
            studentsList.add(students.get(choiceMembers -1 ));
            choiceMembers = in.nextInt();
        }
        return studentsList;

    }

    public StudyGroup newGroup() {
        return new StudyGroup(getTeacher(), getStudents(), getGroupId());
    }
}
