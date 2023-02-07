package com.learning;

public class Exercise3 {
/*Write a program to assign a value of 5.2 to a float variable and then convert it to int. And finally print int value.*/
	
	
	 static float sn=5.2f;
	 //casting done below
	   static int sn1=(int)sn;
	    public static void main(String[] args) {
	       System.out.println(printResult());
	    }
	    
	    public static int printResult(){
	        // Write your logic here
	        
	        // Finally return int value
	        return sn1;
	    }
}
