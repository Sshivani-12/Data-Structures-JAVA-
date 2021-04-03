public class Pattern1
{
public static void main(String []args)
{
		int n=0;
	
for(int i=1;i<=6;i++)
	{
	if(i%2!=0)
	{
		for(int j=1;j<=i;j++)
		{
			n=n+1;
			System.out.print(n);
		}
		
	}	
	else
	{
		for(int j=i;j>=0;j--)
		{
			n=n+1;
			System.out.print(n);
		}

	
	}	
			System.out.println();
		
	}
	


/*
654321
65432
6543
654
65
6
	for(int i=1;i<=6;i++)
	{
		for(int j=6;j>=i;j--)
		{
			System.out.print(j);
		}
		
			System.out.println();
		
	}
	*/
	/*
	1
	121
	12321
	1234321
	123454321
	for(int i=1;i<6;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		for(int k=i-1;k>=1;k--)
		{
			System.out.print(k);
		}
		
			System.out.println();
		
	}
	*/
	
	/*
	1
	2 1
	3 2 1
	for(int i=1;i<4;i++)
	{
			
		for(int j=i;j>=1;j--)
		{
		
			System.out.print(j);
	
		}
			System.out.println();
		
	}
	*/
	
	/*
	1
	23
	456
	int k=0;
	for(int i=1;i<4;i++)
	{
			
		for(int j=1;j<=i;j++)
		{
					k=1+k;
			System.out.print(k);
	
		}
			System.out.println();
		
	}
	*/
	
	/*
	1
	22
	333
	
	for(int i=1;i<4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(i);
		}
			System.out.println();
		
	}
	
*/
	/*
	X X X X 
	X     X
	X     X
	X X X X
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
		
		if(i==0||j==0||i==4||j==4)
		{
			System.out.print(" ");
		
		}
		else
		{
			System.out.print("*");
		
		}
		}
			System.out.println();
		
	}	
	*/
	
	
	
	/*
	
  *     *
   *   *
    * *
     *
	for(int i=5;i>=0;i--)
	{
		for(int k=5;k>=i;k--)
		{
			System.out.print(" ");
		}
		
		
		for(int j=1;j<(2*i);j++)
		{
		if(j>1 && j<(i*2)-1)
		{
		System.out.print(" ");

		}
		else
		{
		System.out.print("*");

		}

		}
		
				

		System.out.println();
		
		
	}
	*/
	
	/*
	
	 *
    * *
   *   *
  *     *
	for(int i=1;i<=5;i++)
	{
		for(int k=5;k>=i;k--)
		{
			System.out.print(" ");
		}
		
		
		for(int j=1;j<(2*i);j++)
		{
		if(j>1 && j<(2*i)-1)
		{
		System.out.print(" ");

		}
else{
				System.out.print("*");

}
		}
		
		

		System.out.println();
		
		
	}
	
	*/
	
	/*
	_ _ X
	_ X
	X
	
	for(int i=0;i<=4;i++)
	{
		for(int k=3;k>=i;k--)
		{
			System.out.print(" ");
		}
		
		
		for(int j=0;j<=4;j++)
		{
			if((i+j)==(5-1))
			{
			System.out.print("*");
			
			}
			else{
				System.out.print(" ");
		
			}
			
		}
		
			System.out.println();
		
	}
	
	*/
	/*
	X
	_ X
	_ _ X
	_ _ _ X
	
	for(int i=0;i<=4;i++)
	{
		for(int j=0;j<=i;j++)
		{
		if(i==j)
		{
		System.out.print("*");			
		}
		else
		{
		System.out.print(" ");			
			
		}

		}
		System.out.println();
		
		
	}
	
	
	
	*/
	/*
	# # # # # # #
	  # # # # #
	    # # #
		  #
	
	for(int i=0;i<=4;i++)
	{
		for(int k=0;k<=i;k++)
		{
			System.out.print(" ");
		}
		
		
		for(int j=4;j>=i;j--)
		{
			System.out.print("*");
		}
		
		for(int l=3;l>=i;l--)
		{
			System.out.print("*");
		}
				

		System.out.println();
		
		
	}
	
	
	*/
	/*
	_ _ #
	_ # # #
	# # # # #
	
	for(int i=0;i<=4;i++)
	{
		for(int k=4;k>=i;k--)
		{
			System.out.print(" ");
		}
		
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		
		for(int l=2;l<=i;l++)
		{
			System.out.print("*");
		}
				

		System.out.println();
		
		
	}
	
	*/
	/*
	
	###
	 ##

	for(int i=0;i<=4;i++)
	{
		for(int k=0;k<=i;k++)
		{
			System.out.print(" ");
		}
		
		
		for(int j=4;j>=i;j--)
		{
			System.out.print("*");
		}
			System.out.println();
		
	}
	*/
	/*
	_ _ #
	_ # #
	# # #
	
	for(int i=0;i<=4;i++)
	{
		for(int k=3;k>=i;k--)
		{
			System.out.print(" ");
		}
		
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
			System.out.println();
		
	}
	
	*/
	
	
	
	/*
	#
	# #
	# # #
	
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(" * ");
		}
			System.out.println();
		
	}
	
	###
	##
	#
	for(int i=0;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" * ");
		}
			System.out.println();
		
	}
	
	*/
	
}
}