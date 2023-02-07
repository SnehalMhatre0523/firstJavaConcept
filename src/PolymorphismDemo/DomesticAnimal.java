package PolymorphismDemo;

public class DomesticAnimal extends Animal {

	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I will eat milk");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("i am running at "+getMinSpeed());
	}

}
