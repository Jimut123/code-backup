import java.util.*;
class Nelson
{
    int n;
     void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        n=sc.nextInt();
        if(check(n)==1)
        System.out.println("Nelson...");
        else
        System.out.println("Non Nelson...");
    }
    int check(int n)
    {
        int dig, d1, n1,a;
        d1=n%10;
        n1=n/10;
        a=0;
        while(n1>0)
        {
dig=n1%10;
if(dig!=d1)
{
    a=1;
    break;
}
n1=n1/10;
}
if (a==0)
 return 1;
else
return 0; 
}
public static void main(String args[])
{
    Nelson nl=new Nelson();
    nl.input();
   
}
}