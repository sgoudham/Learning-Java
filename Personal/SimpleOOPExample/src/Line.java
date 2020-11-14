public class Line {
    private double gradient;
    private double intercept;

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Line(Coordinates coords1, Coordinates coords2) {
        this.x1 = coords1.getX();
        this.y1 = coords1.getY();
        this.x2 = coords2.getX();
        this.y2 = coords2.getY();
    }

    public void calculateGradient() {
        gradient = (y2 - y1) / (x2 - x1);
    }

    public void calculateIntercept() {
        intercept = y1 - (gradient * x1);
    }

    public void displayEquation() {
        System.out.println("y = " + gradient + "x + " + intercept);
    }

    public double getGradient() {
        return gradient;
    }

    public void setGradient(int gradient) {
        this.gradient = gradient;
    }

    public double getIntercept() {
        return intercept;
    }

    public void setIntercept(int intercept) {
        this.intercept = intercept;
    }

}
