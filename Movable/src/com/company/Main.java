package com.company;

public class Main {

    public static void main(String[] args) {
	MovablePoint dot = new  MovablePoint(1, 1, 2, 2);
	dot.moveRight();
	System.out.println(dot.toString());
	MovableCircle circle = new MovableCircle(1, -4, 1, 1, 5);
	circle.moveLeft();
	System.out.println(circle.toString());
	MovableRectangle rectangle = new MovableRectangle(1, 1, 2, 2, 5, 5);
	rectangle.moveDown();
	System.out.println(rectangle.toString());
    }
}
