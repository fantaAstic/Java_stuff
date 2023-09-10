// Defining a Circle class to create circle object in CircleTest.java

public class Circle {

    public double radius; // instance variable to store radius value

    public Circle(double radius) { // constructor sets the radius property that is passed in the created object
        this.radius = radius;
    }

    public double area() { // method to calculate the area of the circle (based on radius that is passed to object)
        return this.radius * this.radius * Math.PI;
    }

    public double circumference() { // method to calculate the circumference of the circle (based on radius that is passed to object)
        return (this.radius + this.radius) * Math.PI;
    }

}
