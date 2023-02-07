package com.learning;

public class OperatorsSample {

	public void operatorsTest() {
		//assignment '='
		int count =40;
		System.out.println(count);
		//Arithmetic Operator (+, - , *, /)
		int extracount= 10;
		//addition
		System.out.println(count+extracount);
		//subtraction
		System.out.println(count-extracount);
		//multiple
		System.out.println(count*extracount);
		//div
		System.out.println(count/extracount);
		
		String demo= "HelloWorld";
		//what will happened if string + int is added then it will be string not consider as integer
		// out put helloworld4010
		System.out.println(demo+count+extracount);
		//if we put int in bracket then it will add both value
		System.out.println(demo+(count+extracount));
		
		
		int totalCount = count;
		if(extracount >= 10) {
			totalCount = count+extracount;
		}
		
		System.out.println("Total Count"+totalCount);
		
		//operators ==
		
		String s1=new String("Java");
		String s2= new String("Java");
		if(s1==s2) {
			System.out.println("Two string equals");
		}else {
			System.out.println("Two String not equals");
		}
		
		if(s1.equals(s2)) { System.out.println("Two string equals");
		}else {
		System.out.println("Two String not equals");
		}
		
		System.out.println("Adding sufix means after variable get declare");
		
		System.out.println("First it will print this and then subtract "+ totalCount++);
		System.out.println("After using sufix"+totalCount);
		
		System.out.println("It will add first then print the value is called prefix");
		 System.out.println("First it will add"+ ++totalCount);
	
	
		 System.out.println("Subtracting sufix means after variable get declare");
			
			System.out.println("First it will print this and subtract "+ totalCount--);
			System.out.println("After using sufix"+totalCount);
			
			System.out.println("It will subtract first then print the value is called prefix");
			 System.out.println("First it will add"+ --totalCount);
	
			 
			 //conditional operator
			 totalCount = extracount == 9 ? count + extracount :count;
			 System.out.println("Final Total Count ::"+totalCount);
				
	
	}
	
	public static void main(String[] args) {
		OperatorsSample opsm= new OperatorsSample();
		opsm.operatorsTest();
	}
}
