package com.company;

class Ball {
    private double x, y;
    Ball(){
        x = 0;
        y = 0;
    }
    Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        this.x = this.x + xDisp;
        this.y = this.y + yDisp;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
	   Ball AwesomeBall = new Ball(10, 10);
	   System.out.println(AwesomeBall);
	   AwesomeBall.setX(1707);
	   AwesomeBall.setY(1808);
	   System.out.println(AwesomeBall);
	   AwesomeBall.setXY(1337, 1488);
	   System.out.println(AwesomeBall);
    }
}

