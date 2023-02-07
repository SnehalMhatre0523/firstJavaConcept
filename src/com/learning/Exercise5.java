package com.learning;
/*
 * Write a method to calculate the average of three numbers. (take the  numbers 7,9,11)

More Info: You should write a method which will accept 3 int parameters and it should return double value which is average of those three numbers*/
public class Exercise5 {
	public static void main(String[] args) {
        // Write your logic here
      
       System.out.println(calAvg(7,9,11));
    }
    
    public  static double calAvg(int a,int b, int c){
        return (a+b+c)/3;
    }
}
