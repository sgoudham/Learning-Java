public class NewCalcEngine {

    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations() {

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
    }
}