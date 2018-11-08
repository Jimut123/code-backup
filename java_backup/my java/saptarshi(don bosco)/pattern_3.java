import java.io.*;
class pattern_3
{ public static void main(String args[])
  { int x,sp=15;
      for(int i=4;i>=1;i--)
      { 
          for(x=1;x<=sp;x++)
          {System.out.print(" ");
          }
          for(x=i;x>=1;x--)
          {System.out.print(x+" ");
          }
          for(x=2;x<=i;x++)
          {System.out.print(x+" ");
          }
       System.out.println("");
       sp=sp+2;
    }
  }
}