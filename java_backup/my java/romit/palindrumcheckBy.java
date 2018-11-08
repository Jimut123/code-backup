import java.io.*;
class palindrumcheckBy
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,k,l,n1;
void input()throws IOException
{
System.out.println("Enter The No.");
int n=Integer.parseInt(Input.readLine());
n1=n;
l=0;
k=rev(n);
System.out.println(k);
if(n1==k)
{
System.out.println("Palindrum No.");
}
else
System.out.println("Non Palindrum No.");
}
int rev(int k)
{
if(k<=0)
{
return l;
}
else
{
l=(l*10)+k%10;
return(rev(k/10));
}

} 
}