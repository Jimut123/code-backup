import java.io.*;
class Java
{
public static void main (String args [])throws IOException
{
    System.out.print("\f");
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
      int [] arr = {25, 7, 7, 14, 14, 14, 21, 3, 3, 3, 5, 12, 12, 13, 13};
     int count = 1; 
     int max = 1;
     for (int k = 1; k < arr.length; k++) {
         System.out.print("k = "+k);
         if (arr[k-1] <= arr[k]) {
             count++;
             System.out.print("count = "+count+" max = "+max);
         } else {
             if (count > max) {
                 max = count;
                 System.out.print("max = "+max);
             }
             count = 1;
         }
         System.out.println();
     }
    
     System.out.println(count);
    
   }
  
}
