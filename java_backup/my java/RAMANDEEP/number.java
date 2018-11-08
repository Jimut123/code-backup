import java.util.*;
public class number
{
 public void main(int n)
 {
int k,x,n1;     
Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     n=n/10;
int count=0;
n1=n;
//System.out.println(n);
     while(n>0)
     {
         k=n%10;
        count++;
         n=n/10;
        }

x=(int)Math.pow(10,(count-1));
//System.out.println(x); 
n=n1;       
        n=n%x;
//System.out.println(n);     
        System.out.println(n*n);
        
    }
}

     