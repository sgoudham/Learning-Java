public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    void execute() {
        switch (this.opCode) {
            case 'a':
                this.result = this.leftVal + this.rightVal;
                break;
            case 's':
                this.result = this.leftVal - this.rightVal;
                break;
            case 'm':
                this.result = this.leftVal * this.rightVal;
                break;
            case 'd':
                this.result = this.rightVal != 0 ? this.leftVal / this.rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + this.opCode);
                this.result = 0.0d;
                break;
        }
    }

    public MathEquation(double leftVal, double rightVal, char opCode, double result) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        this.opCode = opCode;
        this.result = result;
    }

    // Setters

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) { 
        this.leftVal = leftVal; 
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
