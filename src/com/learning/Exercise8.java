package com.learning;

public class Exercise8 {
	   public static void main(String[] args) {
	        System.out.println(printResult());
	    }

	    public static String printResult(){
	        String finalStr = "";
	        // Write the loop logic here. and assign finalStr at end of all iteration
	        int mul;
	        for(int i =1;i<=10;i++) {
	        	mul = 2*i;
	        	finalStr=finalStr+("2 * "+i+" = "+mul)+"\n";
	        	
	        }
	        
	        return finalStr;
	        
	      
	    }
}
