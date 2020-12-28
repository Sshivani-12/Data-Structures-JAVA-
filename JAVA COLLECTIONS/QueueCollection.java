import java.util.*;
public  class QueueCollection{
	public static void main(String[]args)
	{
		//it does not manage same order
		Queue a=new LinkedList<>();
		a.add(2);
		a.add(24);
		a.add(12);
		a.add(12);
		System.out.println(a);
		
		System.out.println(a.poll());

	System.out.println(a);	
	//in sorted order
		Queue q=new PriorityQueue<>();
		q.add(20);
		q.add(24);
		q.add(2);
	
	System.out.println(q);
	//smallest ele,ent will be deleted
	
	System.out.println(q.poll());
		
	System.out.println(q);
	}
}