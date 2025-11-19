package Day4Training;

public class TestShape {

//    public static  void method(Rectangle r ){
//        System.out.println("Rectangle");
//    }
    public static void method (Shape s)
    {
        System.out.println("Shape");
    }
    public static  void method(Drawable d ){
        System.out.println("Drawable");
    }
    public static  void method( Object obj ){
        System.out.println("Object");
    }


    public static void main(String[] args) {

       Drawable d =new Rectangle(7,8);
        method(d);

        Shape s =new Rectangle(7,8);
        method(s);

        Rectangle r = new Rectangle(7,8);
        method(r);


/*
        Drawable d = new Rectangle(3,4);
        d.draw(0,0,3,4);

        //System.out.println(d);
        if(d instanceof Rectangle) {
            Rectangle r2 = (Rectangle) d;  //downcasting
            r2.draw(1, 1, 3, 5);
            r2.area();
        }

        Rectangle rect =new Rectangle(6,7);
        Object o = new Rectangle(2,3);
       // o= new Object();

        Rectangle r1 =(Rectangle)o;   //downcasting

        System.out.println("first"+r1.area());


        Rectangle r = new Rectangle(10,5);

        r.draw(0,0,10,5);
        System.out.println("shape :"+r.shapeName());
        System.out.println("perimeter :"+r.perimeter());
        System.out.println("area  :"+r.area());


        Shape s =new Rectangle(4,5);//polymorphism
        s.draw(0,0,4,5);
        System.out.println("shape :"+s.shapeName());
        System.out.println("perimeter :"+s.perimeter());
        System.out.println("area  :"+s.area());



        Shape s1 = new Rectangle(4,5);
        if(s1 instanceof Rectangle) {
            Rectangle r3 = (Rectangle) s1;   //downcasting
            r3.draw(3, 4, 5, 6);
        }
        /*
 */




        }
    }

