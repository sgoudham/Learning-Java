public class DynamicHelper {

    private final MathProcessing[] handlers;

    public DynamicHelper(MathProcessing[] handlers) {
        this.handlers = handlers;
    }

    public void process(String statement) {
        String[] parts = statement.split(MathProcessing.SEPARATOR);
        String keyword = parts[0];
        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);

        MathProcessing theHandler = null;
        for(MathProcessing handler : handlers) {
            if(keyword.equalsIgnoreCase(handler.getKeyWord())) {
                theHandler = handler;
                break;
            }
        }

        double result = theHandler.doCalculation(leftVal, rightVal);
        if (theHandler.doFormatting() != null) 
            System.out.println(theHandler.doFormatting());
        else
            System.out.println("result = " + result);
    }   
}
