import java.util.*;

class LinkedListt{
	public static void main(String args[])
	{
		LinkedList <Integer>l =new LinkedList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(3,2);
		l.add(1);
		l.addFirst(5);
		l.addLast(6);
		System.out.println("element retrived "+l);
		
		System.out.println(l.indexOf(1));
		System.out.println("element retrived "+l);
		
		System.out.println(l.lastIndexOf(1));
		System.out.println("element retrived "+l);
		
	//element will be entered at end
		System.out.println("offerlast"+l.offerLast(10));
		System.out.println("element retrived "+l);
		
		l.set(3,0);
		System.out.println("element retrived "+l);
	//linked list to arrays
	//int le=l.size();
	String [] s =new String[le];
	l.toArray()	;
	System.out.println(s);
	*/
	System.out.println("element is "+l.get(2));
	System.out.println("element retrived "+l);
	
	System.out.println("first element is "+l.getFirst());
	System.out.println("element retrived "+l);
	
	System.out.println("last element is "+l.getLast());
	System.out.println("element retrived "+l);
	
	System.out.println("Peek "+l.peek());
	System.out.println("element retrived "+l);
	
	System.out.println("Peekfirst " +l.peekFirst());
	System.out.println("element retrived "+l);
	
	
	System.out.println("PeekLAst "+l.peekLast());
	System.out.println("element retrived "+l);
	//1st element is displayed and then deleted.
	System.out.println("Poll " +l.poll());
	System.out.println("element retrived "+l);
	
	System.out.println("PollFirst " +l.pollFirst());
	System.out.println("element retrived "+l);
	
	System.out.println("PollLast " +l.pollLast());
	System.out.println("element retrived "+l);
	
	System.out.println("Pop " +l.pop());
	System.out.println("element retrived "+l);
	//deletes from 2 position
	System.out.println("remove " +l.remove(2));
	System.out.println("element retrived "+l);
	
	
	Iterator <Integer> li=l.iterator();
	while(li.hasNext())
	{
	System.out.print(" "+li.next());
		
	}
	
	}
	
}