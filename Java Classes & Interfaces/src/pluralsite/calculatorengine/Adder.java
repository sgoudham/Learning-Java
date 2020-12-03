package pluralsite.calculatorengine;

public class Adder extends CalculateBase implements MathProcessing {

    public Adder() {
    }

    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        setResult(getLeftVal() + getRightVal());
    }

    // Using interfaces
    @Override
    public String getKeyWord() {
        return "add";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
