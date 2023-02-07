package StringDemo;

public class StringBufferAndBuilder {
	public static void main(String[] args) {
		String s1 = "WelCome to JAVA";
		s1.concat(" :: ");
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("Welcome to JAVA");
		s2.append(" :: ");
		System.out.println("Append method :"+s2);
		System.out.println("Char at 0 for s2 : "+s2.charAt(0));
		System.out.println("Delete method for s2 : "+s2.delete(1, 4));
		System.out.println("Insert into string s2 : "+s2.insert(1, "aa"));
		
		StringBuilder s3 = new StringBuilder("Welcome to C++");
		s3.append(" >>>. ");
		System.out.println("Append method :"+s3);
		
		System.out.println("Char at 0 for s3 : "+s3.charAt(0));
		
		System.out.println("Delete method for s3 :"+s3.delete(11, 12));
		
		System.out.println("Insert into string s3 : "+s3.insert(5, "SR"));
	}
}
