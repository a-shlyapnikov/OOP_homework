package HW01;

import java.util.*;

public class Category {
    private String categotyName;
    private static HashMap<String, ArrayList<Item>> categories;
    private List<Item> itemsArray;


    private static int categoriesCount;

    static {
        categoriesCount = 0;
        categories = new HashMap<>();
    }

    public Category(String categotyName, ArrayList<Item> itemsArray) {
        this.categotyName = categotyName;
        this.itemsArray = itemsArray;
        categories.put(categotyName, itemsArray);
        categoriesCount++;
    }

    public Category(String categotyName) {
        this(categotyName, new ArrayList<>());
    }

    public void addItemToCategory(Item item) {
        this.itemsArray.add(item);
    }

    public void removeItem(Item item) {
        if (this.itemsArray.contains(item)) {
            this.itemsArray.remove(item);
        } else {
            System.out.println("Такого товара нет в категории");
        }
    }

    public Item getItem(Item item) {
        if (itemsArray.contains(item)) {
            int index = itemsArray.indexOf(item);
            Item takeToBasket = itemsArray.get(index);
            itemsArray.remove(item);
            return takeToBasket;
        } else {
            System.out.println("Такого товара нет");
            return null;
        }

    }

    public static int getCategoriesCount() {
        return categoriesCount;
    }

    public void showCategory() {
        for (Item item : itemsArray) {
            System.out.println(item.getItemName());
        }
    }

    @Override
    public String toString() {
        return itemsArray.toString();
    }

    public static Set<String> getCategories() {
        return categories.keySet();
    }
}
