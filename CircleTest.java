// Using the Circle class from Circle.java to do some operations on some defined circle objects

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(0.5); // create new circle object with a radius of 0.5
        Circle c2 = new Circle(1.0);

        System.out.println("The area of c is: " +
                                c.area()); // calculate the area of the circle c by calling the area method, where the radius 0.5 is passed to the constructor and method in Circle.java.

        System.out.println("The circumference of c is: " +
                                c.circumference()); // calculate the circumference of the circle c by calling the area method, where the radius 0.5 is passed to the constructor and method in Circle.java.

        System.out.println("The area of c2 is: " +
                                c2.area());
        
        System.out.println("The circumference of c2 is: " +
                                c2.circumference());
    }
}
