package iterator.without.custom.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] menuItems;
    private int currentIndex;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < menuItems.length && menuItems[currentIndex] != null;
    }

    @Override
    public MenuItem next() {
        if (this.hasNext()) {
            return menuItems[currentIndex++];
        }
        return null;
    }
}
