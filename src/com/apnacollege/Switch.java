package com.apnacollege;

public class Switch {
    public static void main(String[] args)
    {
        // Conditional Statements -SWITCH
         int day = 5; // 1 - monday, 2 - tuesday
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("wed-sun");
        }

    }
}
