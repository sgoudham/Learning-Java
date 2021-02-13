package composite.file.directories;

public abstract class File {

    void add(File file) { throw new UnsupportedOperationException(); }
    void remove(File file) { throw new UnsupportedOperationException(); }
    File getFile(int fileIndex) { throw new UnsupportedOperationException(); }
    void displayFileInfo() { throw new UnsupportedOperationException(); }

    String getName() { throw new UnsupportedOperationException(); }
    String getDateModified() { throw new UnsupportedOperationException(); }
    Long getSize() { throw new UnsupportedOperationException(); }
    String getExtension() { throw new UnsupportedOperationException(); }

}
