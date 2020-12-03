package conditionals;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        char grade;  // Defines Grade As Char
        Scanner in = new Scanner(System.in);  // Creates a New Scanner Object

        System.out.print("Please enter your score: ");
        int score = in.nextInt();
        in.close();

        String output = "Your Grade is: ";
        // Checks if Grade is A
        if (score >= 70) {
            grade = 'A';
            System.out.println(output + grade);
        }
        // Checks if Grade is B
        else if (score >= 60) {
            grade = 'B';
            System.out.println(output + grade);
        }
        // Checks if Grade is C
        else if (score >= 50) {
            grade = 'C';
            System.out.println(output + grade);
        }
        // Checks if Grade is D
        else if (score >= 40) {
            grade = 'D';
            System.out.println(output + grade);
        }
        // Checks if Grade is F By Using Else
        else {
            grade = 'F';
            System.out.println(output + grade);
        }

        // Using modulus to determine is number is odd or even
        if (score % 2 == 0) {
            System.out.println("The Number is Even");
        } else if (score % 2 == 1) {
            System.out.println("The Number is Odd");
        }
    }
}
