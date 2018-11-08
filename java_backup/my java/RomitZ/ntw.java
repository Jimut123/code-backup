import java .io.*;
class ntw
{
public static void main(String args[])throws IOException
{
BufferedReader Input =new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the Natural Number");
String m=Input.readLine();
int l,k,f=0,f1=0,i,S=0,L,N;
String A[]={"Zero","One","Two","Three","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Therteen","Forteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
String B[]={"Zero","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
String C[]={"Zero","One Hundred","Two Hundred","Three Hundred","Four Hundred","Five Hundred","Six Hundred","Seven Hundred","Eight Hundred","Nine Hundred"};
char h,ch,chr;
l=m.length();
if(l==3)
{
h=m.charAt(1);
k=(int)(h);
for(i=0;i<10;i++)
{
if(k==i)
{
System.out.print(C[i]);
}
}
ch=m.charAt(2);
L=(int)(ch);
chr=m.charAt(3);
N=(int)(chr);
S=(L*10)+N;
for(i=10;i<=19;i++)
{
if(S==i)
{
System.out.print(A[i]);
f=1;
}
}
if(f==0)
{
for(i=1;i<10;i++)
{
if(L==i)
{
System.out.print(B[i]);
f1=1;
}
}
if(f1==1)
{
for(i=1;i<10;i++)
{
if(N==i)
{
System.out.print(A[i]);
}
}
}
}
}
f=0;
if(l==2)
{
ch=m.charAt(1);
L=(int)(ch);
chr=m.charAt(2);
N=(int)(chr);
S=(L*10)+N;
for(i=10;i<=19;i++)
{
if(S==i)
{
System.out.print(A[i]);
f=1;
}
}
if(f==0)
{
for(i=1;i<=9;i++)
{
if(L==i)
{
System.out.print(B[i]);
}
}
for(i=1;i<=9;i++)
{
if(N==i)
{
System.out.print(A[i]);
}
}
}
}
else if(l==1)
{
h=m.charAt(1);
k=(int)(h);
for(i=0;i<=9;i++)
{
if(k==i)
{
System.out.println(A[i]);
}
}
}
}
}