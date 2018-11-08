import java.util.*;
public class Symmetric_matrix_generator
{
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any one side of square matrix");
int s=sc.nextInt();
int a[][]=new int[s][s];
int h=1;
for(int i=0;i<s;i++)
{
for(int j=i;j<s;j++)
{
a[i][j]=h;
a[j][i]=h;
h++;
}
}
for(int k=0;k<s;k++)
{
for(int p=0;p<s;p++)
{
if(a[k][p]>9)
{
System.out.print(" "+a[k][p]);
}
else
{
System.out.print("  "+a[k][p]);
}
}
System.out.println();
}
}
}

