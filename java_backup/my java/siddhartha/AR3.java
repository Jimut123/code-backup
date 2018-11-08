import java.io.*;
class AR3
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
if((a[i].charAt(0)=='A')||(a[i].charAt(0)=='a'))
{
  System.out.println("The word is:"+a[i]);
}
else
{
System.out.println("There is no word starting with A or a");
}
}
}}



