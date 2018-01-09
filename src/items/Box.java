package items;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anton Mikhaylov on 09.01.2018.
 */
public class Box extends BaseItem {

    private List<Item> items = new ArrayList<>();

    public Box() {
    }

    public Box(List<Item> items) {
        super();
        this.items = items;
    }

    public void add(Item... items) {
        for (Item item : items) {
            add(item);
        }
    }

    public void add(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        if (items.contains(item)) items.remove(item);
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public int getPrice() {
        return items.stream().mapToInt(item -> item.getPrice()).sum();
    }


}
