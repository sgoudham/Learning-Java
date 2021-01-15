import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int x = 18;
        // method1(x); System.out.println(x);


        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Hello World!");
        }

        // TODO: While Loop
        // Output: Same As For Loop Shown Previously
        int p = 0;
        while (p < 10) {
            System.out.println(p + " Hello World!");
            p++;
        }

        // TODO: Do While Loop
        /* Note: Condition is checked at the end
        *        so the loop will ALWAYS execute
        *        at least once, even if the condition
        *        is false.
        * Output: Goudham
        */
        int j = 0;
        do {
            System.out.println("Goudham");
        } while (j != 0);

//        // TODO: If Else Statement
//        // Operator Used: Less Than (<)
//        // Output: You Are Rich!
//        double balance = 500.00;
//        if (balance < 500.00) {
//            System.out.println("You Are Broke");
//        } else {
//            System.out.println("You Are Rich!");
//        }

        // TODO: If else if else if... Statement
        // Operator(s) Used: Logical AND (&&), Logical NOT (!),
        //                   Greater Than (>), Greater Than Or Equal To (>=),
        //                   Less Than (<),
        // Output: You Are Rich and not in Debt
        double balance = 100.00;
        boolean debt = false;

        if (balance < 100.00 && debt) {
            System.out.println("You are Broke and in Debt");
        } else if (balance >= 100.00 && debt) {
            System.out.println("You are Rich but in Debt");
        } else if (balance < 100.00 && !debt) {
            System.out.println("You are Broke and not in Debt");
        } else if (balance >= 100.00 && !debt) {
            System.out.println("You are Rich and not in Debt");
        }

        // TODO: Switch Case Statement
        /* Note: There is no major difference between this and
                 if else if else if... The switch statement
                 improves readability and clarity.
         */
        // Output: Wednesday
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Day Not Specified");
        }


        // TODO: Another If Statement
        // Operator Used: Logical NOT (!)
        // Output: You Are Broke
        boolean rich = false;
        if (!rich) {
            System.out.println("You Are Broke");
        }

        // TODO: Common String Methods
        String helloWorld = "Hello World!";

        // TODO .toUpperCase()
        // Converts the entire string into uppercase format
        // Return Type: String
        // Output: HELLO WORLD!
        System.out.println(helloWorld.toUpperCase());

        // TODO: .toLowerCase()
        // Converts the entire string into lowercase format
        // Return Type: String
        // Output: hello world!
        System.out.println(helloWorld.toLowerCase());

        // TODO: .isEmpty()
        // Checks to see if the string is empty or not
        // Return Type: boolean
        // Output: false
        System.out.println(helloWorld.isEmpty());

        // TODO .length()
        // Returns the length of the string given
        // Return Type: int
        // Output: 12
        System.out.println(helloWorld.length());

        // TODO .concat()
        // Appends a string onto the end of another string
        // Return Type: String
        // Output: Hello World!World
        System.out.println(helloWorld.concat("World"));

        // TODO .contains()
        // Checks to see a string is present within another string
        // Return Type: boolean
        // Output: true
        System.out.println(helloWorld.contains("Hello"));

        // TODO .equals()K
        // Checks if 2 strings are equal
        // Return Type: boolean
        // Output: true
        System.out.println(helloWorld.equals("Hello World!"));

        // TODO .trim()
        // Erases whitespace from both sides of the string
        // Return Type: String
        // Output: Hello World!
        System.out.println(helloWorld.trim());

        // TODO: Array Declaration
        // Note: Both ways are valid HOWEVER, <type>[] <name> is the preferred/conventional method
        String[] jedi = new String[5];;
        String sith[] = new String[5];;

        // TODO: Array Declaration with Literal Syntax
        String[] lecturers = new String[] {"Matthew", "Derek", "Waqar"};
        String[] lecturers1 = {"Matthew", "Derek", "Waqar"};

        // TODO: Array Common Operations
        // String[] jedi = new String[] {"Goudham", "Luke", "Ahsoka"};

        // TODO: Change Element
        // Note: We need to specify the index of the value that we want to change
        // Result: First Element is now "Matthew"
        jedi[0] = "Matthew";

        // TODO: Find Array Length
        // Result: Returns the number of elements in an array
        int lengthOfJediArray = jedi.length;

        // TODO: Loop Through Array
        for (int i = 0; i < jedi.length; i++) {
            String currentJedi = jedi[i];
            // ...
        }


        // TODO: Displaying Arrays
        System.out.println(jedi);





        // TODO: ArrayList Declaration
        ArrayList<String> names = new ArrayList<>();

        // TODO: HashMap Declaration
        HashMap<String, String> jediKnights = new HashMap<>();

    }

    static void method1(int i) {
        i = 20;
    }
}
