class BinarySearch
     {
         public static void main(String [] args)
         {      
            java.util.Scanner s = new java.util.Scanner(System.in);
    
            int n , pos=0,p=0;
			int beg=0;
            boolean flag=false;

              System.out.println("\n Enter size : ");
                 n = s.nextInt();

                int [] x = new int[n];

				System.out.println("\n Enter size (in asc order): ");
                for(int i=0 ; i<n ; i++)
                {
                    x[i] = s.nextInt();
                }  
				
			 System.out.println("\n Find Number: ");
                 p = s.nextInt();
	
	
	
			int end=n-1;
			while(beg <=end)
			{
			int mid=(beg+end)/2;
			
			if(x[mid]==p)
			{
				pos=mid+1;
				break;
			}
			else if(x[mid]<p)
			{
				beg=mid+1;
			}
			else
			{
				end=beg-1;
			}
			
			}
	
	if(pos==0){
	System.out.println("-1");
		
	}
	else
	{
	System.out.println(pos);
		
	}
	
	
    }
}