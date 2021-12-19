package com.company;

public class Rectangle extends Shape {
    double width, length;

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle() {
        this.width = 2;
        this.length = 4;
    }

    public Rectangle(double width, double length) {
        this.width = 2;
        this.length = 4;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2*(width + length);
    }

    @Override
    public double getSide() {
        return 0;
    }
}
