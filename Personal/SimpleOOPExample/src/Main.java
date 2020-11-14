public class Main {
    public static void main(String[] args) throws Exception {
        Coordinates coordinate1 = new Coordinates(4, 16);
        Coordinates coordinate2 = new Coordinates(2, 8);

        Line line = new Line(coordinate1, coordinate2);

        line.calculateGradient();
        line.calculateIntercept();
        line.displayEquation();
    }
}
