package com.company;

public class Square extends Shape{
    void calculateArea() {
        System.out.println("Enter the side:");
        side = inObj.nextInt();
        area = side * side;
        System.out.println("The area of Square:"+area);
    }
}
