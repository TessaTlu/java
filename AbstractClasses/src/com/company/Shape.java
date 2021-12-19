package com.company;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    Shape(){
        color = "black";
        filled = false;
    }
    public Shape(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    abstract double getArea();
    abstract double getPerimeter();

    public abstract double getSide();
}
