import java.util.*;
public  class StackCollection{
	public static void main(String[]args)
	{
		//it does not manage same order
		Stack a=new Stack<>();
		a.add(2);
		a.add(24);
		a.add(12);
		a.add(12);
		
		System.out.println(a);
		
		System.out.println(a.pop());
		System.out.println(a.peek());
		
		System.out.println(a.contains(4));
		System.out.println(a.empty());
		
		System.out.println(a.get(2));
		
		
		
		
}
}