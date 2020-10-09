import java.util.ArrayList;

public class NewCalcEngine {

    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations() {

        MathEquation[] mathEquation = new MathEquation[4];
        mathEquation[0] = create(100.0d, 50.0d, 'd');
        mathEquation[1] = create(25.0d, 92.0d, 'a');
        mathEquation[2] = create(225.0d, 17.0d, 's');
        mathEquation[3] = create(11.0d, 3.0d, 'm');

        for (MathEquation equation: mathEquation) {
            equation.execute();
            System.out.println("Result = " + equation.result);
        }
    }

    static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation mathEquation = new MathEquation();
        
        mathEquation.leftVal = leftVal;
        mathEquation.rightVal = rightVal;
        mathEquation.opCode = opCode;

        return mathEquation;
    }
}