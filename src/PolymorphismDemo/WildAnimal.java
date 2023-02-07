package PolymorphismDemo;

public class WildAnimal extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I will eat meat");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("i running at minium speed");
	}

}
