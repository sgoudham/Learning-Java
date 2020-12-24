package pluralsite.calculator.engine;

public class PowerOf implements MathProcessing {

    private String formattedOutput;

    @Override
    public String getKeyWord() {
        return "power";
    }

    @Override
    public String doFormatting() {
        return formattedOutput;
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        double product = Math.pow(leftVal, rightVal);
        formattedOutput = leftVal + " Has Been Raised To The Power Of " + rightVal + " Which Results In: " + product;
        return product;
    }
}
