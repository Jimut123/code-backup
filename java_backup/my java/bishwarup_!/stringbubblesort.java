import java.io.*;
class stringbubblesort
{
public static void main(String args[])throws IOException
{
String city[]={"DELHI","BANGALORE","AGRA","MUMBAI","CALCUTTA"};
String temp;
int i,j,n=5,k;
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if((city[j].compareTo(city[j+1])>0))
{
temp=city[j];
city[j]=city[j+1];
city[j+1]=temp;
}
}
}
for(k=0;k<=n-1;k++)
{
System.out.println(city[k]);
}
}
}


