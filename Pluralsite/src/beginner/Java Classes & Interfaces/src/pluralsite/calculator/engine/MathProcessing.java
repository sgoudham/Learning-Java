package pluralsite.calculator.engine;

public interface MathProcessing {

    String SEPARATOR = " ";

    String getKeyWord();

    double doCalculation(double leftVal, double rightVal);

    default String doFormatting() {
        return null;
    }
}
