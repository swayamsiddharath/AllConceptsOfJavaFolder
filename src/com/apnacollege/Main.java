package com.apnacollege;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        //Variables
        String name = "Aman";  //Type string.. variable = name , stored value=Aman,In the computer memory,there exists a block named "name" where Aman is stored.
        System.out.println(name);
        int age=30;
        System.out.println(age);
        String friend = name;
        System.out.println(friend);

        /* Java Types
        Primitive Types
        byte = 1 byte in memory [-128 to 127]
        short - 2
        int - 4
        float -4  3.14,7.87
        double - 8
        long - 8
         char - 2  a,b,c,d
         boolean - 1 true/false
         */

        byte age2 =30;
        long phone = 122333344000000L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = true;
        /*
        Non - Primitive Types - No fixed Size , but in
        Primitive Type we have Fixed size of 2 or 4 etc respectively.
        In Non-primitive we declare the variable using "new" keyword.

        */

        String name2 = "Swayamsiddha Rath";
        System.out.println(name2.length()); // length of the Swayamsiddha = 16 + space 1 extra

        /*  Strings
       Concatenate
        */

        String name4 = "Sriya";
        String name5 = "Swayamsiddha";
        String name6 = name4 + " and " + name5 ;
        System.out.println(name6);

        //charAt
        String name7 = "Swayam";
        System.out.println(name7.charAt(3));
        //length
        String name8 = "Swayam";
        System.out.println(name8.length());
        //replace ( one character can be replaced by another character by this method)
        String name9 = "Swayam";
        System.out.println(name9.replace('a', 's'));

        // In java , strings are immutable ,String value can be changed , if we want to edit something, then we have to create a new string.

         // Substrings
        String name10 = "Aman and Akku";
        System.out.println(name10.substring(5,8));



    }
}
