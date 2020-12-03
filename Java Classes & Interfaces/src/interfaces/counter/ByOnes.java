package interfaces.counter;

public class ByOnes implements Counter {

    private int num = 1;
    private int nextNum;

    @Override
    public int countBy() {
        return num;
    }

    @Override
    public int getNextNum() {
        return nextNum += num;
    }
    
}
