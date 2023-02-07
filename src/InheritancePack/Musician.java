package InheritancePack;

public class Musician extends Human{
	// has relationship 
	Keyboard keyboard = new Keyboard();
	public void playKeyboard() {
		System.out.println(name+" display keyboard now");
	}
	
	public void speak() {
		System.out.println(name+" will speak calm!!!");
	}
	
	public static void main(String[] args) {
		Musician m= new Musician();
		// Human m= new Musician();
		//Human m = new Human();
		
		m.name= "Jax";
		m.age = 51;
		m.gender = "Male";
		//m.playKeyboard(); //The method playKeyboard() is undefined for the type Human
		m.speak(); // it will call musician method when Human m= new Musician();
		// it will call human method when Human m = new Human();
		 // If we write like Musician mq= new Human();	
		//this then Type mismatch: cannot convert from Human to Musician
	
		m.keyboard.playSound();
	}
}
