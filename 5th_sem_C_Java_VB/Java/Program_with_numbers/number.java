import java.io.*;
class number
{
  public static void main(String args[])throws IOException
  {
    int i,j,k,c,x,flag=1,n1,n2,n3;
    int n[] = new int[9];
    for(k=100;k<=333;k++)
    {
      flag=1;
      n1=k;
      n2=k*2;
      n3=k*3;
      c=2;
      while(n1>0)
      {
        n[c--]=n1%10;
        n1=n1/10;
      }
      c=5;
      while(n2>0)
      {
        n[c--]=n2%10;
        n2=n2/10;
      }
      c=8;
      while(n3>0)
      {
        n[c--]=n3%10;
        n3=n3/10;
      }
      for(i=0;i<9;i++)
      {
         x=0;
         if(n[i] == 0)
         {
           flag=0;
            break;
         }
         for(j=0;j<9;j++)
           if(n[i] == n[j])
             ++x;
         if(x>1 || x == 0)
         {
           flag=0; 
           break;
         }
       }
       if(flag == 1)
         System.out.println(k+" "+k*2+" "+k*3);
    }
  }
}