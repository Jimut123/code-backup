import java.io.*;
class pattern_6
{ public static void main(String args[])throws IOException
  { 
      int i,j,l,sp,k;
      l=5;
      sp=0;
      for(i=1;i<=5;i++)
      {
          for(j=1;j<=l;j++)
          System.out.print(j+" "+" ");
          for(k=1;k<=sp;k++)
          System.out.print(" ");
          if(i==1)
          j=j-2;
          else
          j=j-1;
          while(j>=1)
          {
              System.out.print(j+" "+" ");
              j--;
            }
            System.out.println("");
            sp=sp+3;
            l=l-1;
  }
}
}
