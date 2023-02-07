package com.learning;

import com.learningBase.Person;

public class ArrayTest {
	public static void main(String[] args) {
		int[] myArray = new int[3];
		
		myArray[0]=4;
		myArray[1]=7;
		myArray[2]=10;
		System.out.println(myArray[2]);
		System.out.println(myArray.length);
		
		for(int element:myArray) {
			System.out.println(element);
		}
		
		Person[] user = new Person[3];
		Person alex = new Person("Alex", 55, "Male");
		Person mia = new Person("Mia", 30, "Female");
		Person james = new Person("James", 7, "Male");
		
		
		user[0]=alex;
		user[1]=mia;
		user[2]=james;
		
		System.out.println("James age :"+user[2].age);
		
		for(Person dtls:user) {
			System.out.println("Person details : "+dtls.name);
		}
	}
	
}
