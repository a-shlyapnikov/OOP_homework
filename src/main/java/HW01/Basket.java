package HW01;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Item> itemsList;

    public Basket(List<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public Basket() {
        this(new ArrayList<Item>());
    }

    public void addItemToBasket(Item item) {
        itemsList.add(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < itemsList.size(); i++) {
            sb.append(itemsList.get(i).toString()).append("\n");
        }
        return sb.toString();
    }
}
