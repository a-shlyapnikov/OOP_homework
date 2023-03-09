package HW01;

public class User {
    private String login;
    private String password;
    private static int userCount;
    private Basket userBasket;

    static {
        userCount = 0;
    }

    public User(String login, String password, Basket userBasket) {
        this.login = login;
        this.password = password;
        this.userBasket = userBasket;
        userCount++;
    }

    public User(String login) {
        this(login, "000", new Basket());
    }

    public User(String login, String password) {
        this(login, password, new Basket());
    }

    public User() {
        this(String.format("User#%d", userCount), "000", new Basket());
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public String getUserBasket() {
        return userBasket.toString();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addToBasket(Item item) {
        userBasket.addItemToBasket(item);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User loggin: " + login + "\n");
        sb.append("User password: " + password + "\n");
        sb.append(userBasket.toString());
        return sb.toString();
    }
}
