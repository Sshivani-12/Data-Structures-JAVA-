class LinearSearch
     {
         public static void main(String [] args)
         {      
            java.util.Scanner s = new java.util.Scanner(System.in);
    
            int n ,num , pos=0,p=0;
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
	
	for(int i=0;i<n;i++)
	{
		if(x[i]==p)
		{
			pos=i+1;
			flag= true;
		
			break;
			}
		
	}
	
	if(flag==true)
	{
	System.out.println(pos);

	}
	else if(flag==false)
	{
		System.out.println("not in the list");

	}


    }
}