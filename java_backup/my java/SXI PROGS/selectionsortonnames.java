import java.io.*;
class selectionsortonnames 
{                                                          
public static void main()throws IOException
{                                                         
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,p,j;
System.out.println("Enter the size");
n=Integer.parseInt(br.readLine());
String s[]=new String[n];
String t="";
String a="";
for(i=0;i<n;i++)
{
    System.out.println("Enter the names in upper case");
    s[i]=br.readLine();
    a=s[0];
}
for(i=0;i<n-1;i++)
{
    a=s[i];
    p=i;
  for(j=i+1;j<n;j++)
  {
      if(s[j].compareTo(a)<0)
      {
          a=s[j];
          p=j;
        }
    }  
  a=s[i];      
  s[i]=s[p];
  s[p]=a;
}
for(i=0;i<n;i++)
{
   System.out.println("The names in sorted order is:");
   System.out.println(s[i]);
}
}
}
/**
  Enter the size
4
Enter the names in upper case
Ambarish
Enter the names in upper case
Rajarshi
Enter the names in upper case
Sagar
Enter the names in upper case
Rajdeep
The names in sorted order is:
Ambarish
The names in sorted order is:
Rajarshi
The names in sorted order is:
Rajdeep
The names in sorted order is:
Sagar
 */   