package src;

public class ByFours implements Counter {

    private int num = 4;
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
