package CollectionPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import EncapsulationDemo.Person1;

public class LinkHashSetTreeSetdemo {
	public static void main(String[] args) {
		LinkedHashSet<String> mySet = new LinkedHashSet<>();
		mySet.add("Apple");
		mySet.add("Orange");
		mySet.add("Grapes");
		mySet.add("Orange");
		mySet.add("Grapes");
		
		System.out.println("Hash set Link "+mySet);
		
		
		TreeSet<String> treeset = new TreeSet<>();
		treeset.add("a");
		treeset.add("q");
		treeset.add("c");
		System.out.println("TReeset :"+treeset);
		
		System.out.println("===========================================");
		
		TreeSet<Person1> mytreePesron = new TreeSet<>();
		mytreePesron.add(new Person1("Alex", 22, "Female"));
		mytreePesron.add(new Person1("ZIA", 21, "Female"));
		
		mytreePesron.add(new Person1("Zoo", 22, "Male"));
		mytreePesron.add(new Person1("ROM", 21, "Male"));
		for(Person1 p: mytreePesron) {
			System.out.println(p.getName());
		}
	}
}
