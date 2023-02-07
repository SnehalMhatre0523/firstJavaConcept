package A;

public class AddNumOFDigit {
	public static void main(String[] args) {
		int number= 1234;
		int digit,sum = 0;
		while(number > 0) {
			digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		System.out.println(sum);
	}
}
