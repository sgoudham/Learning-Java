public class TypeConversion {
    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        // Possible
        short result1 = byteVal;

        // Not possible
        // short result2 = longVal;

        // Possible
        short result2 = (short) longVal;

        // Not Possible
        // short result3 = byteVal - longVal;

        // Possible
        short result3 = (short) (byteVal - longVal);

        // Not Possible
        // long result4 = longVal - floatVal;

        // Better to do this - Possible
        float result4 = longVal - floatVal;

        // Possible 
        double result5 = doubleVal + shortVal;


        System.out.println("Success");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
