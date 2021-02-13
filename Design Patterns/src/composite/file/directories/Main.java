package composite.file.directories;

public class Main {
    public static void main(String[] args) {

        File rootDirectory = new Directory("Root", "27/02/2021", 100L);

        rootDirectory.add(new TxtFile("Winston", "26/05/2019", 5L));
        rootDirectory.add(new TxtFile("Readme", "06/02/2019", 202L));

        File goudhamFolder = new Directory("Goudham", "12/03/2018", 150L);

        goudhamFolder.add(new TxtFile("University", "07/08/2002", 90L));
        goudhamFolder.add(new TxtFile("Overwatch", "02/12/2010", 678L));

        rootDirectory.add(goudhamFolder);

        File matthewFolder = new Directory("Matthew", "05/10/2019", 570L);

        matthewFolder.add(new TxtFile("Grades", "10/03/2000", 700L));
        matthewFolder.add(new TxtFile("Star Wars", "18/08/2016", 20L));

        rootDirectory.add(matthewFolder);

        rootDirectory.displayFileInfo();

    }
}
