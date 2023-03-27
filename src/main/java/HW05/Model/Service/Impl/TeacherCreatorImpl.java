package HW05.Model.Service.Impl;

import HW05.Model.Users.Teacher;
/**
 * Реализовал принцип инверсии зависимостей,
 * Детали зависят от абстракций
 */

public interface TeacherCreatorImpl {
    public Teacher createTeacher();
}
