package src;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class AnagramGenerator {

    static ArrayList<Character> getStringList(String userWord) {
        /* Return a character list of the string input by the User */

        // Define fixed length array of the same length as the word
        ArrayList<Character> charList = new ArrayList<>();

        // Add each character to the list of characters
        for (int i = 0; i < userWord.length(); i++)
             charList.add(userWord.charAt(i));

        return charList;
    }

    static String generateAnagram(ArrayList<Character> charList) {
        /* Returning an Anagram of the word input by the User */

        StringBuilder stringBuilder = new StringBuilder();

        while (!charList.isEmpty()) {
            int randomIndex = new Random().nextInt(charList.size());
            stringBuilder.append(charList.get(randomIndex));
            charList.remove(charList.get(randomIndex));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        /* Let the user enter in a word and generate an Anagram from it*/ 

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter in a word that you would like to see an Anagram of");
        String userWord = scan.next();

        ArrayList<Character> charList = getStringList(userWord);
        String finalAnagram = generateAnagram(charList);

        System.out.println("Your Anagram: " + finalAnagram);
        scan.close();
    }
}
