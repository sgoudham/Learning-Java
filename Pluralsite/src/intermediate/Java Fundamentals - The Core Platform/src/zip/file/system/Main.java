package zip.file.system;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Main {
    private static final String root = "C:\\Users\\sgoud\\JavaProjects\\Learning-Java\\Pluralsite\\src\\intermediate\\Java Fundamentals - The Core Platform\\src\\zip\\file\\system\\";
    private static final String rootResources = "C:\\Users\\sgoud\\JavaProjects\\Learning-Java\\Pluralsite\\src\\intermediate\\Java Fundamentals - The Core Platform\\resources\\";

    public static void main(String[] args) {
        String[] data = {
                "Line 1",
                "Line 2 2",
                "Line 3 3 3",
                "Line 4 4 4 4",
                "Line 5 5 5 5 5"
        };

        try (FileSystem zipFs = openZip(Paths.get(root + "myData.zip"))) {
            copyToZip(zipFs);
            writeToFileInZip1(zipFs, data);
            writeToFileInZip2(zipFs, data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException {
        Map<String, String> providerProperties = Collections.singletonMap("create", "true");

        URI zipURI = new URI("jar:file", zipPath.toUri().getPath(), null);
        return FileSystems.newFileSystem(zipURI, providerProperties);
    }

    private static void copyToZip(FileSystem zipFs) throws IOException {
        // Path sourceFile = FileSystems.getDefault().getPath("file1.txt");
        Path sourceFile = Paths.get(rootResources + "file1.txt");
        Path destinationFile = zipFs.getPath("/file1Copied.txt");

        Files.copy(sourceFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);
    }

    private static void writeToFileInZip1(FileSystem zipFs, String[] data) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(zipFs.getPath("/newFile1.txt"))) {
            for (String d : data) {
                writer.write(d);
                writer.newLine();
            }
        }
    }

    private static void writeToFileInZip2(FileSystem zipFs, String[] data) throws IOException {
        Files.write(zipFs.getPath("/newFile2.txt"), Arrays.asList(data), Charset.defaultCharset(), StandardOpenOption.CREATE);
    }
}