package src;

public class ByFives implements Counter {

    private int num = 5;
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
