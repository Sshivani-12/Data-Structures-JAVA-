         
     class Array6
     {
         public static void main(String [] args)
         {      
            java.util.Scanner s = new java.util.Scanner(System.in);
    
                 int size , i , j,temp;
                  boolean flag;
   
              System.out.println("\n Enter size : ");
                 size = s.nextInt();

                int [] x = new int[size];

              System.out.println("\n Enter size : ");
                 for(i=0 ; i<size ; i++)
                 {
                    x[i] = s.nextInt();
                 }  

          for(i=0 ; i<size ; i++)
          {
                 flag = true;

              for(j=0 ;  j<size-1-i ; j++)
              {
                  if(x[j] > x[j+1])
                  {
                     flag = false;
                     temp = x[j];
                     x[j] = x[j+1];
                     x[j+1] = temp; 
                  }
              }
          
              System.out.print("\n List : ");
                 for(int a : x) 
                 { 
                     System.out.print(" "+a);
                 }

               if(flag)
               {
                     break;
               } 
         }
 
         }
     }

























