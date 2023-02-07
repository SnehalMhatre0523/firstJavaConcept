package EncapsulationDemo;

import java.util.Objects;

public class Person1 implements Comparable<Person1>{
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		//&& this.age == (((Person1)obj).age
		return obj instanceof Person1 && this.name.equals(((Person1)obj).name);
	}

	private String name;
	private int age;
	private String gender;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	
	public Person1(String name,int age,String gender) {
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

	@Override
	public int compareTo(Person1 o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}

