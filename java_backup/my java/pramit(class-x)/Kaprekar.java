import java .io.*;
class Kaprekar
{
Kaprekar(int x)
{
int n=x;
}
boolean checkKaprekar(int n)
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
Kaprekar ka=new Kaprekar(x);
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader bb=new BufferedReader(aa);
ka.Kaprekar();
boolean kra=new checkKaprekar();
}
}

