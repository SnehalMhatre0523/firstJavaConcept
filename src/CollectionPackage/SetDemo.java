package CollectionPackage;

import java.util.HashSet;

import EncapsulationDemo.Person1;

public class SetDemo {
	public static void main(String[] args) {
		HashSet<String> mySet = new HashSet<>();
		mySet.add("Apple");
		mySet.add("Orange");
		mySet.add("Grapes");
		mySet.add("Orange");
		mySet.add("Grapes");
		
		System.out.println("My set :"+mySet);
		
		for(String e:mySet) {
			System.out.println(e);
		}
		
		HashSet<String> newset= new HashSet<>(mySet);
		newset.add("Watermelon");
		
		System.out.println("Added new set with other set :"+newset);
		for (String e:newset) {
			System.out.println(e);
		}
		
		System.out.println("================================================");
		
		HashSet<Person1> myPerson1 = new HashSet<>();
		
		myPerson1.add(new Person1("ALEX", 22, "Female"));
		myPerson1.add(new Person1("ZIA", 23, "Female"));
		myPerson1.add(new Person1("ZIA", 23, "Female"));
		myPerson1.add(new Person1("MIA", 22, "Female"));
		myPerson1.add(new Person1("ALEX", 22, "Female"));
		myPerson1.add(new Person1("ZIA", 23, "Female"));
		
		for(Person1 p : myPerson1) {
			System.out.println(p.getName());
		}
		
		
	}
}
