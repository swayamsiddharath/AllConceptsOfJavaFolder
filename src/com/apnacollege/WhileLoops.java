package com.apnacollege;

public class WhileLoops {
    public static void main (String[] args)
    {

        // While Loop ( First we check the condition,if the condition is true, then it will run the rest of the code.)
        int i=100; //Initialize
        while(i>=1) //Conditions
        {
            System.out.println(i);
            i = i-1; // difference by 1
        }
         // Do while ( In this case, first we run the code ,
        // then we check the condition)
        int k = 100;
        do {
            System.out.println(k);
            k = k-1;

        }  while(k >=1);

    }
}
