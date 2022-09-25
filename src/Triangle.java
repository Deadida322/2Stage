public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(Point pointA, Point pointB, Point pointC){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.sideA = getSide(pointA, pointB);
        this.sideB = getSide(pointB, pointC);
        this.sideC = getSide(pointC, pointA);
    }

    private double getSide(Point firstDot, Point secondDot){
        return Math.sqrt(Math.pow((firstDot.x - secondDot.x), 2) + Math.pow((firstDot.y - secondDot.y), 2));
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public Point getCenter() {
        return new Point((float) ((pointA.x + pointB.x + pointC.x)/3), (float) ((pointA.y + pointB.y + pointC.y)/3));
    }
}
