package com.company;

import java.util.Scanner;

public abstract class Shape {
    double side, breadth, length, radius, area;
    Scanner inObj = new Scanner(System.in);
    void calculateArea()
    {

    }

    public void setSide(double newSide) {
        this.side = newSide;
    }

    public double getSide()
    {
        return side;
    }
}