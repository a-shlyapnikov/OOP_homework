package HW05.Model.Service;

import HW05.Model.Users.User;

import java.util.Scanner;

public abstract class UserCreator<T extends User> {
    Scanner in = new Scanner(System.in);
    public String getFullName(){
        System.out.print("\nВведите ФИО: ");
        return in.nextLine();
    }
    public String getDateBirth(){
        System.out.print("\nВведите дату рождения: ");
        return in.nextLine();
    }

}
