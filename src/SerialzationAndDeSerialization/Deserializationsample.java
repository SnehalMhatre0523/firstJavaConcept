package SerialzationAndDeSerialization;

import java.io.*;

public class Deserializationsample {
	
	public static void main(String[] args) {
		Vehicle polo = null;
		try {
			FileInputStream fileIn = new FileInputStream("polo.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			polo= (Vehicle)in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException io) {
			io.printStackTrace();
		}catch(ClassNotFoundException clnF) {
			clnF.printStackTrace();
		}
		System.out.println(polo.model);
	}
}
