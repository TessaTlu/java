package com.company;


public class Circle extends Shape {
    protected double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
        radius = 1;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*Math.PI*radius/2;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getSide() {
        return 0;
    }

}
