package AbstractDemo;

import InheritancePack.Keyboard;

public class Musician2 extends Human3{
	// has relationship 
	
	
	public static void main(String[] args) {
		Musician2 m= new Musician2();
		m.walk();
		m.speak();
	}

	
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("This is how musician walk");
	}
}
