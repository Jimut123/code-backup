import java.io.*;
class Alphabetical_order
{
public static void main (String args [])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
String s,m="",t;
int i,l,c=0,j;
char ch;
System.out.println("Enter a sentence:");
s=cd.readLine();
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{
    ch=s.charAt(i);
    if(ch==' ')
    {
        c++;
    }
}
c++;
String w[] = new String[c];
c=0;
for(i=0;i<l;i++)
{
    ch=s.charAt(i);
    if(ch!=' ')
    {
        m=m+ch;
    }
    else
    {
        w[c++]=m;
        m="";
    }
    
}

for(i=0;i<c-1;i++)
{
for(j=i+1;j<c;j++)
{
if(w[i].compareTo(w[j])>0)
{
    t=w[i];
    w[i]=w[j];
    w[j]=t;
}
}
}
for(i=0;i<c;i++)
{
    System.out.print(w[i]+" ");
}
}
}























