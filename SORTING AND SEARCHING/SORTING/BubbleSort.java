 class BubbleSort
     {
         public static void main(String [] args)
         {      
            java.util.Scanner s = new java.util.Scanner(System.in);
    
                int n ,temp=0;
    
              System.out.println("\n Enter size : ");
                 n = s.nextInt();

                int [] x = new int[n];

              System.out.println("\n Enter numbers : ");
                 for(int i=0 ; i<n ; i++)
                 {
                    x[i] = s.nextInt();
                 }  
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				if(x[i]>x[j])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}			
		
		for(int i=0;i<n;i++)
		{
		System.out.print(" " +x[i]);	
		}
		
		}
}