package Inheritance;

public class Rectangle extends Shape implements ShapeInterface{

    private double length;
    private double breadth;

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public double getLength() {
        return this.length;
    }
    public double getBreadth() {
        return this.breadth;
    }
    public Rectangle(double length , double breadth) {
        super ();
        this.length= length;
                this.breadth= breadth;

    }

    @Override
    public double area() {
        return this.length*this.breadth;
    }
}
