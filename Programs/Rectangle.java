package com.company;

public class Rectangle extends Shape {
    void calculateArea() {
        System.out.println("Enter Length and breath");
        length = inObj.nextInt();
        breadth =inObj.nextInt();
        area = length * breadth;
        System.out.println("Area of Rectangle is:"+area);
    }

}
