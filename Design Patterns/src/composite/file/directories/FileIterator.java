package composite.file.directories;

import java.util.Iterator;
import java.util.List;

public class FileIterator implements Iterator<File> {

    private final List<File> directory;
    private int currentIndex = 0;

    public FileIterator(List<File> directory) {
        this.directory = directory;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < directory.size();
    }

    @Override
    public File next() {
        if (this.hasNext()) {
            return directory.get(currentIndex++);
        }
        return null;
    }
}
