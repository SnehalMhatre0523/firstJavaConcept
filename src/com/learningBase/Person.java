package com.learningBase;

public class Person{
	public String name;
	public int age;
	public String gender;
	
	public Person(String name,int age,String gender) {
		// TODO Auto-generated method stub
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void sleep(){
		if(age < 10) {
			System.out.println(name+" require 12 hours sleep");
		}else if (age >= 10 && age <=50) {
			System.out.println(name+" require 10 hours sleep");
		}else {
			System.out.println(name+" avg 10 hours sleep");
		}
	}
	
	public void details() {
		// TODO Auto-generated method stub
		System.out.println("Name :"+name);
		System.out.println("Age :"+ age);
		System.out.println("gender :"+gender);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
	}
}

