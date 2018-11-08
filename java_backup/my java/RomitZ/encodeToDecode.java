import java.io.*;
class encodeToDecode
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,k,m;
int s;
int a[]=new int[100];
s=0;
System.out.println("Give Term:");
k=Integer.parseInt(br.readLine());
System.out.println("Give Code:");
for(i=0;i<k;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<k;i++)
{
System.out.println(a[i]);
}
for(i=k-1;i>=0;i--)
{
s=(s*10)+a[i];
//System.out.println(s);
if(s>=65 && s<=90)
 {
     System.out.print((char)s);
     s=0;
    }
    else
    if(s>=97 && s<=122)
 {
     System.out.print((char)s);
     s=0;
    }
    else
    if(s==32)
 {
     System.out.print((char)s);
     s=0;
    }
}

}
}
