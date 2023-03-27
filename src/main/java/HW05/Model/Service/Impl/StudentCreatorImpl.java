package HW05.Model.Service.Impl;

import HW05.Model.Users.Student;

/**
 * Реализовал принцип инверсии зависимостей,
 * Детали зависят от абстракций
 */

public interface StudentCreatorImpl {
    public Student createStudent();
}
