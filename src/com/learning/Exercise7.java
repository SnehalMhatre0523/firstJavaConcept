package com.learning;

public class Exercise7 {
/*
 * 
Print below pattern using for loop,

*

**

***

****
*/
	
	
	 public static void main(String[] args) {
	        System.out.println(printResult());
	    }
	    
	    public static String printResult(){
	        // Write your logic here to return expected patter as string
	        
	         String finalStr = "";
	        for (int i=1;i<=4;i++){
	            String s="";
	            for(int j=1;j<=i;j++){
	                s=s+"*";
	            }
	            finalStr = finalStr+s+"\n";
	        }
	        return finalStr;
	        
	    }
}
