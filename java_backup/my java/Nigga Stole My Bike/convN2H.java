import java.util.*;
public class convN2H
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println();System.out.println("no.");
    double d=sc.nextDouble();
    int x=(int)d;
    double y=d-(double)x;
    int z=1;int n=0;
    int a[]=new int[126];
    System.out.println("Hex : ");
    while(x>0)
    {
       a[n]=(x%16);
      n++;
        x=x/16;
        
    }
    for(int i=0;i<n;i++)
    {
        if (a[i]>9)
        {
            a[i]=64+a[i]-9;
            }
    }
    for(int i=n-1;i>-1;i--)
    {
        if(a[i]<=9)
        {
            System.out.print(a[i]);
        }
        else
        {
            System.out.print((char)a[i]);
        }
    }
    System.out.println();
    /*
    {
     System.out.print(".");   
    int j=0;
    
    while(y>0)
    {
        y=y*2;
       if(y<1.00)
       {
       System.out.print("0");
       //y=y*2;
       j++;
    }
    else
    {
       System.out.print("1");
       y=y-1;
       j++;
    }
    //System.out.println("binary :"+z);
    if(j>4)
    break;
    }
    //System.out.println("binary :"+z);
    */
}
}
