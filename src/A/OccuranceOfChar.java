package A;

public class OccuranceOfChar {
	public static void main(String[] args) {
		int i ,len;
		
		int counter[]=new int[256];
		
		String a= "SNEHALRAJASMHATRE";
		
		len=a.length();
		for(i= 0;i<len;i++) {
			counter[(int)a.charAt(i)]++;
			System.out.println((int)a.charAt(i));
		}
		for(i=0;i<256;i++) {
			if(counter[i]!=0) {
				System.out.println((char)i+" >>> "+counter[i]);
				System.out.println(i+" >>> "+counter[i]);
			}
		}
	}
}	
