package src;

public class ByTwos implements Counter {

    private int num = 2;
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
