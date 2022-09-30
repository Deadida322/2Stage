public class Point {
    double x;
    double y;
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.valueOf(this.x) + ";" + String.valueOf(this.y);
    }
}
