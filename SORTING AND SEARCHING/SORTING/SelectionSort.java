//smallest of all will be replaced by 1st unsorted number.


 class SelectionSort
    {
         public static void main(String [] args)
         {      
            java.util.Scanner s = new java.util.Scanner(System.in);
    
                int n ,pos=0,temp=0;
    
            System.out.println("\n Enter size : ");
                 n = s.nextInt();

                int [] x = new int[n];

            System.out.println("\n Enter numbers : ");
                 for(int i=0 ; i<n ; i++)
                 {
                    x[i] = s.nextInt();
                 }
		/*
		1 4 3 2 
		i j
		pos=0;temp=4;
		4>1..
		temp=1;
		pos=1;
		
		*/
		
		for(int i=0;i<n;i++)
		{
			temp=x[i];
			pos=i;
			for(int j=i+1;j<n;j++)
			{
				if(temp>x[j])
				{
					temp=x[j];
					pos=j;
				}
			}
			temp=x[i];
			x[i]=x[pos];
			x[pos]=temp;
		System.out.print("\n List : ");
                 for(int a : x) 
                 { 
                     System.out.print(" "+a);
                 }
		}
		
		
		}
	}
	 
