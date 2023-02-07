package EncapsulationDemo;

import com.learningBase.Person;

public class ClassObjectSample {
	public static void main(String[] args) {
		Person1 alex= new Person1("Alex",55,"Male");
		alex.setAge(27);
		alex.setName("Alex1");
		alex.setGender("Male");
		alex.sleep();
		alex.details();
		
		Person1 mia = new Person1("Mia",28,"Female");
		mia.setAge(70);
		mia.setName("MIA");
		mia.setGender("Female");
		mia.sleep();
		mia.details();
		
		Person a = new Person("Hello",9,"Male");
		a.sleep();
	}
}



