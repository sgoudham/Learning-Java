package composite.file.directories;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {

    private final List<File> files = new ArrayList<>();
    private final String name;
    private final String dateModified;
    private final Long size;

    Directory(String name, String dateModified, Long size) {
        this.name = name;
        this.dateModified = dateModified;
        this.size = size;
    }

    FileIterator createIterator() {
        return new FileIterator(files);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    String getDateModified() {
        return dateModified;
    }

    @Override
    Long getSize() {
        return size;
    }

    @Override
    void add(File file) {
        files.add(file);
    }

    @Override
    void remove(File file) {
        files.remove(file);
    }

    @Override
    File getFile(int fileIndex) {
        return files.get(fileIndex);
    }

    @Override
    void displayFileInfo() {
        System.out.println(
                "\n\nFolder Name: " + getName() +
                "\nDate Modified: " + getDateModified() +
                "\nSize: " + getSize() +
                "\nContents:"
        );

        FileIterator fileIterator = createIterator();
        while (fileIterator.hasNext()) {
            File file = fileIterator.next();
            file.displayFileInfo();
        }
    }

    @Override
    public String toString() {
        return "\n\nFolder Name: " + name +
                "\nDate Modified: " + dateModified +
                "\nSize: " + size +
                "\nContents{" + files +
                ", name='" + name + '\'' +
                ", dateModified='" + dateModified + '\'' +
                ", size=" + size +
                "}";
    }
}
