package HW05.View;

public class Menu {
    StringBuilder sb = new StringBuilder();

    public String mainMenu() {
        sb.setLength(0);
        sb.append("Главное меню:\n");
        sb.append("1.Добавить пользователя\n");
        sb.append("2.Добавить учебную группу\n");
        sb.append("3.Посмотреть список пользователей\n");
        sb.append("4.Посмотреть группу\n");
        sb.append("0.Выйти\n\n");
        return sb.toString();
    }
    public String usersToCreate() {
        sb.setLength(0);
        sb.append("Выберите тип пользователя:\n");
        sb.append("1.Добавить студента\n");
        sb.append("2.Добавить преподавателя\n");
        sb.append("0.Выйти\n\n");
        return sb.toString();
    }
    public String usersLists(){
        sb.setLength(0);
        sb.append("Выберите тип списка:\n");
        sb.append("1.Учащиеся\n");
        sb.append("2.Преподаватели\n");
        sb.append("0.Выйти\n\n");
        return sb.toString();
    }
}
