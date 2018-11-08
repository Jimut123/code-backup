import java.io.*;
class sortpro
{
public static void main(String args[])throws IOException
{
int a[]=new int[10];
int b[]=new int[10];
int c[]=new int[10];
int d[]=new int[10];
int i,j,g=1,temp=0,p=0,q=0,n;
int ch;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 10 no.s:");
g=1;
for(i=0;i<10;i++)
{
System.out.println("("+g+") Enter no.:");
a[i]=Integer.parseInt(input.readLine());
g++;
}
System.out.println("Enter 10 more no.s:");
g=1;
for(i=0;i<10;i++)
{
System.out.println("("+g+") Enter no.:");
b[i]=Integer.parseInt(input.readLine());
g++;
}
System.out.println("From :");
for(i=0;i<10;i++)
{
System.out.print(a[i]+" ");
}
System.out.println(" ");
System.out.println("        and");
System.out.println(" ");
for(i=0;i<10;i++)
{
System.out.print(b[i]+" ");
}
System.out.println(" ");
p=0;
q=1;
for(i=0;i<10;i++)
{
p=a[i]+b[i];
c[i]=p;
p=0;
q=a[i]*b[i];
d[i]=q;
q=1;
}
System.out.println("Sum:");
for(i=0;i<10;i++)
{
System.out.print(c[i]+" ");
}
System.out.println(" ");
System.out.println("Product:");
for(i=0;i<10;i++)
{
System.out.print(d[i]+" ");
}
System.out.println(" ");
int kk=1;
while(kk<=2)
{
System.out.println("Press 1 to sort sum array:");
System.out.println("Press 2 to sort product array:");
n=Integer.parseInt(input.readLine());
System.out.println("Press 3 to sort array using bubble sort technique:");
System.out.println("Press 4 to sort array using selection sort technique:");
System.out.println("Press 5 to sort array using select sort technique:");
System.out.println("Press 6 to exit:");
ch=Integer.parseInt(input.readLine());
switch(ch)
{
case 3:{//bubble sort
         if(n==1)
         {
         for(i=0;i<10;i++)
         {
         for(j=0;j<10-i-1;j++)
         {
         if(c[j]>c[j+1])
         {
         temp=c[j+1];
         c[j+1]=c[j];
         c[j]=temp;
         }
         }
         }
         System.out.println("Sum array in ascending order using bubble sort technique:");
         for(i=0;i<10;i++)
         System.out.print(c[i]+" ");
         }
         else
         if(n==2)
         {
         for(i=0;i<10;i++)
         {
         for(j=0;j<10-i-1;j++)
         {
         if(d[j]<d[j+1])
         {
         temp=d[j+1];
         d[j+1]=d[j];
         d[j]=temp;
         }
         }
         }
         System.out.println("Product array in descending order using bubble sort technique:");
         for(i=0;i<10;i++)
         System.out.print(d[i]+" ");
         }
         }
         break;
case 4:{//selection sort
         if(n==1)
         {
         for(i=0;i<10-1;i++)
         {
         for(j=i+1;j<10;j++)
         {
         if(c[i]>c[j])
         {
         temp=c[i];
         c[i]=c[j];
         c[j]=temp;
         }
         }
         }
         System.out.println("Sum array in ascending order using selection sort technique:");
         for(i=0;i<10;i++)
         System.out.print(c[i]+" ");
         }
         else
         if(n==2)
         {
         for(i=0;i<10-1;i++)
         {
         for(j=i+1;j<10;j++)
         {
         if(d[i]<d[j])
         {
         temp=d[i];
         d[i]=d[j];
         d[j]=temp;
         }
         }
         }
         System.out.println("Product array in descending order using selection sort technique:");
         for(i=0;i<10;i++)
         System.out.print(d[i]+" ");
         }
         }
         break;
case 5:{//select sort
         if(n==1)
         {
         i=0;
         j=0;
         while(i<(10-1))
         {
         j=i+1;
         while(j<10)
         {
         if(c[i]>c[j])
         {
         temp=c[i];
         c[i]=c[j];
         c[j]=temp;
         }
         j++;
         }
         i++;
         }
         System.out.println("Sum array in ascending order using select sort technique:");
         for(i=0;i<10;i++)
         System.out.print(c[i]+" ");
         }
         else
         if(n==2)
         {
         i=0;
         j=0;
         while(i<(10-1))
         {
         j=i+1;
         while(j<10)
         {
         if(d[i]<d[j])
         {
         temp=d[i];
         d[i]=d[j];
         d[j]=temp;
         }
         j++;
         }
         i++;
         }
         System.out.println("Product array in descending order using select sort technique:");
         for(i=0;i<10;i++)
         System.out.print(d[i]+" ");
         }
         }
         break;
case 6:System.exit(0);
        break;
}
System.out.println("");
kk=kk+1;
}
}
}

