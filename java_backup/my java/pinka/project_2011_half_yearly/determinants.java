package project_2011_half_yearly;

import java.io.*;
class determinants
{
public static void main(String args[])throws IOException
{
int a[][]=new int[3][3];
int i,j,g=1,n,s=0,element,element2=0,r,r1,c,c1,d,t,count=0,p=0,q=0,q1=0,p1=0,m,m1; 
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 9 no.s:");
g=1;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print("("+g+")");
a[i][j]=Integer.parseInt(input.readLine());
g++;
System.out.println("");
}
}
      for(i=0;i<3;i++)                                                              //display
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}

System.out.println("Enter your choice:");
System.out.println("Press 1 to choose row:");
System.out.println("Press 2 to choose column:");
n=Integer.parseInt(input.readLine());

switch(n)
{
case 1:System.out.println("Give the row no. (1/2/3):");
       r1=Integer.parseInt(input.readLine());
       r=r1-1;
       for(j=0;j<3;j++)
       {
        element=a[r][j];
        t=j;
        count=0;
        p=0;
        q=0;
        q1=0;

        p1=0;
        for(m=0;m<3;m++)
        {
        for(m1=0;m1<3;m1++)
        {
        element2=a[m][m1];
        if((m!=r)&&(m1!=t))
        {
        count++;
        if(count==1)
        p=element2;
        else
        if(count==2)
        q=element2;
        else
        if(count==1)
        q1=element2;
        else
        if(count==1)
        p1=element2;
        }
       }
      }
      d=((p*p1)-(q*q1));
      d=d*element;
      if((r1==3)||(r1==1))
      {
      if(j==1)
      d=d*(-1);
      }
      else
      if(r1==2)
      {
      if((j==0)||(j==2))
      d=d*(-1);
      }
      s=s+d;
      }
      break;
case 2:System.out.println("Give the column no. (1/2/3):");
       c1=Integer.parseInt(input.readLine());
       c=c1-1;
       for(i=0;i<3;i++)
       {
        element=a[i][c];
        t=i;
        count=0;
        p=0;
        q=0;
        q1=0;
        p1=0;
        for(m=0;m<3;m++)
        {
        
        for(m1=0;m1<3;m1++)
        {
        element2=a[m][m1];
        if((m!=t)&&(m1!=c))
        {
        count++;
        if(count==1)
        p=element2;
        else
        if(count==2)
        q=element2;
        else
        if(count==1)
        q1=element2;
        else
        if(count==1)
        p1=element2;
        }
       }
      }
      d=((p*p1)-(q*q1));
      d=d*element;
      if((c1==3)||(c1==1))
      {
      if(i==1)
      d=d*(-1);
      }
      else
      if(c1==2)
      {
      if((i==0)||(i==2))
      d=d*(-1);
      }
      s=s+d;
      }
      break;
}
System.out.println("DETERMINANT : "+s);
}
}

