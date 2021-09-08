package com.company;

public class AreaUsingMethodOverloading {
    public void area(int side)
    {
        System.out.println("Area of Square is"+(side*side));
    }
    public void area(int length, int breadth)
    {
        System.out.println("Area of Rectangle is"+(length*breadth));

    }
    public static void main(String[] args)
    {
        AreaUsingMethodOverloading obj = new AreaUsingMethodOverloading();
        obj.area(10);
        obj.area(10,15);
    }

}
