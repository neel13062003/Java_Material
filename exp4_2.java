import java.io.*;
import java.util.*;

abstract class Shape1 {
    private double x, y;

    public abstract void area();

    public abstract void display();
}

class Rectangle extends Shape1 {
    double l, w, a;

    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public void area() {
        a = l * w;
    }

    public void display() {
        System.out.println("Area Of Rectangle Is : " + a);
    }
}

class Circle extends Shape1 {
    double r, a;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        a = Math.PI * r * r;
    }

    public void display() {
        System.out.println("Area Of Circle Is : " + a);
    }
}

public class exp4_2 {
    public static void main(String args[]) {
        Shape1 s;
        s = new Rectangle(3, 5);
        s.area();
        s.display();
        s = new Circle(10);
        s.area();
        s.display();
    }
}
