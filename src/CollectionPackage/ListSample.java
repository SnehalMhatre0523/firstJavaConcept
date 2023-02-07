package CollectionPackage;

import java.util.ArrayList;
import java.util.Collections;

import com.learningBase.Person;

import EncapsulationDemo.Person1;

public class ListSample {
	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		mylist.add("Apple");
		mylist.add(new Person1("Alex", 55, "Male"));
		System.out.println(mylist.get(0));
		System.out.println(((Person1)mylist.get(1)).getName());
		
		ArrayList<String> mylist1 = new ArrayList<String>();
		mylist1.add("Apple");
		mylist1.add("Grapes");
		mylist1.add(1,"Banana");
		mylist1.remove(0);
		//mylist1.add(new Person1("Alex", 55, "Male"));
		for(String fruit:mylist1) {
			System.out.println(fruit);
		}
		System.out.println("============================================");
		
		
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("Apple");
		arrayList1.add("Grapes");
		arrayList1.add("Banana");
		System.out.println("Before sorting : "+arrayList1);
		Collections.sort(arrayList1);
		for(String fruit1:arrayList1) {
			System.out.println(fruit1);
		}
		System.out.println("After sorting : "+arrayList1);
		System.out.println("============================================");
		
		ArrayList<Person1> myPersonList = new ArrayList<Person1>();
		myPersonList.add(new Person1("Alex", 23, "Male"));
		myPersonList.add(new Person1("Mia", 25, "Female"));
		myPersonList.add(new Person1("Tia", 17, "Female"));
		myPersonList.add(new Person1("Zia", 57, "Male"));
		Collections.sort(myPersonList);
		for (Person1 p: myPersonList) {
			System.out.println(p.getName());
		}
	}

}
