package PolymorphismDemo;

public class Elephant extends WildAnimal {
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(" I will eat Fruits");
	}

	public static void main(String[] args) {
		Elephant e = new Elephant();
		e.setMinSpeed("20 Km/H");
		e.eat();
		e.run();
	}
}
