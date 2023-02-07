package PolymorphismDemo;

public class Cheetas extends WildAnimal {

	public static void main(String[] args) {
		Cheetas c = new Cheetas();
		c.setMinSpeed("90 - 130 Km/h");
		c.eat();
		c.run();
	}
}
