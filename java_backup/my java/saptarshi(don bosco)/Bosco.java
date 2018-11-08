import java.io.*;
import java.util.*;
class Bosco
{ private String str;int n;
  public Bosco()
  { str=" ";
    n=0;  
  }
  public void accept()throws IOException
  {  Scanner sc=new Scanner(System.in);
     System.out.print("\nEnter any string:");
     str=sc.nextLine();
     System.out.print("\nEnter a number:");
     n=sc.nextInt();
  }
  public void generate()
  {   
      for(int i=0;i<str.length();i++)
      { if(n==(i+1))
          { for (int k=1;k<=(12-n);k++)
              { System.out.print(" ");
              }
            for (int j=0;j<=i;j++)
              { System.out.print(str.charAt(j)+" ");
              }
            for(int x=i+1;x<str.length();x++)
              { System.out.print(str.charAt(x)+" ");
              }
          }
        else
          { for(int k=1;k<=12;k++)
              { System.out.print(" ");
              }
            System.out.println(str.charAt(i));
          }
        System.out.println("");
      }
   }
   public static void main()throws IOException
   { Bosco q=new Bosco();
     q.accept();
     q.generate();
    }
}