import java.io.*;
class ARR1
{
 public static void main(String ar[])throws IOException
 {
     InputStreamReader read=new InputStreamReader(System.in);
     BufferedReader in=new BufferedReader(read);
     System.out.println("Enter a no. of your choice");
     int n=Integer.parseInt(in.readLine());
     int a[]=new int[n];
     int i;
     for(i=0;i<n;i++)
     a[i]=Integer.parseInt(in.readLine());
     for(i=(n/2);i>=0;i--)
     System.out.println(a[i]);
     for(i=((n/2)+1);i<n;i++)
     System.out.println(a[i]);
    }
}