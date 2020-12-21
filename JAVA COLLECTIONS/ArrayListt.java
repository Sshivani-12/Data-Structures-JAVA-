//if you want to remove or add at end of list
import java.util.*;
public  class ArrayListt{
	public static void main(String[]args)
	{
		ArrayList <Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(32);
		a.add(52);
		System.out.println(a);
		System.out.println(a.get(0));
		
		//Iteration 
		System.out.println("final arraylist");
		for(int i=0;i<a.size();i++)
		{
		System.out.println(a.get(i));
			
		}
		//removing 
			a.remove(0);
				System.out.println("final arraylist removing");
	for(int i=0;i<a.size();i++)
		{
		System.out.println(+a.get(i));
			
		}
		
	}
}