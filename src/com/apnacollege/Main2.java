package com.apnacollege;

public class Main2 {

    public static void main(String[] args)
    {
       // Array non-primitive datatype, we use "new keyword"
        int[] marks = new int[3];
        marks[0]=97;
        //marks[1]=98;
        marks[2]=95;

        // If we print array variable , then it will gave garbage value as the output.
        // so to input array , we have to follow below steps.

        System.out.println(marks[0]);
        System.out.println(marks[1]); //If we don't initialize a variable in java, then it will be by-default assigned as 0 or NULL value.
        System.out.println(marks[2]);

        boolean[] swa = new boolean[3];

        System.out.println(swa[2]); //it will give false which is a garbage value.

        /*

        Two function of array:

        1) Length of the list
        2) List sort
         */

    }
}
