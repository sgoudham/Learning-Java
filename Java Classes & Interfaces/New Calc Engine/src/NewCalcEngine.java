import java.util.Scanner;

public class NewCalcEngine {

    public static void main(String[] args) {
        // performCalculations();
        // executeCalculations();
        // executeInteractively();
        dynamicInteractivity();
    }

    private static void dynamicInteractivity() {
        DynamicHelper dynamicHelper = new DynamicHelper(new MathProcessing[] {
            new Adder(),
            new PowerOf()
        });
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter In Your Operation Please: \n");
        String userInput = in.nextLine();

        dynamicHelper.process(userInput);

    }

    private static void executeInteractively() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter In A Calculation: \n");
        String userInput = in.nextLine();
        String parts[] = userInput.split(" ");
        performOperation(parts);

    }

    private static void performOperation(String[] parts) {
        MathOperation mathOperation = MathOperation.valueOf(parts[0].toUpperCase());
        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);

        CalculateBase calculateBase = createCalculation(mathOperation, leftVal, rightVal);
        calculateBase.calculate();
        System.out.println("\nOperation Performed: " + mathOperation);
        System.out.println("Result: " + calculateBase.getResult());

    }

    private static CalculateBase createCalculation(MathOperation mathOperation, double leftVal, double rightVal) {
        CalculateBase calculation = null;

        switch (mathOperation) {
            case ADD:
                calculation = new Adder(leftVal, rightVal);
                break;
            case MULTIPLY:
                calculation = new Multiplier(leftVal, rightVal);
                break;
            case DIVIDE:
                calculation = new Divider(leftVal, rightVal);
                break;
            case SUBTRACT:
                calculation = new Subtractor(leftVal, rightVal);
                break;
        }

        return calculation;
    }

    private static void executeCalculations() {
        CalculateBase[] calculations = {
            new Divider(100.0d, 50.0d),
            new Adder(25.0d, 92.0d),
            new Subtractor(225.0d, 17.0d),
            new Multiplier(11.0d, 3.0d)
        };

        System.out.println("Array Calculations");
        for (CalculateBase calculation: calculations) {
            calculation.calculate();
            System.out.println("Result: " + calculation.getResult());
        }
    }

    private static void doCalculation(CalculateBase calculate, double leftVal, double rightVal) {

        calculate.setLeftVal(leftVal);
        calculate.setRightVal(rightVal);
        calculate.calculate();
        System.out.println("The result of the calculation is: " + calculate.getResult());
    }

    private static void performCalculations() {

        MathEquation[] mathEquation = new MathEquation[4];
        mathEquation[0] = new MathEquation('d', 100.0d, 50.0d);
        mathEquation[1] = new MathEquation('a', 25.0d, 92.0d);
        mathEquation[2] = new MathEquation('s', 225.0d, 17.0d);
        mathEquation[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : mathEquation) {
            equation.execute();
            System.out.println("Result = " + equation.getResult());
        }

        System.out.println("Average Result = " + MathEquation.getAverageResult());

        System.out.println("\nUsing Execute Method Overloads\n");

        MathEquation mathEquationOverload = new MathEquation('d');
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        mathEquationOverload.execute(leftDouble, rightDouble);    
        System.out.println("Overloaded result with doubles: " + mathEquationOverload.getResult());

        int leftInt = 9;
        int rightInt = 4;

        mathEquationOverload.execute(leftInt, rightInt);    
        System.out.println("Overloaded result with ints: " + mathEquationOverload.getResult());

    }
}