//each element is inserted at correct location.

class InsertionSort
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
	0	1	2	3	4			
	40	2 	50 	21	4 7
	j  	i,
		
			temp=50
		
		
		
		   
*/	

			for(int i=1;i<n;i++)
			{
				int j=i-1;
				temp=x[i];
				while(j>=0 && x[j]>temp)
				{
					x[j+1]=x[j];
					j--;
				}
				x[j+1]=temp;
			}
			System.out.print("\n List : ");
                 for(int a : x) 
                 { 
                     System.out.print(" "+a);
                 }
         	 
		 }
	}