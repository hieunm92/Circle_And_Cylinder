package Cylinder;

import Circle.Circle;

public class Cylinder extends Circle {
    private double h = 1.3;

    public Cylinder() {
    }

    public Cylinder(double h) {
        this.h = h;
    }

    public Cylinder(double radius, double h) {
        super(radius);
        this.h = h;
    }

    public Cylinder(double radius, String color, boolean filled, double h) {
        super(radius, color, filled);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getVolume(){
        return getArea() * h;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " radius " + getRadius() +
                "; h= " + h +
                "; Volume " + getVolume() +
                '}';
    }
}
