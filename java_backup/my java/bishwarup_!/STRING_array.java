import java.io.*;
class STRING_array
{
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
String a[]=new String[100];
int i,j,n;
System.out.print("GIVE term:");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
System.out.print("GIVE strings:");
a[i]=br.readLine();
}
String w="";
for(i=0;i<n-1;i++)
for(j=i+1;j<n;j++)
if(a[i].compareTo(a[j])>0)
{
w=a[i];
a[i]=a[j];
a[j]=w;
}
//display
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}