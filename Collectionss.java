import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

import java.util.Comparator;


class C implements Comparator<Integer>
{
	@Override
	public int compare(Integer a,Integer b)
	{
		if(a%10>b%10)
			return 1;
		return -1;
	}

}
public class Collectionss{
	public static void main(String args[]){
		List <Integer> c=new ArrayList<Integer>();
		c.add(43);
	c.add(342);	
	c.add(434);
	c.add(1);
	
//	c.insertAt(1,9);
//iterator or we can make use of enhance for loop

	/*	Iterator i=c.iterator();
	while(i.hasNext()){
	System.out.println(i.next());
	
}
*/

Comparator<Integer> com= new C();

Collections.sort(c);
Collections.sort(c,com);
/*for(int i:c){
	System.out.println(i);
}*/

c.forEach(System.out::println);
}
}
	//	Map <K,V> c=new Map<>();
//Set<Interger>=new HashSet<>();