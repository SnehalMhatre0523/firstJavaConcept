package CollectionPackage;

import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		Vector<String> mylist = new Vector<>();
		mylist.add("A");
		mylist.add("B");
		mylist.add("C");
		for (String s: mylist) {
			System.out.println(s);
		}
		
	}
}
