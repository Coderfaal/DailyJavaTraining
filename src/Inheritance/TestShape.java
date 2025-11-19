package Inheritance;

public class TestShape {
    public static void main(String[] args) {


        ShapeInterface s = new Triangle(4.0,5.0);
        System.out.println("Area of triangle is "+s.area());
//
//        Shape c = new Circle(5.0);
//        System.out.println("Area of circle is "+ c.area());
//

//         c = new Square(2.0);
//        System.out.println("Area of square is "+c.area());
//
         s= new Rectangle(4.0,6.0);
       System.out.println("Area of Rectangle is "+ s.area());
    }
}
