package InterfaceDemo;

import InheritancePack.Human;

public class Artists1 implements Human1,HumanTemp {
	
	public void preparepainting() {
		System.out.println("He/she is preparing for painting");
	}
	public void walk() {
		System.out.println("This is how artist walk");
	}
	public static void main(String[] args) {
		Artists1 a = new Artists1();
		a.preparepainting();
		a.walk();
		a.speak();
	}

	public void speak() {
		// TODO Auto-generated method stub
		HumanTemp.super.speak();
		
	}
}
