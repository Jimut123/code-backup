import java .io.*;
class kaprekar2
{
Kaprekar2(int x)
{
int n=x;
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
 ka=new Kaprekar2();
System.out.print("giv no");
int z=Integer.parseInt(bb.readLine());
//ka.Kaprekar2();
boolean kra=new checkKaprekar2();
}
}












