

class Shape{
    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape{ // single level inheritance
    public void area(int l , int h) {
        System.out.println(1/2*l*h);
    }

}
class EquilatralTriangle extends Triangle{ // multi level inheritance
    public void area(int l , int h) {
        System.out.println(1/2*l*h);
    }

}

class Circle extends Triangle{ // now pair of Triangle and Circle class with Shape class is hierarchial inheritance
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }

}

// and combine all class from shape to circle is hybrid inheritance
// Java does not support multiple inheritance
public class oops{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        
    }
}