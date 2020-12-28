//if you want to remove or add at end of list
import java.util.*;
public  class SetCollection{
	public static void main(String[]args)
	{
		//it does not manage same order
		Set <Integer> a=new HashSet<Integer>();
		//manages the order 
		Set <Integer> b=new LinkedHashSet<Integer>();
		//sort the elements
		Set <Integer> c=new TreeSet<Integer>();
		c.add(32);
		c.add(52);
		c.add(12);
		System.out.println(c);
		
		/*if(c.isEmpty())
		{
		System.out.println("not empty");
			
		}
		*/
		Set <Integer> set2=new TreeSet<Integer>();
		set2.add(2);
		set2.add(23);
		set2.add(12);
		System.out.println(set2);
		
		System.out.println(c.containsAll(set2));
		
		//union
		c.addAll(set2);
		System.out.println("union"+c);
		
		
		//intersection
		c.retainAll(set2);
		System.out.println("hell"+c);
		
		
		
		
		
		
	}
}