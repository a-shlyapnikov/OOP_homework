package HW05.Controller;

import HW05.Model.Groups.StudyGroup;
import HW05.Model.Users.Student;
import HW05.Model.Service.UserService;
import HW05.Model.Users.Teacher;
import HW05.View.ConsoleVeiw;
import HW05.View.Menu;
import HW05.View.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    UserService us;
    List<Student> students;
    List<Teacher> teachers;
    List<StudyGroup> studyGroups;
    Scanner in = new Scanner(System.in);
    View view;
    Menu menu;

    public Controller() {
        this.us = new UserService();
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.studyGroups = new ArrayList<>();
        this.view = new View();
        this.menu = new Menu();
    }

    public void start() {
        String choice = "";
        while (!choice.equals("-2")) {
            ConsoleVeiw.print(menu.mainMenu());
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    ConsoleVeiw.print(menu.usersToCreate());
                    createUser(in.nextInt());
                    break;
                case "2":
                    createStudyGroup();
                    break;
                case "3":
                    ConsoleVeiw.print(menu.usersLists());
                    printLists(in.nextInt());
                    break;
                case "4":
                    ConsoleVeiw.print(us.getStudyGroupList(studyGroups));
                    break;
                case "0":
                    ConsoleVeiw.print("Выход...");
                    System.exit(0);
                default:
                    ConsoleVeiw.print("Указано неверное значение");
            }
        }

    }

    private void printLists(int nextInt) {
        switch (nextInt) {
            case 1:
                ConsoleVeiw.print(us.getUsersList(students));
                break;
            case 2:
                ConsoleVeiw.print(us.getUsersList(teachers));
        }
    }

    private void createStudyGroup() {
        studyGroups.add(us.createStudyGroup(teachers, students));
    }

    private void createUser(int num) {
        switch (num) {
            case 1:
                students.add(us.createStudent());
                ConsoleVeiw.print("Студент добавлен");
                break;
            case 2:
                teachers.add(us.createTeacher());
                ConsoleVeiw.print("Учитель добавлен");
                break;
            default:
                ConsoleVeiw.print("Указано неверное значение");

        }
    }

}
