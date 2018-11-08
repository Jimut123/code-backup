import java.io.*;
class arrayarrange
{
public static void main(String args[])throws IOException
{
int a[]=new int[10];
int i,j,t,g=1,temp=0,max,min,c=0,c1=0,count=0,f=0,p=0,p1;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no.:");
//inputting no.s from user
g=1;
for(i=0;i<10;i++)
 {
  System.out.println("("+g+") Enter no.s into array:");
  a[i]=Integer.parseInt(input.readLine());
  g++;
 }
 
 //display of initial array
 System.out.println("Your no.s are :");
for(i=0;i<10;i++)
 {
 System.out.print(a[i]+"  ");
 }
 System.out.println("  ");
 
 //arranging array in descending order
for(i=0;i<10;i++)
 {
 for(j=0;j<10-i-1;j++)
  {
   if(a[j+1]>a[j])
    {
     temp=a[j+1];
     a[j+1]=a[j];
     a[j]=temp;
    }
   }
  }
 
 //display of array in descending order
 System.out.println("Your no.s are :");
for(i=0;i<10;i++)
 {
 System.out.print(a[i]+"  ");
 }
 System.out.println("  ");
   
   //actual arranging of total array
   max=a[0];
   min=a[10-1];
   c=0;
   c1=10-1;
   count=1;
   for(i=max;i>=min;i--)
    {
     f=0;
    //System.out.println(p1);
     if(count%2!=0)
      {
       for(j=0;j<10;j++)
        {
         if(a[j]==i)
          {
           p=j;
           f=1;
           break;
          }
        }
       if(f==1)
       {
       t=a[c];
       a[c]=a[p];
       a[p]=t;
       count++;
       c++;
       }
      }
      else
      {
       for(j=0;j<10;j++)
        {
         if(a[j]==i)
          {
           p=j;
           f=1;
           break;
          }
        }
       if(f==1)
       {
        t=a[c1];
        a[c1]=a[p];
        a[p]=t;
        count++;
        c1--;
       }
     }
   }
   
    //display of array in GIVEN order
 System.out.println("Your no.s are :");
for(i=0;i<10;i++)
 {
 System.out.print(a[i]+"  ");
 }
 System.out.println("  ");
}
}