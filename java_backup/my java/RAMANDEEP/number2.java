import java.util.*;
public class number2
{
public void main(int n)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int i,n1=n,s=0,s1=0,k,max,min;
max=min=n1%10;
 while(n1>0)
 {
     k=n1%10;
     if(k>max)
     max=k;
     else if(k<min)
        min=k;
        n1=n1/10;
    }
    s=s1=0;
    for(i=max;i>=min;i--)
    {
        n1=n;
    while(n1>0)
    {
        k=n1%10;
        if(k==i)
        s=(s*10)+k;
        n1=n1/10;
    }
}
   for(i=min;i<=max;i++)
   {
       n1=n;
       while(n1>0)
       {
           k=n1%10;
           if(k==i)
           {
               s1=(s1*10)+k;
            }
            n1=n1/10;
        }
       
    }
     System.out.println(s);
        System.out.println(s1);
}
}












