package com.company;

public class Cricle extends Shape{
    void calculateArea()
    {
        System.out.println("Enter the radius :");
        radius = inObj.nextInt();
        area = (22*radius*radius)/7;
        System.out.println("Area of Circle :"+area);

    }
}
