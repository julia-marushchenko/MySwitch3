// Java program to demonstrate switch statement with Enum
package com.myswitch;

// Main class
public class Main {

    // Enum with shortenings of days of the week
    public enum Day {
        SUN, MON, TUE, WED, THU, FRI, SAT
    }

    // Main method to run java program
    public static void main(String[] args) {

     Day day = Day.FRI;

     switch (day) {
         case SUN:
             System.out.println("SUNDAY");
             break;
         case MON:
             System.out.println("MONDAY");
             break;
         case TUE:
             System.out.println("TUESDAY");
             break;
         case WED:
             System.out.println("WEDNESDAY");
             break;
         case THU:
             System.out.println("THURSDAY");
             break;
         case FRI:
             System.out.println("FRIDAY");
             break;
         case SAT:
             System.out.println("SATURDAY");
             break;
     }
    }
}