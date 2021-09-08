package com.company;

public class CalculateMarks {
    public static void main(String args[])
    {
        A obj =new A(50,50,50);
        obj.getPercentage();
        B obj2 =new B(50,50,50,50);
        obj2.getPercentage();
    }
}

abstract class Marks
{
    abstract void getPercentage();
}

class A extends Marks
{
    int marks1,marks2,marks3;
    A(int mark1,int mark2,int mark3) {
        marks1 = mark1;
        marks2 = mark2;
        marks3 = mark3;

    }
    void getPercentage() {
        float percentage = ((marks1+marks2+marks3)/(float)300)*100;
        System.out.println("Percentage of A is:"+percentage);
    }
}

class B extends Marks
{
    int marks1,marks2,marks3,marks4;
    B(int mark1,int mark2,int mark3,int mark4) {
        marks1 = mark1;
        marks2 = mark2;
        marks3 = mark3;
        marks4 = mark4;

    }
    void getPercentage() {
        float percentage = ((marks1+marks2+marks3+marks4)/(float)400)*100;
        System.out.println("Percentage of B is:"+percentage);
    }
}

