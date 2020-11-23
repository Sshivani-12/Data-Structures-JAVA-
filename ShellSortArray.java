         
     class Array7
     {
         public static void main(String [] args)
         {      
            java.util.Scanner s = new java.util.Scanner(System.in);
    
                 int size , i , j,temp , small , pos;
   
              System.out.println("\n Enter size : ");
                 size = s.nextInt();

                int [] x = new int[size];

              System.out.println("\n Enter size : ");
                 for(i=0 ; i<size ; i++)
                 {
                    x[i] = s.nextInt();
                 }  


         for(i=0 ; i<size; i++) 
         { 
               small = x[i];
                 pos = i;

             for(j=i+1 ; j<size ; j++)
             {
                 if(small > x[j])
                 {
                    small = x[j];
                     pos = j;
                 } 
             }
          
                temp = x[i];
                x[i] = x[pos];
                x[pos] = temp; 

              System.out.print("\n List : ");
                 for(int a : x) 
                 { 
                     System.out.print(" "+a);
                 }
         }
 
         }
     }






































