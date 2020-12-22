package iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    private final List<MenuItem> menuItems = new ArrayList<>();

    public PancakeHouseMenu() {

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

/*
    Note: Using iterator to get rid of this code
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
*/

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
