package ExeceptionDemoPk;

public class ExeceptionSample {
	static int userInput=0;
	public static void main(String[] args)  {
		
		try {
			userInput = Integer.parseInt("9");
			String[] fruits = {"banana","watermelons","Apple","oranges"};
			System.out.println("User Picked :"+fruits[userInput-1]);
			throw new MyExeception("Hello Exeception manually created");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Number.");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			//System.out.println("Give number between 1 to 4");
			throw new ArrayIndexOutOfBoundsException("Give Numbers between 1 to 4");
		}catch (Exception e) {
			System.out.println("Something went wrong");
		}finally {
			System.out.println("Execute all the time");
		}
		
		try {System.out.println("Hello");}finally {System.out.println("hello");}
		
		
		doSomething();
		
		
	}
	
	public static void doSomething() throws ArrayIndexOutOfBoundsException,NumberFormatException{
		userInput = Integer.parseInt("9");
		String[] fruits = {"banana","watermelons","Apple","oranges"};
		System.out.println("User Picked :"+fruits[userInput-1]);
	}

}
