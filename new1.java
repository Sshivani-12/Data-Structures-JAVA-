import java.util.*;
public class new1
{
public static void main(String []args)
{
	int a[]={2,1,3};
	int b[]=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i]*a[i];
	}
	Arrays.sort(b);
	
	System.out.println(b);
	
}
}