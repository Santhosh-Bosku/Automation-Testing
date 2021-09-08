package com.company;

public class Degree {

    public void getDegree() {
        System.out.println("I got a Degree");
    }
    public static void main(String[] args)
    {
        Degree obj2 = new Degree();
        obj2.getDegree();
        undergraduate obj = new undergraduate();
        obj.degree();
        postgraduate obj1 = new postgraduate();
        obj1.degree();
    }
}
    class undergraduate
    {
        public void degree()
        {
            System.out.println("I am an Undergraduate");
        }
    }

    class postgraduate
    {
        public void degree()
        {
            System.out.println("I am an Postgraduate");
        }
    }

