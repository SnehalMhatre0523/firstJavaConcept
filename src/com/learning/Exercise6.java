package com.learning;
/*
 * Write a method to check given year is a leap year or not.

Your method should accept year as int and return true if the given year is a leap year or else it should return false.



Tips to identify whether a given year is leap year or not,

To determine whether a year is a leap year, follow these steps:

Step 1 : If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.*/
public class Exercise6 {
	  public static void main(String[] args) {
	        int userInput = 2048;
	        System.out.println(isLeapYear(userInput) );
	    }
	    // Write your method here to check whether given year is a leap year or not
	    public static boolean isLeapYear(int year){
	        boolean step_1 = (year % 4) == 0;
	        boolean step_2 = (year % 100) != 0;
	        boolean step_3 = ((year % 100 == 0) && (year % 400 == 0));
	 
	        return step_1 && (step_2 || step_3);
	    }
}
