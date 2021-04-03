import java.util.*;

public class sortingprac
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=s.nextInt();
		int a[]=new int[100];
		System.out.print("enter elements");

		for(int j=0;j<n;j++)
		{
		int no=s.nextInt();
		a[j]=no;
		}
		
		quickSort(a,0,n);

		for(int i=0;i<n;i++)
		{
		System.out.print(" " +a[i]);
		
		}
				
	}

public static int partition(int a[],int beg,int end)
{
	int loc,r,t,l,flag;
	loc=l=beg;
	r=end;
	flag=0;
	while(flag!=1)
	{
		while(a[loc]<=a[r] && (loc!=r))
		r--;
		if(loc==r)
			flag=1;
		else if(a[loc]>a[r])
		{
			t=a[loc];
			a[loc]=a[r];
			a[r]=t;
			loc=r;
		}
		if(flag!=1)
		{
		while(a[loc]>=a[l] && (loc!=l))
		l++;
		if(loc==l)
			flag=1;
		else if(a[loc]<a[l])
		{
			t=a[loc];
			a[loc]=a[l];
			a[l]=t;
			loc=l;
		}
		

		}
		
	}
	return loc;
}

static void quickSort(int a[],int beg,int end)
{
	int loc;
	if(beg < end)
	{
		loc=partition(a,beg,end);
		quickSort(a,beg,loc-1);
		quickSort(a,loc+1,end);
			
	}
}


}


