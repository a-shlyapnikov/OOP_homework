package HW01;

public class Item {
    private String itemName;
    private int price;
    private int rating;
    private static int itemCount;

    static {
        itemCount = 0;
    }

    public Item(String itemName, int price, int rating) {
        this.itemName = itemName;
        this.price = price;
        this.rating = rating;
        itemCount++;
    }

    public Item(String itemName) {
        this(itemName, 0, 0);
    }

    public Item(String itemName, int price) {
        this(itemName, price, 0);
    }

    public Item() {
        this(String.format("Item #", itemCount), 0, 0);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static int getItemCount() {
        return itemCount;
    }

    @Override
    public String toString() {
        return String.format("Item name:%s, item price:%d, item rating:%d", itemName, price, rating);
    }
}
