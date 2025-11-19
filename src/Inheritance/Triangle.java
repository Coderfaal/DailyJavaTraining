package Inheritance;

public class Triangle implements ShapeInterface{

    private  double breath;
    private double height;

    public Triangle(double breath, double height) {
        this.breath = breath;
        this.height = height;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5*this.breath*this.height;
    }
}
