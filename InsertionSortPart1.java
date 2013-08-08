

/* Head ends here */
import java.util.*;
public class InsertionSortPart1 {
       
          static void insertionSort(int[] ar) {
          int check = 0;
          int tmp = 0;
              int swap = 0;
              
              int size = ar.length;
              int swapindex = size;
              while(check ==0)
              {
                  swap = ar[size-1];
                  for(int i=size-1;i>=0;i--)
                  {
                      if(swap < ar[i])
                      {
                          tmp = ar[i];
                          ar[i+1] = tmp;
                          printArray(ar);
                          
                      }
                      if(swap > ar[i])
                      {
                          ar[i+1] = swap;
                          check = 1;
                          printArray(ar);
                          break;
                      }
                      
                  }
                  if(check ==0)
                  {
                      ar[0] = swap;
                      check = 1;
                      printArray(ar);
                  }
              
       }
          }
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           insertionSort(ar);
           
       }    
   }
