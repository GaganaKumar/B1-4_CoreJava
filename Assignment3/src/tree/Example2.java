package tree;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) 
	{
		Queue<Integer>q=new PriorityQueue<Integer>();
		q.offer(4);
		q.offer(8);
		q.add(12);
		q.add(16);
		q.add(20);
		System.out.println(q);
		System.out.println("The remove is:"+q.peek());
		System.out.println(q);
		System.out.println("The head is:"+q.peek());

	}

}
