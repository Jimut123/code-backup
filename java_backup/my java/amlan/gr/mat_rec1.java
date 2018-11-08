package gr;

import java.io.*;
 class mat_rec1
{
    
    int a[][], n,i,j,m,max;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    mat_rec1()throws IOException
    {
        System.out.println("Enter term:");
        m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());
        a=new int[m][n];
        i=0;
        entry(a,i,m);
        disp();
        max=0
        j=0;
        i=0;
       col_sum(a,i,j,max,m,n);
       max=0;
        j=0;
        i=0;
        row_sum(a,i,j,s1,n);
    }
    void entry(int a[][],int i,int m)throws IOException
    {
        if(i>=m)
         return;
         else
          {
              j=0;
              entry1(a,i,j,n);
              entry(a,i+1,m);
            }
         
}
void entry1(int a[][],int i,int j,int n)throws IOException
{
     if(j>=n)
         return;
     else
     {
         a[i][j]=Integer.parseInt(br.readLine());
         entry1(a,i,j+1,n);
        }
    }
    void disp()
    {
        for(i=0;i<m;i++)
        {
         for(j=0;j<n;j++)
          System.out.print(a[i][j]+",");
        System.out.println("");
    }
}
void col_sum(int a[][],int i,int j,int s,int n)
{
    if(i>=n)
     return;
    else
    if(j>=n)
    {
        System.out.println("sum of column:"+i+":"+s);
        j=0;
        i=i+1;
        s=0;
        col_sum(a,i,j,s,n);
    }
    else
    {
        s=s+a[j][i];
        col_sum(a,i,j+1,s,n);
    }
        
}
void row_sum(int a[][],int i,int j,int s1,int n)
{
    if(i>=n)
     return;
    else
    if(j>=n)
    {
        System.out.println("sum of row:"+i+":"+s1);
        j=0;
        i=i+1;
        s1=0;
        row_sum(a,i,j,s1,n);
    }
    else
    {
        s1=s1+a[i][j];
       row_sum(a,i,j+1,s1,n);
    }
        
}
}
          
