import java .io.*;
class kap2
{
kap2(int x)
{
int n=x;
if(checkKaprekar2( n)==true)
System.out.println("Kaprekar:"+x);
else
System.out.println("Non Kaprekar:"+x);
}
boolean checkKaprekar2(int n)
{
int d=(n*n);
int w;
w=0;
for(int i=n;i>0;i=i/10)
{
int p=n%10;
w=w+p;
}
if(n==w)
{
return true;
}
else
{
return false;
}
}
public static void main (String[]args)throws IOException
{
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader bb=new BufferedReader(aa);
 
System.out.print("giv no");
int z=Integer.parseInt(bb.readLine());
kap2 k=new kap2(z);
//ka.Kaprekar2();
boolean kra=k.checkKaprekar2(z);
}
}
