import java.io.*;
public class Name_Pattern
{
  public static void main(String args[]) throws IOException
  {
      DataInputStream in=new DataInputStream(System.in);
      System.out.println("enter name");
      String w=in.readLine();
      w=w.trim();
      int l=w.length();
      int hl=l/2;
      for(int i=0;i<=hl;i++)
      {
          int kli=0;
          if(i==hl)
          {
              kli=i;
            }
            else
            {
                kli=i;
            }
          for(int j=0;j<kli;j++)
          {
                   System.out.print(" ");
        }
        System.out.print(w.charAt(i));
        
            int p=hl-i;
        int hlt=p*2-2;
       
        for(int k=0;k<=hlt;k++)
        {
            System.out.print(" ");
        }
        if(i!=hl)
        {
            System.out.print(w.charAt(i));
        }
        for(int o=0;o<i;o++)
        {
            System.out.print(" ");
        }
       System.out.println();
       
    }
    for(int z=hl+1;z<l;z++)
    {
        int x=0;
        for(x=0;x<l-z-1;x++)
        {
            System.out.print(" ");
        }
        System.out.print(w.charAt(z));
        int p=l-z;
        int hlt=p*2-2;
        for(int y=l-hlt-1;y>0;y--)
        {
            System.out.print(" ");
        }
        System.out.print(w.charAt(z));
        System.out.println();
    }
}
}
            
