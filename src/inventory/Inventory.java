package inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void accept(ItemVisitor visitor) {
        for (Item item : items) {
            item.accept(visitor);
        }
    }
}