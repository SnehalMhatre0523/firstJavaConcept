package InterfaceDemo;

public interface HumanTemp {
	default public void speak() {
		System.out.println("Hey , I am from humantemp Interface");
	}
}
