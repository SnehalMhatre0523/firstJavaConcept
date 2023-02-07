package InheritancePack;

public class TempHuman {
	
	public static void letsWalk(Human h) {
		h.walk();
	}
	
	public static void main(String[] args) {
		Artists a = new Artists();
		a.name ="Lucia";
		
		Musician b = new Musician();
		b.name="Jax";
		
		letsWalk(b);
		letsWalk(a);
		
		if(a.equals(b)) {
			System.out.println("both are equal");
		}else {
			System.out.println("Both are not equal");
		}
	}
}
