package string.formatting;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.StringJoiner;

public class Main {
    private static final String rootResources = "C:\\Users\\sgoud\\JavaProjects\\Learning-Java\\Pluralsite\\src\\intermediate\\Java Fundamentals - The Core Platform\\resources\\";

    public static void main(String[] args) throws IOException {
        stringJoiner();
        System.out.println();
        stringJoinerEmptyCase();
        System.out.println();
        formattingStrings();

        writeFormattedContentToFile();
    }

    private static void stringJoiner() {
        StringJoiner stringJoiner = new StringJoiner(", ");
        stringJoiner.add("alpha");
        stringJoiner.add("beta");
        stringJoiner.add("gamma");
        System.out.println(stringJoiner.toString());

        stringJoiner = new StringJoiner(", ");
        stringJoiner.add("alpha").add("beta").add("gamma");
        System.out.println(stringJoiner.toString());

        stringJoiner = new StringJoiner(", ", "{", "}");
        stringJoiner.add("alpha").add("beta").add("gamma");
        System.out.println(stringJoiner.toString());

        stringJoiner = new StringJoiner("], [", "[", "]");
        stringJoiner.add("alpha").add("beta").add("gamma");
        System.out.println(stringJoiner.toString());
    }

    private static void stringJoinerEmptyCase() {
        StringJoiner stringJoiner = new StringJoiner(", ");
        System.out.println(stringJoiner.toString());

        stringJoiner = new StringJoiner(", ", "{", "}");
        System.out.println(stringJoiner.toString());

        stringJoiner = new StringJoiner(", ");
        stringJoiner.setEmptyValue("EMPTY");
        System.out.println(stringJoiner.toString());

        stringJoiner = new StringJoiner(", ", "{", "}");
        stringJoiner.setEmptyValue("EMPTY");
        System.out.println(stringJoiner.toString());

        stringJoiner = new StringJoiner(", ");
        stringJoiner.setEmptyValue("EMPTY");
        stringJoiner.add("");
        System.out.println(stringJoiner.toString());

        stringJoiner = new StringJoiner(", ", "{", "}");
        stringJoiner.setEmptyValue("EMPTY");
        stringJoiner.add("");
        System.out.println(stringJoiner.toString());
    }

    private static void formattingStrings() {
        int david = 13;
        int dawson = 11;
        int dillon = 4;
        int gordon = 2;

        String formattedString = String.format("My nephews are %d, %d, %d and %d years old", david, dawson, dillon, gordon);
        System.out.println(formattedString);

        System.out.printf("W:%d X:%d\n", 5, 235);
        System.out.printf("Y:%d Z:%d\n", 481, 12);

        System.out.println();

        System.out.printf("W:%4d X:%4d\n", 5, 235);
        System.out.printf("Y:%4d Z:%4d\n", 481, 12);

        System.out.println();

        System.out.printf("W:%04d X:%04d\n", 5, 235);
        System.out.printf("Y:%04d Z:%04d\n", 481, 12);

        System.out.println();

        System.out.printf("W:%-4d X:%-4d\n", 5, 235);
        System.out.printf("Y:%-4d Z:%-4d\n", 481, 12);

        System.out.println();

        System.out.printf("%d\n", 1234567);
        System.out.printf("%,d\n", 1234567);
        System.out.printf("%,.2f\n", 1234567.0);

        System.out.println();

        System.out.printf("%d\n", 123);
        System.out.printf("%d\n", -456);
        System.out.printf("% d\n", 123);
        System.out.printf("% d\n", -456);
        System.out.printf("%+d\n", 123);
        System.out.printf("%+d\n", -456);
        System.out.printf("%(d\n", 123);
        System.out.printf("%(d\n", -456);
        System.out.printf("% (d\n", 123);
    }

    private static void writeFormattedContentToFile() throws IOException {
        int david = 13;
        int dawson = 11;
        int dillon = 4;
        int gordon = 2;
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(rootResources + "myFormattedFile.txt"));

        try (Formatter formatter = new Formatter(writer)) {
            formatter.format("My nephews are %d, %d, %d and %d years old", david, dawson, dillon, gordon);
        }
    }
}
