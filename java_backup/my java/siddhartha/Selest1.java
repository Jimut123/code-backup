
import java.io.*;
class Selest1
{
  public static void main()throws IOException
  {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  int t=0;
    int a[]={17,23,7,15,23,54,35};
    for(int i=0;i<=6;i++)
    {
        for(int j=i+1;j<=7;j++)
       {
           if(a[i]< a[j])
       { 
           t=a[j];
           a[j]=a[i];
           a[i]=t;
        }}
    t=0;
    }
       for(int i=0;i<=6;i++)
       {
           for(int j=i+1;j<=7;j++)
           {
         System.out.println(a[i]);
        }}
        
  
}
}

    