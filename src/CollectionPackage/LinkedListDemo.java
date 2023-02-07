package CollectionPackage;

import java.util.LinkedList;

public class LinkedListDemo {
		public static void main(String[] args) {
			LinkedList<String> myList = new LinkedList<>();
			myList.add("c");
			myList.add("a");
			myList.add("z");
			myList.add("i");
			
			System.out.println(" Mylist : "+myList);

			System.out.println("First element : "+myList.getFirst());
			System.out.println("get last element : "+myList.getLast());
			
			System.out.println("+++++++++++++++++++++++++++++++++++++");
			
			for (String a:myList) {
				System.out.println(a);
			}
			
			System.out.println(" remove :"+myList.remove());
			System.out.println(" my list "+myList);
			
			
		}
}
