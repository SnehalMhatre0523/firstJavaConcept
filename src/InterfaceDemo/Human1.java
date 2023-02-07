package InterfaceDemo;

public interface Human1 {
	String BLOOD_COLOUR = "Red";
	
	
	public void walk();
	
	default public void check() {
		System.out.println("Simple added normal method without def then class which"
				+ "implement this inter face shows error but if i type as default then error gone");
	}
	
	default public void speak() {
		System.out.println("Hey , I am from Human Interface");
	}
}
