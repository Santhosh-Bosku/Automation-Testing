package com.company;

class PrintNumber
{
    void printn(int a)
    {
        System.out.println("int "+a);
    }
    void printn(float a)
    {
        System.out.println("float "+a);
    }
    void printn(String a)
    {
        System.out.println("String "+a);
    }
    void printn(boolean a)
    {
        System.out.println("Boolean "+a);
    }
    void printn(char a)
    {
        System.out.println("char "+a);
    }
    public static void main(String args[])
    {
        PrintNumber obj = new PrintNumber();
        obj.printn(10);
        obj.printn((float)11.11);
        obj.printn("santhosh");
        obj.printn(0);
        obj.printn('a');
    }
}