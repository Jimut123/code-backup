import java.io.*;
class AR2
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
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i].compareTo(a[j])>0)
{
  t=a[i];
  a[i]=a[j];
  a[j]=t;
}
}
}
for(int i=0;i<n;i++)
{
 System.out.println(a[i]);
}
}
}

