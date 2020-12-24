package interfaces.counter;

public class ByThrees implements Counter {

    private int num = 3;
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
