package src;

import java.util.Scanner;

public class SimpleArrays {
    public static void main(String[] args) {

        final int LENGTH = 9;
        int[] values = new int[LENGTH];
        int currentSize = 0;

        //Read Inputs
        System.out.println("Please Enter Values: \nPress Q To Quit");
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt() && currentSize < values.length) {
            values[currentSize] = in.nextInt();
            currentSize++;
        }
        in.close();

        //Find The Largest Value
        double largest = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] > largest) {
                largest = values[i];
            }
        }

        System.out.println("\nThe Largest Is: " + largest);
    }
}

