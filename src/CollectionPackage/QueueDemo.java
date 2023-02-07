package CollectionPackage;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("Apple");
		queue.add("Grapes");
		queue.add("Orange");
		for(String fruits:queue) {
			System.out.println(fruits);
		}
		System.out.println("Queue first element :"+queue.peek());
		System.out.println("Queue "+queue);
		queue.remove();
		System.out.println("Queue after remove 1st:"+queue);
		queue.poll();
		System.out.println("Queue first element :"+queue.peek());
		
		
		Queue<String> queue1 = new PriorityQueue<>();
		queue1.add("Grapes");
		queue1.add("Orange");
		queue1.add("Apple");
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		for(String fruits:queue1) {
			System.out.println(fruits);
		}
		System.out.println("Queue first element :"+queue1.peek());
		System.out.println("Queue "+queue1);
		queue1.remove();
		System.out.println("Queue after remove 1st:"+queue1);
		queue1.poll();
		System.out.println("Queue first element :"+queue1.peek());
		
		
		
		
		
	}
	
}
