package com.apnacollege;

public class ExceptionHandling {
    public static void main(String[] args)
    {
        // TRY -CATCH in exception handling
        int[] marks = {98,97,95};
        try
        {
            System.out.println(marks[5]);
        } catch(Exception exception)
        {
            //do things after catching
        }

        System.out.println("The student name is Aman");

    }
}
