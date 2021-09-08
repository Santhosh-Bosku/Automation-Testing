package com.company;
import java.util.Scanner;

class Clock
{
    void clock()
    {
        System.out.println("Enter the time :");
        Scanner inObj = new Scanner(System.in);
        System.out.println("1.Enter in Hour, minute, seconds");
        int k=1, j=1, l=1,m=1;
        String flag = "am";
        int hours = 0,minutes = 0,seconds = 0;
        while (k !=0)
        {
            while(j!=0) {

                System.out.println("Enter  Hours");
                hours = inObj.nextInt();
                if (hours < 24) {
                    j=0;
                }
                else
                {
                    System.out.println("enter valid hours");
                }
            }
            while(l!=0) {
                System.out.println("Enter  minute");
                minutes = inObj.nextInt();
                if (minutes < 60) {
                    l= 0;
                }
                else {
                    System.out.println("enter valid input");
                }
            }
            while(m!=0) {
                System.out.println("Enter  seconds");
                seconds = inObj.nextInt();
                if (seconds < 60) {
                    m = 0;
                } else {
                    System.out.println("enter valid input");
                }
            }
            if (hours>12)
            {
                hours = hours-12;
                flag = "pm";
            }
            if(hours==12)
            {
                flag = "pm";
            }
            else
            {
                flag = "am";
            }
            System.out.println("The Time is "+hours+":"+minutes+":"+seconds+""+flag);
            k=0;
        }
    }
}

class IncomeTax
{
    void incomeTax()
    {
        System.out.println("Enter the Amount to Calculate income tax");
        Scanner inObj = new Scanner(System.in);
        int amount = inObj.nextInt();
        int temp;
        int tax = 0;
        if(amount<=50000)
        {
            System.out.println("No Tax!");
        }
        else if (amount>50000 & amount<=60000)
        {
            System.out.println("10%");
            temp = amount-50000;
            tax = (10*temp)/100;
            System.out.println("tax="+tax);

        }
        else if(amount>60000 & amount<= 150000)
        {
            System.out.println("20%");
            temp = amount-50000;
            if( temp < 60000) {
                tax = (20 * temp) / 100;
                System.out.println("tax=" + tax);
            }
            else{
                temp = temp-60000;
                tax = tax+6000;
                tax = tax + (20*temp)/100;
                System.out.println("tax="+tax);
            }

        }
        else if (amount>150000)
        {
            System.out.println("50%");
            temp = amount-50000;
            if( temp > 150000) {
                temp = temp - 150000;
                tax = tax + 30000;
            }
                if (temp>60000)
                {   temp = temp -60000;
                    tax = tax +6000;
                }
            tax = tax +(50*temp)/100;
            System.out.println("tax = "+tax);

        }
    }
}

class Bank2
{
   void bank2()
   {
       System.out.println("Enter Your Choice:");
       int amount = 0;
       int z = 1;
       while (z == 1 ) {
           System.out.println("1: Add Money\n"+"2:Withdraw Money\n"+"3:Dispay Money\n"+"4.Exit");
           Scanner inObj =  new Scanner(System.in);
           int ch = inObj.nextInt();
           switch (ch) {
               case 1:
                   System.out.println("Enter The amount");
                   int temp = inObj.nextInt();
                   if(temp<0)
                   {
                       System.out.println("Enter the valid amount");
                   }
                   else {
                       amount = amount + temp;
                       System.out.println("Your Balance =" + amount);
                   }
                   break;
               case 2:
                   
                   System.out.println("Enter amount to withdraw");
                   temp = inObj.nextInt();
                   if(temp>amount)
                   {
                       System.out.println("Enter the Valid amount");
                   }
                   else {
                       amount = amount - temp;
                       System.out.println("Your Balance =" + amount);
                   }
                   break;
               case 3:
                   System.out.println("The Amount is " + amount);
                   break;
               case 4:
                   z = 0;
               default:
                   System.out.println("Your Balance" + amount);
           }
       }
   }
}


public class Main {
    public static void Factoiral()
    {
        int a = 5,fac = 1;
        for(int i = 1; i<= a;i++)
        {
            fac = fac*i;
        }
        System.out.println("Fac = "+fac);
    }

    public static void UserInput()
    {
        Scanner inObj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = inObj.nextInt();
        System.out.println("User Input = "+a);
    }

    public static void PostivieNegative()
    {
        Scanner inObj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = inObj.nextInt();
        if (a<0)
        {
            System.out.println("Entered Number is Negative");
        }
        else
        {
            System.out.println("Entered Number is Positive");
        }
    }

    public static void Ascii()
    {
        char input1 = 'a';
        char input2 = 'b';
        int asciiInput1 = input1;
        int asciiInput2 = input2;
        System.out.println("input1" +input1+ " Ascii value is "+asciiInput1+"\nInput2" +input1+ "Ascii value is "+asciiInput2);
    }

    public static void AreaofTrinagle()
    {
        int b,h;
        Scanner inObj = new Scanner(System.in);
        System.out.println("Enter the height of Triangle");
        h = inObj.nextInt();
        System.out.println("Enter the breadth of Triangle");
        b = inObj.nextInt();
        int area = (b*h)/2;
        System.out.println("Area of Triangle is " +area);
    }

    public static void main(String[] args) {
        System.out.println("1: Clock Program\n"+"2: Bank Program\n"+"3: Tax Program\n"+"4:Addition,Factorial,userInput, PositiveNegative, ascii, Area of Triangle");
        Scanner inObj = new Scanner(System.in);
        int ch = inObj.nextInt();
        switch (ch)
        {
            case 1:
                Clock clock = new Clock();
                clock.clock();
                break;
            case 2:
                Bank2 bank = new Bank2();
                bank.bank2();
                break;
            case 3:
                IncomeTax tax = new IncomeTax();
                tax.incomeTax();
                break;
            case 4:
                int a = 10;
                int b = 5;
                int c = a+b;
                System.out.println("Sum of a,b = "+c+ "\nSub of a,b = "+(a-b)+"\nMul of a,b = "+(a*b)+"\nDiv of a,b = "+(a/b));
                Factoiral();
                UserInput();
                PostivieNegative();
                Ascii();
                AreaofTrinagle();
        }

    }
}

