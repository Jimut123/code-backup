import java.util.*;
public class convN2B
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println();System.out.println("no.");
    double d=sc.nextDouble();
    int x=(int)d;
    double y=d-(double)x;
    int z=0;int n=1;
    while(x>0)
    {
       z=(z*10)+(x%2);
        x=x/2;
    }
    //z=z*10+1;
    //z=z-n;
    System.out.print("binary :"+z);
    if(y>0)
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
}
}
}