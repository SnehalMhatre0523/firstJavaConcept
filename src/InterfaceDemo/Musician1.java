package InterfaceDemo;

import InheritancePack.Keyboard;

public class Musician1 implements Human1{
	// has relationship 
	Keyboard keyboard = new Keyboard();
	public void playKeyboard() {
		System.out.println("She / he  display keyboard now");
	}
	
	public void speak() {
		System.out.println(" will speak calm!!!");
	}
	
	public static void main(String[] args) {
		Musician1 m= new Musician1();
		Human1 h1 = new Musician1();
		// Human m= new Musician();
		//Human m = new Human();
		
		h1.speak();
		h1.walk();
		//m.playKeyboard(); //The method playKeyboard() is undefined for the type Human
		m.speak(); // it will call musician method when Human m= new Musician();
		// it will call human method when Human m = new Human();
		 // If we write like Musician mq= new Human();	
		//this then Type mismatch: cannot convert from Human to Musician
		m.speak();
		m.keyboard.playSound();
	}

	
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("This is how musician walk");
	}
}
