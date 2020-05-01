package week_11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueConcept {

	public static void main(String[] args) {
		
		/*
		 * We cannot create instance of a Queue as it is an interface
		 * we can create instance of LinkedList or
		 * PrirotyQueue and assign it to Queue 
		 * FIFO (First in first out)
		 * 
		 */
		
		Queue<String> q = new LinkedList<String>();
		
		//Add
		q.add("Rick");
		q.add("Maggie");
		q.add("Ismail");
		q.add("Jackson");
		q.add("Robert");
		
		System.out.println("Elements in Queue: "+ q);
		
		//remove method
		System.out.println("Removed element: "+ q.remove());
		
		//this returns the head of the Queue
		System.out.println("Head of elem: "+ q.element());
		
		//Poll method()-- this removes and returns the head of the Queue -- null
		System.out.println("Poll: "+ q.poll());
		
		System.out.println("peek "+q.peek());
		
		System.out.println("Elements in Queue: "+ q);
		

	}

}
