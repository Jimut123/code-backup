import java.io.*;
class FutureDate
{
 public static void main(String args[]) throws IOException
 { int count=0;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
     System.out.println("Enter The Day Number");
     int dd=Integer.parseInt(br.readLine());
     System.out.println("Enter The Month");
     int mm=Integer.parseInt(br.readLine());
     System.out.println("Enter The Year");
     int yyyy=Integer.parseInt(br.readLine());
     System.out.println("Enter Number Of Days After");
     int n=Integer.parseInt(br.readLine());
     if(yyyy%4==0 || yyyy%400==0)
     month[2]=29;
     else
     month[2]=28;
     while(count<n)
     {
         dd++;
         count++;
         if(dd>month[mm])
         {
             dd=1;
             mm++;
         }
         if(mm>12)
         {
          mm=1;
          yyyy++;
          if(yyyy%4==0 || yyyy%400==0)
          month[2]=29;
          else
          month[2]=28;
         }
     }
     System.out.println("Future Date="+ dd +"/"+mm+"/"+yyyy);
 }
}
              
     