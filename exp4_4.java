import java.io.*;
import java.util.*;

interface Shape {
    static double f = 3.1415;

    public void area();
}

class Rectangle implements Shape {
    double x, y, a;

    Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void area() {
        a = x * y;
        System.out.println("Area Of Rectangle Is : " + a);
    }
}

class Circle implements Shape {
    double r, a;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        a = Math.PI * r * r;
        System.out.println("Area Of Circle Is : " + a);
    }
}

public class exp4_4 {
    public static void main(String args[]) {
        Rectangle rr = new Rectangle(4, 5);
        Circle c = new Circle(6);
        rr.area();
        c.area();
    }
}