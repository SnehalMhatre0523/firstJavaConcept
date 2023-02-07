package StringDemo;

public class StringSample {
	public static void main(String[] args) {
		String s1 = new String("WelCome");
		String s2 = new String("WelCome");
		
		if(s1==s2) {
			System.out.println("Pointitng to same location");
		}else {
			System.out.println("Pointing to different location");
		}
		
		String s3 = "WelCome";
		String s4 = "WelCome";
		
		if(s3==s4) {
			System.out.println("Pointitng to same location compare s3 and s4");
		}else {
			System.out.println("Pointing to different location compare s3 and s4");
		}
		
		String s5= "Welcome";
		s5.concat(" SNEHAL");
		System.out.println("String concatenate but not assign to S5 "+s5);
		s5=s5.concat(" SNEHAL");
		System.out.println("String concatenate and  assign to S5 "+s5);
		
		String s6 = "WelCome";
		String s7 = s6+ " to ";
		s6.concat(" to latest ");
		s7.concat(" version of ");
		
		s6 += " Java";
		System.out.println(" string s6 "+s6);
		System.out.println(" String s7 "+s7);
		
		
		
		
		
		
		
	}

}
