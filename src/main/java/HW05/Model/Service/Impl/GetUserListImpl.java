package HW05.Model.Service.Impl;

import HW05.Model.Users.User;

import java.util.List;
/**
 * Реализовал принцип инверсии зависимостей,
 * Детали зависят от абстракций
 */

public interface GetUserListImpl {
    public String getUsersList(List<? extends User> users);
}
