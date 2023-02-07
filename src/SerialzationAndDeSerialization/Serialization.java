package SerialzationAndDeSerialization;

import java.io.*;

public class Serialization {
	
	public static void main(String[] args) throws IOException {
		Vehicle polo = new Vehicle("Volkswagen", "poloGt", 2021);
		FileOutputStream fileout = new FileOutputStream("polo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(polo);
		out.close();
		fileout.close();
		System.out.println("Serilized data is save in polo.ser");
	}

}
