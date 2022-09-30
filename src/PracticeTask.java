import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTask {


    public interface Printable{
        void print();
    }

    enum Directions{
        UP,
        LEFT,
        RIGHT,
        DOWN
    }

    public interface Shape{
        void perimeter();

        void area();
    }

    public static void doLambda(){
        Printable myClosure = ()-> System.out.println("I Love Java");
        repeatPrint(10, myClosure);
    }

    public static void repeatPrint(int times, Printable task){
        for (int i = 0; i < times; i++){
            task.print();
        }
    }
    public static class Circle implements Shape {
        private Integer radius;
        public Circle(int radius){
            this.radius = radius;
        }

        @Override
        public void perimeter(){
            System.out.println(2* Math.PI * radius);
        }

        @Override
        public void area(){
            System.out.println(Math.PI * Math.pow(radius, 2));
        }
    }
    static class Square implements Shape {
        int length;

        public Square(int length) {
            this.length = length;
        }

        @Override
        public void perimeter() {
            System.out.println(4 * this.length);
        }

        @Override
        public void area() {
            System.out.println(2 * this.length);
        }
    }

    static class Rectangle implements Shape {
        int length;
        int width;

        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public void perimeter() {
            System.out.println(2 * this.length + 2 * this.width);
        }

        @Override
        public void area() {
            System.out.println(this.length * this.width);
        }
    }
    public static Point doOneStep(Point dot, Directions direction){
        switch (direction){
            case UP -> dot.y += 1;
            case DOWN -> dot.y -= 1;
            case LEFT -> dot.x -= 1;
            case RIGHT -> dot.x +=1;
        }
        return dot;
    }

    public static void doManySteps(Point location, ArrayList<Directions> directionsList){
        for (Directions directions : directionsList) {
            System.out.println(doOneStep(location, directions));
        }
    }
    public static void go(){
        Point startPosition = new Point(0, 0);
        ArrayList<Directions> directions = new ArrayList<>();
        directions.add(Directions.UP);
        directions.add(Directions.UP);
        directions.add(Directions.LEFT);
        directions.add(Directions.DOWN);
        directions.add(Directions.LEFT);
        directions.add(Directions.DOWN);
        directions.add(Directions.DOWN);
        directions.add(Directions.RIGHT);
        directions.add(Directions.RIGHT);
        directions.add(Directions.DOWN);
        directions.add(Directions.RIGHT);
        doManySteps(startPosition, directions);
    }
    public static void main() {
        System.out.println("\n Задание с лямбдой \n");
        PracticeTask.doLambda();
        System.out.println("\n Задание на отслеживание координат \n");
        PracticeTask.go();
    }
}
