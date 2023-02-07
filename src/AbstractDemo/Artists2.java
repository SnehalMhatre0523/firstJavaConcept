package AbstractDemo;

import InheritancePack.Human;

public class Artists2 extends Human3 {
	
	
	public static void main(String[] args) {
		Artists2 a = new Artists2();
		a.walk();
		a.speak();
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("this is from artist");
	}

	
}
