package com.learning;

public class FlowerControlSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inArray = {2,4,6,1,3};
		
		for(int i=0;i<inArray.length;i++) {
			System.out.println("i value is :"+inArray[i]);
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("i value is :"+i);
		}
		for(int a:inArray) {
			//System.out.println(a);
			// it will print all value 
			if (a==4) {
				 //System.out.println("Do not print value 4");
				 continue;
			 }
			System.out.println("Value of :"+a);
			/* 
			 * It will break value once value matched get out of block
			 * if (a==6) {
				 System.out.println("I found value  6");
				 break;
			 }*/
			 
			
			 
		}
		int i=0;
		while(i<10) {
			System.out.println("While loop"+i);
			i++;
		}
		int j=0;
		do {
			System.out.println("Do while loop "+j);
			j++;
		}while(j<10);
		
	}
}
