package com.apnacollege;

public class Operators {


    public static void main (String[] args)
    {
        // Operators 4 types in java
        /*
        Arithmetic operators ( +,-,*,/)
        Assignment operators
        Logical operators
        Comparison operators
         */

        int a =4;
        int b =2;
        int sum = a+b;
        int sub = a-b;
        int mult = a*b;
        int div = a/b;
        int rem = a%b; // for remainder (modulo)
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(rem);


        //Assignment operators ( =)
        /* Unary operators ( ++,--)
         */

        int num = 76;
        //System.out.println(++num);  ++num means , first it will increment the value and num++,
        // first it will keep the same value, then it will increment.
       // System.out.println(num);
        System.out.println(num++);
        System.out.println(num);




    }
}
