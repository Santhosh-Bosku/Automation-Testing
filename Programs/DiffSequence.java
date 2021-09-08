package com.company;

public class DiffSequence {
    public void diffSequence(int n,char c)
    {
        System.out.println("Int "+n+" and char "+c);
    }
    public void diffSequence(char c,int n)
    {
        System.out.println("char "+c+" and char "+n);
    }
    public static void main(String args[])
    {
        DiffSequence obj =new DiffSequence();
        obj.diffSequence('a',10);
        obj.diffSequence(11,'b');
    }
}
