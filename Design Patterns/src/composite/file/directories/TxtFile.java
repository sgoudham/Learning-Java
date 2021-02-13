package composite.file.directories;

public class TxtFile extends File {

    private final String name;
    private final String dateModified;
    private final Long size;
    private final String extension = ".txt";

    public TxtFile(String name, String dateModified, Long size) {
        this.name = name;
        this.dateModified = dateModified;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDateModified() {
        return dateModified;
    }

    @Override
    public Long getSize() {
        return size;
    }

    @Override
    public String getExtension() {
        return extension;
    }

    @Override
    public void displayFileInfo(){ System.out.println(this); }

    @Override
    public String toString() {
        return "TxtFile{" +
                "name='" + name + '\'' +
                ", dateModified='" + dateModified + '\'' +
                ", size=" + size +
                ", extension='" + extension + '\'' +
                "} ";
    }
}
