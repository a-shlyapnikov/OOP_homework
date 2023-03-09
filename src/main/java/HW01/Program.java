package HW01;

/*
1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
2)Создать класс Категория, имеющий переменные имя и массив товаров.
  Создать несколько объектов класса Категория.
3)Создать класс Basket, содержащий массив купленных товаров.
4)Создать класс User, содержащий логин, пароль и объект класса Basket.
  Создать несколько объектов класса User.
5)Вывести на консоль каталог продуктов. (все продукты магазина)
6)Вывести на консоль покупки посетителей магазина.
(После покупки у пользователя добавляется товар, а из магазина - удаляется)
*/
public class Program {
    public static void main(String[] args) {
        Category fruits = new Category("fruits");
        Category vegetables = new Category("vegetables");
        System.out.println(Category.getCategories());

        Item apple = new Item("apple", 100, 1);
        Item peach = new Item("peach", 100, 3);
        Item tomato = new Item("tomato", 120, 2);
        Item cucumber = new Item("cucumber", 110, 2);
        fruits.addItemToCategory(apple);
        fruits.addItemToCategory(peach);
        fruits.showCategory();
        System.out.println("______");
        vegetables.addItemToCategory(tomato);
        vegetables.addItemToCategory(cucumber);
        vegetables.showCategory();
        System.out.println("______");


        User u1 = new User("Alex", "123");
        User u2 = new User("Bob", "321");
        u1.addToBasket(fruits.getItem(apple));
        u2.addToBasket(vegetables.getItem(tomato));
        System.out.println(u1.getUserBasket());
        System.out.println(u2.getUserBasket());
        fruits.showCategory();
        System.out.println("____");
        vegetables.showCategory();
        System.out.println("____");

        System.out.println(Category.getCategoriesCount());
        System.out.println(Category.getCategories());

    }
}
