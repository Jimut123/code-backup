import java.io.*;
class prac_2009_q1
{
public static void main (String args [])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int m,n,no,i=0,k=0,t=0,j,sum=0;
System.out.println("Enter the values of m and n:");
m=Integer.parseInt(cd.readLine());
n=Integer.parseInt(cd.readLine());
no=m*2+n*2-4;
int l[]=new int[no];
int A[][]=new int[m][n];
if(((m>2)&&(m<20))&&((n>2)&&(n<20)))
{
    System.out.println("Enter the elements:");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            A[i][j]=Integer.parseInt(cd.readLine());
        }
    }
    
    i=0;
    for(j=0;j<n;j++)
    {
        l[k]=A[i][j];
        k++;
    }
    i=m-1;
    for(j=0;j<n;j++)
    {
        l[k]=A[i][j];
        k++;
    }
    j=0;
    for(i=0;i<m-1;i++)
    {
        l[k]=A[i][j];
        k++;
    }
    j=n-1;
    for(i=0;i<m-1;i++)
    {
        l[k]=A[i][j];
        k++;
    }
    k--;
    for(i=0;i<k;i++)
    {
        for(j=0;j<k-1;j++)
        {
            if(l[j]>l[j+1])
            {
                t=l[j];
                l[j]=l[j+1];
                l[j+1]=t;
            }
        }
    }
    for(i=0;i<k;i++)
    {
        sum=sum+l[i];
    }
    i=0;
    k=0;
    for(j=0;j<n;j++)
    {
        A[i][j]=l[k];
        k++;
    }
    j=n-1;
    for(i=1;i<m;i++)
    {
        A[i][j]=l[k];
        k++;
    }
    j=0;
    for(i=m-2;i>0;i--)
    {
        A[i][j]=l[k];
        k++;
    }
    k--;
     System.out.println("Rearranged Matrix.");
      for(i=0;i<m;i++)
    {
        if((i==0)||(i==(m-1)))
        {
        for(j=0;j<n;j++)
        {
             System.out.println(A[i][j]);
        }
        System.out.println();
    }
   
   else
   {
       for(j=0;j<n;j++)
       {
           if((j==0)||(j==(n-1)))
           {
                System.out.println(A[i][j]+" ");
            }
            else
            System.out.print(" ");
       }
       System.out.println();
   }
}
}
else
{
    System.out.println("Invalid Input.");
}
}
}











