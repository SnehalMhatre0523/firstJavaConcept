package com.learning;

public class Exercise4 {
/*
 * Perform below operations.

i) -11 + 5 * 2

ii) (87 + 4) % 7

iii) (33 + -2 * 9) / 1

iv) 6 % 5 / 3 * 6 - 8

Assign every operations results to a variable( like a,b,c and d ) and print the result.

Additionally, play with operators and () and see which operation taking more precedence. [When you change the operator or precedence for the operation and check for solution, udemy tool will say "oops, your solution is incorrect" - Do not worry worry about it. It will work based on instructors expected result]
 */

    public static void main(String[] args) {
        System.out.print(printResult());
    }
    public static String printResult() {
	 int a = -11 + 5 * 2;
     int b = (87 + 4) % 7;
     int c = (33 + -2 * 9) / 1;
     int d =  6 % 5 / 3 * 6 - 8;
      return "a value : "+a + " | b value : " + b + " | c value : " + c + " | d value : " + d;

    }
}
