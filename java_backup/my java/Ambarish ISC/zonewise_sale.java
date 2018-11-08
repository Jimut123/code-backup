import java.io.*;
class zonewise_sale
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,s,k;
int a[][]=new int[4][5];
String b[]=new String[4];
String c[]=new String[5];
System.out.println("Enter Four Zone Name:");
for(i=0;i<4;i++)
b[i]=br.readLine();
System.out.println("Enter Five Product Name:");
for(i=0;i<5;i++)
c[i]=br.readLine();
System.out.println("Enter Values of Products");
for(i=0;i<4;i++)
for(j=0;j<5;j++)
a[i][j]=Integer.parseInt(br.readLine());
k=0;
for(i=0;i<5;i++)
{
    System.out.println("Product Name:"+" "+c[i]+" ");
    s=0;
    for(j=0;j<4;j++)
      s=s+a[j][k];
    System.out.println("Product total sale:"+" "+s);  
    System.out.println("");  
    k++;
}
k=0;
for(i=0;i<4;i++)
{
    System.out.println("Zone Name:"+" "+b[i]+" ");
    s=0;
    
     for(j=0;j<5;j++)
      s=s+a[k][j];
    System.out.println("Zone total sale:"+" "+s); 
    k++;
}
}
}
