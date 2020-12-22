package iterator.without.custom.iterator;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    private final List<MenuItem> menuItems;
    private int currentIndex;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < menuItems.size();
    }

    @Override
    public MenuItem next() {
        if (this.hasNext()) {
            return menuItems.get(currentIndex++);
        }
        return null;
    }
}
