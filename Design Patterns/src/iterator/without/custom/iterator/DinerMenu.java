package iterator.without.custom.iterator;

import java.util.Iterator;

public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final MenuItem[] menuItems = new MenuItem[MAX_ITEMS];

    public DinerMenu() {

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems < MAX_ITEMS) {
            this.menuItems[numberOfItems++] = new MenuItem(name, description, vegetarian, price);
        } else {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        }
    }

/*
    Note: Using iterator to get rid of this code
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
*/

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
