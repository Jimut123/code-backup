import java.io.*;
class Emirp
{
int n,rev,f;

Emirp(int nn)
{
    n=nn;
    rev=0;
    f=0;
}
int isPrime(int k)
{
   if(f<k)
   {
       if(k%f!=0)
       {
           f++;
           isPrime(k);
        }
    }
    if(f==k)
    return 1;
    else
    return 0;
}
void isEmirp()
{
    int copy=n,d,d1,d2;
    while(copy>0)
    {
        d=copy%10;
        rev=rev*10+d;
        copy=copy/10;
    }
    f=2;
    d1=isPrime(n);
    f=2;
    d2=isPrime(rev);
    System.out.println(rev);
    System.out.println(d1);
    System.out.println(d2);
    if(d1==d2)
     System.out.println(n+"Emirp No.");
    else
       System.out.println(n+"Not an Emirp No.");
   
}

public static void main()throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter any number");
    int n=Integer.parseInt(br.readLine());
    Emirp ob=new Emirp(n);
    ob.isEmirp();
}
}
