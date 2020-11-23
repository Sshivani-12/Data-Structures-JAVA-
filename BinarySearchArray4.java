         
     class Array4
     {
         public static void main(String [] args)
         {      
            java.util.Scanner s = new java.util.Scanner(System.in);
    
                int size , i , num , pos=0;
                      int beg, end , mid;            
 
              System.out.println("\n Enter size : ");
                 size = s.nextInt();

                int [] x = new int[size];

              System.out.println("\n Enter size (in asc order): ");
                 for(i=0 ; i<size ; i++)
                 {
                    x[i] = s.nextInt();
                 }  

              System.out.println("\n Enter num to be searched : ");
                 num = s.nextInt();

                   beg=0 ; end = size-1;

                  while(beg <= end)
                  {
                       mid = (beg + end) / 2;
                      
                       if(num == x[mid])
                       {
                           pos = mid+1;
                              break;
                       } 
                       else if(num < x[mid])
                       {
                          end = mid-1;  
                       } 
                       else
                       {
                           beg = mid+1;
                       } 
                  }  

               if(pos == 0)
                  System.out.println("\n NUM NOT FOUND ");  
               else 
                  System.out.println("\n pos = "+pos);  
         }
     }











