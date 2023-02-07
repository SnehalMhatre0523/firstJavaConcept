package StringDemo;

public class StringClassMethod {

	public static void main(String[] args) {
		String s1 = " Welcome to Java ";
		String s2 = " Welcome to Java ";
		String s3 = " welcome to java ";
		System.out.println("Char at 0 position in s1 "+s1.charAt(0));
		System.out.println(s1.concat(" :::: "));
		//same as above instead of concat used +
		System.out.println(s1 + " :::: ");
		System.out.println("Check s1 and s2 equals : "+s1.equals(s2));
		
		System.out.println("Check s1 and s3 equals with ignore case: "+s1.equalsIgnoreCase(s3));
	
		System.out.println("Length s1 : "+s1.length());
		
		System.out.println(" replace : "+s1.replace(" ", "-"));
		
		System.out.println("Sub string begining index : "+s1.substring(11));
		
		System.out.println("Sub string begining index plus end index: "+s1.substring(0, 7));
		
		System.out.println("String to lower case : "+s1.toLowerCase());
		
		System.out.println("String to upper case : "+s1.toUpperCase());
		
		System.out.println("Trim method will remove extra spaces from starting and ending :"+s1.trim());
	
	}
}
