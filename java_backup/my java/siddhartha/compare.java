import java.io.*;
class compare
{
 public static void main()throws IOException
 {
     int a[]={2,5,4,1,3};
     int d=a[0],b=a[0],h=0;
     int c;
     for(int i=0;i<5;i++)
     {
         //for(int c=0;c<5;c++)
        //{
            if(a[i]>d)
          {
             d=a[i];
            }
        //}
else
        //for(int f=0;f<5;f++)
           // {
                if(a[i]<b)
                b=a[i];
           // }
        
         h= h +a[i];
    }
    
        System.out.println("Minimum:"+d);
         System.out.println("Maximum:"+b);
          System.out.println("Sum:"+h);
        
    } 
    }