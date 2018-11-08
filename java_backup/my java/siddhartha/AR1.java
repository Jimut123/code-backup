import java.io.*;
class AR1
{
public static void main()throws IOException
{ 
String t="",v="";
BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter limit");
int n=Integer.parseInt(br.readLine());
String a[ ]=new String [n];
for(int i=0;i<n;i++)
{
System.out.println("Enter word");
a[i]=br.readLine();
}
for(int i=0;i<n;i++)
{
for(int k=i+1;k<n;k++)
{
if(a[i].length()>a[k].length())
{
  t=a[i];
  a[i]=a[k];
  a[k]=t;
}
}
}
for(int i=0;i<n;i++)
{
 System.out.println(a[i]);
}
}
}

