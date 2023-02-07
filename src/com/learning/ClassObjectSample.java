package com.learning;

import com.learningBase.Person;

public class ClassObjectSample {
	public static void main(String[] args) {
		Person alex= new Person("Alex",55,"Male");
		alex.age=27;
		alex.name="Alex1";
		alex.gender = "Male";
		alex.sleep();
		alex.details();
		
		Person mia = new Person("Mia",28,"Female");
		mia.age= 70;
		mia.name="MIA";
		mia.gender="Female";
		mia.sleep();
		mia.details();
		
		Person a = new Person("Hello",9,"Male");
		a.sleep();
	}
}



