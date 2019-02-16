//99000099=9999*9901
import java.io.*;
class palin
{
  public static void main(String args[])throws IOException
  {
     int u=9999,l=1000,m=0,i,p,n,r,j,a=0,b=0;
     for(i=u;i>=l;i--)
     {
        for(j=i;j>=l;j--)
        {
           p=i*j;
           if(p<m)
             break;
           n=p;
           r=0;
           while(n!=0)
           {
             r=r*10+n%10;
             n=n/10;
           }
           if(p==r && p>m)
           {
             m=p;
             a=i;
             b=j;
           }
        }
     }
     System.out.println(a+" * "+b+" = "+m);
  }
}   