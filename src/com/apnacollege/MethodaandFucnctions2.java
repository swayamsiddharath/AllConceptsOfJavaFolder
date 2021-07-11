package com.apnacollege;

public class MethodaandFucnctions2 {
    //public static void Printname(String name) {
        //System.out.println(name);


    public static void printSum(int a , int b)
    {
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main (String[] args)
    {
       // Printname("Aman");
        //Printname("AKKU");
    // instead of writing the output statements many times,
        // we create methods and call them everytime whenever we need them.
     printSum(1,6);
     printSum(2,5);
     printSum(3,7);
    }
}
