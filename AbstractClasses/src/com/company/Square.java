package com.company;

public class Square extends Rectangle{
    double side;
    public Square(double width, double length) {
        super(width, length);
    }

    Square(){

    }
    Square(double side){
        this.side = side;
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    double getArea() {
        return super.getArea();
    }

    @Override
    double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
