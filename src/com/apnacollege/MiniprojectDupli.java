package com.apnacollege;

import java.util.Scanner;

public class MiniprojectDupli {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int UserNum=0;
        int MyNum = (int)(Math.random()*100);
        do {
            System.out.println("Guess the number 1 - 100");
            UserNum = sc.nextInt();

            if (UserNum == MyNum) {
                System.out.println("Wohooo we have won");
                break;

            } else if (UserNum > MyNum) {
                System.out.println("The number is too large");
            } else {
                System.out.println("The number is too small");
            }
        }
            while (UserNum >= 0);
                System.out.println("The number is ");
            System.out.println(UserNum);




    }

}
