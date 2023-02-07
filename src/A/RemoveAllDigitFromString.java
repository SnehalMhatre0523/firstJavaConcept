package A;

public class RemoveAllDigitFromString {
	public static void main(String[] args) {
		String str="HELLOSNEHAL21343534";
		String resultStr="";
		char[] charArray = str.toCharArray();
		
		for(int i=0;i< charArray.length;i++) {
			if(!Character.isDigit((charArray[i]))) {
				resultStr += charArray[i];
			}
		}
		System.out.println(resultStr);
	}
}
