import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class calcEngine {

    static double execute(char opCode, double leftVal, double rightVal) {
        /* Return the correct value

          // Enhanced Switch Statement
            switch (opCodes[i]) {
                case 'a' -> results[i] = leftVals[i] + rightVals[i];
                case 's' -> results[i] = leftVals[i] - rightVals[i];
                case 'm' -> results[i] = leftVals[i] * rightVals[i];
                case 'd' -> results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                default -> {
                    System.out.println("Invalid opCode" + opCodes[i]);
                    results[i] = 0.0d;
                }
            }
        */
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode" + opCode);
                result = 0.0d;
                break;
        }
        return result;
    }

    static double getCommandLine(String[] args) {
        /* Handle the command line arguments and get the result */

        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        return execute(opCode, leftVal, rightVal);

    }

    static char getOpCodeFromString(String operationName) {
        /* Return the opcode from the string*/

        return operationName.charAt(0);
    }

    static double valueFromWord(String word) {
        /* Return the double representation of the number */

        String[] values = {
                "zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten"
        };
        double value = -1d;
        for (int i = 0; i < values.length; i++) {
            if (word.equals(values[i])) {
                value = i;
                break;
            }
        }

        // Checking to see if value had changed, if not. Parse the string into a double
        if (value == -1) 
            value = Double.parseDouble(word);

        return value;
    }

    static char symbolFromOpCode(char opCode) {
        /* Get the relevant symbol for the operation given by the user*/

        char[] opCodes = {'a', 's', 'm', 'd'};
        char[] symbols = {'+', '-', '*', '/'};
        char symbol = ' ';
        
        // Loop through the list of chars and get the relevant symbol
        for (int i = 0; i < opCodes.length; i++) {
            if (opCode == opCodes[i]) {
                symbol = symbols[i];
                break;
            }
        }
        return symbol;
    }

    static void displayResult(char opCode, double leftVal, double rightVal, double result) {
        /* Display the result of the expression but nicely formatted */

        char symbol = symbolFromOpCode(opCode);
        // StringBuilder stringBuilder = new StringBuilder();
        
        // stringBuilder.append(leftVal);
        // stringBuilder.append(" " + symbol + " ");
        // stringBuilder.append(rightVal);
        // stringBuilder.append(" = ");
        // stringBuilder.append(result);

        // String finalResult = stringBuilder.toString();

        String finalResult = String.format("%.1f %c %.1f = %.1f", 
                                            leftVal, symbol, rightVal, result);
        System.out.println(finalResult);

    }

    static void handleWhen(String[] stringParts) {
        /* Return date arithmetic operation (days added) */
        
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.parse(stringParts[1], dateTimeFormatter);
        long daysToAdd = (long) valueFromWord(stringParts[2]);

        LocalDate newDate = startDate.plusDays(daysToAdd);
        String output = String.format("%s + %d days is %s", 
                                startDate.format(dateTimeFormatter), daysToAdd, newDate.format(dateTimeFormatter));
        System.out.println(output);

    }

    static void performOperation(String[] stringParts) {
        /* Execute the operation with the numbers given by the user */

        char opCode = getOpCodeFromString(stringParts[0]);

        if (opCode == 'w') {
            handleWhen(stringParts);
        } else {
            double leftVal = valueFromWord(stringParts[1]);
            double rightVal = valueFromWord(stringParts[2]);
            double result = execute(opCode, leftVal, rightVal);
            displayResult(opCode, leftVal, rightVal, result);
            
        }
    }


    static void executeInteractively() {
        /* Allow the user to be able to enter in numbers for operations */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter in an operation and two numbers");
        String userInput = in.nextLine();
        in.close();

        String[] stringParts = userInput.split(" ");
        performOperation(stringParts);

    }

    public static void main(String[] args) {

        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        // Make sure the user has entered in command line arguments before trying to use them
        if (args.length == 0) {
            // Get the results of the operation and store it into an array
            for (int i = 0; i < opCodes.length; i++)
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);

            // Print out all the results stored in the array
            for (double currentResult: results)
                System.out.println(currentResult);

        } else  if (args.length == 1 && args[0].equals("interactive")) {
            executeInteractively();
        } else if (args.length == 3)
            System.out.println(getCommandLine(args));
        else
            System.out.println("Please Enter 3 Command Line Arguments!");
    }
}
