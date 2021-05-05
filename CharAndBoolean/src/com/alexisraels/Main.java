package com.alexisraels;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';              // occupies 2 bytes of memory
        char myUnicode = '\u0044';      // unicode-table.com for more codes
        System.out.println(myChar);     // prints D
        System.out.println(myUnicode);  // prints D

        char myCopyrightChar = '\u00A9';      // unicode-table.com for more codes
        System.out.println(myCopyrightChar);  // prints copyright char

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
        
    }
}
