package iterator;

public class DinerMenuIterator implements Iterator {
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
    public Object next() {
        if (this.hasNext()) {
            return menuItems[currentIndex++];
        }
        return null;
    }
}
