package com.company;

public abstract class Bank {
    abstract void getBalance();
}

class classBank
{
    public static void main(String args[])
    {
        BankA a = new BankA();
        a.getBalance();
        BankB b = new BankB();
        b.getBalance();
        BankC c =new BankC();
        c.getBalance();
    }
}

class BankA
{
    void getBalance()
    {
        System.out.println("BankA Deposited : $100");
    }
}

class BankB
{
    void getBalance()
    {
        System.out.println("BankB Deposited : $150");
    }
}

class BankC
{
    void getBalance()
    {
        System.out.println("BankC Deposited : $200");
    }
}