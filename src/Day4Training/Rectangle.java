package Day4Training;

public class Rectangle  implements  Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public void draw(int x, int y, int height, int width) {
        System.out.println("Drawing Rectangle at ("+x+","+y+")with height ."+height+" and with width "+width+".");

    }

    @Override
    public double area() {
        return length*breadth;
    }

    @Override
    public double perimeter() {
        return 2*(length+breadth);

    }

    @Override
    public String shapeName() {
        return null;
    }
}
