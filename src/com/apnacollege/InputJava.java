package com.apnacollege;

import java.util.Scanner;

public class InputJava {

    public static void main(String[] args)
    {
        //How to take INPUT
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = sc.nextInt();
        // If float
        float age2 =sc.nextFloat();
        System.out.println("Thanks, Your age is " + age);

        // String Input ( sc.next() method is used)


        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name");
        //String name = sc.next(); // for a single word
        String name2 = sc.nextLine(); // to print a   sentence
        System.out.println(name2);







    }
}
