package B;

public class demoReverseString {
	
	public static void main(String[] args) {
		char ch;
		String nstr="";
		String str="HAPPY";
		
		for (int i =str.length()-1; i>=0;i--) {
			ch=str.charAt(i);
			System.out.println(ch);
			nstr=nstr+ch;
		}
		
		System.out.println(nstr);
	}
}
