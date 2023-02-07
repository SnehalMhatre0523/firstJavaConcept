package com.learning;

public class MethodSample {
	public static void main(String[] args) {
		MethodSample ms = new MethodSample();
		ms.sayHello("male");
	}

	public void sayHello(String gender) {
		String newText = gender.equalsIgnoreCase("Male") ? "Hello, Sir": "Hello, Madam";
		System.out.println(newText);
		
	}
}
