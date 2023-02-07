package PolymorphismDemo;

public class Cat extends DomesticAnimal {
	
		@Override
		public void eat() {
			// TODO Auto-generated method stub
			super.eat();
			System.out.println("I will eat meat as well");
		}
		
		public void run(boolean hsDanger) {
			if(hsDanger) {
				System.out.println("I am running at 48 km/h");
			}else {
				super.run();
			}
			
		}
		
		public static void main(String[] args) {
			Cat c = new Cat();
			
			c.setMinSpeed("24 Km/H");
			c.run();
			c.eat();
			c.run(true);
		}
}
