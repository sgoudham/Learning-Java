public class Main {
    public static void main(String[] args) throws Exception {
        Coords p1 = new Coords(4, 16);
        Coords p2 = new Coords(2, 8);

        Line myLine = new Line(p1, p2);

        myLine.calculateGradient();
        myLine.calculateIntercept();
        myLine.displayEquation();
    }
}
