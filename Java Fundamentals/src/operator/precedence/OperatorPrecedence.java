package operator.precedence;

public class OperatorPrecedence {
    public static void main(String[] args) {

        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA / valC * valD + valB;
        int result2 = valA / (valC * (valD + valB));

        System.out.println(result1);
        System.out.println(result2);

    }
}

