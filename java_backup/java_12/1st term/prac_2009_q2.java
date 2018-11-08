import java.io.*;
class prac_2009_q2
{
public static void main (String args [])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
String s,m="",t;
int l,i,c=0,k=0,min,j,q;
char ch;
System.out.println("Enter a single sentence.");
s=cd.readLine();
l=s.length();
for(i=0;i<l;i++)
{
    ch=s.charAt(i);
    if(ch==' ')
    {
        c=c+1;
    }
}
String a[]=new String[c+1];
for(i=0;i<l;i++)
{
    ch=s.charAt(i);
    if((ch!=' ')&&(ch!='.'))
    {
        m=m+ch;
    }
    else
    {
        a[k]=m;
        k++;
        m="";
    }
}
q=k--;
for(i=0;i<q-1;i++)
{
min=i;
for(j=i+1;j<q;j++)
{
if(a[min].length()>a[j].length())
{
min=j;
}
}
t=a[i];
a[i]=a[min];
a[min]=t;
}
System.out.println("Names in increasing order of their length:");
for(i=0;i<q;i++)
{
System.out.print(a[i]+" ");
}
System.out.print(".");
}
}
        
    