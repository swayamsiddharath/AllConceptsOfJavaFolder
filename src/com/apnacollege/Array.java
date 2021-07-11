package com.apnacollege;

public class Array {

    public static void main(String[] args)
    {
       /*  int[] marks = new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;

        System.out.println(marks); Gives some jargon value (if we print array variable)
        System.out.println(marks[2]);


         // Array Function length
        //System.out.println(marks.length); (array don't have functions like this length()
        , we can only write marks.length )

        //sort
        //95,97,98 (sorted)
        System.out.println(marks[0]); // before sorting, output was 97
        Arrays.sort(marks);
        System.out.println(marks[0]); // after sorting, output was 95.

        */

        //

        // 2D arrays
        int[] marks = {97,98,95};
        int[][] finalMarks = {{97,98,95} , { 95,91,82}};
        System.out.println(finalMarks[0][1]);
        System.out.println(finalMarks[1][1]);


        // Casting (Conversion of one datatype to another.)
        // Java allows implicit casting - when  we put int inside the double variable. java will not throw error.
        double price = 100.83;
        double finalPrice = price + 18;
        System.out.println(finalPrice);

        // explicit casting means we tell java doesn't matter how much we lose, we can this only.

       int price2 = 100;
       // int finalp= price2 + 18.0;  // This will throw error because int is smaller and double is bigger and we can miss out some things.
        int finalp= price2 + (int)18.18; // if we write like this, java will accept.

        System.out.println(finalp);


        //constant

        int age = 30; // variable
        int age2 = 31;
        int age3= 32;

        final float PI = 3.14F; // Final keyword means the value can't be modified in the future.
        //PI = 1.1F; // here it gives error as in the above line, it is already declared as final.







    }

}
