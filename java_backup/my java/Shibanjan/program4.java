import java.io.*;
class program4
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String s,s1="";
  String a[];
  int c=0,c1=0,c2=0,i,j;
  void input()throws IOException
  {
      System.out.println("Enter the text");
      s=br.readLine();
      s=s+" ";
  }
  void fre()
  {
      for(int i=0;i<s.length();i++)
      {
          if(s.charAt(i)==' ')
          {
              c++;
          }
      }
      a=new String[c];
      for(i=0;i<s.length();i++)
      {
          if(s.charAt(i)!=' ')
          {
              s1=s1+s.charAt(i);
          }
          else
          {
              a[c1]=s1;
              c1++;
              s1="";
          }
        }
      for(i=0;i<c;i++)
      {
          if(a[i].equalsIgnoreCase(" "))
          continue;
          else
          {
              System.out.print("The fre of "+a[i]+" is ");
          for(j=i;j<c;j++)
          {
              if(a[i].equalsIgnoreCase(a[j]))
              {
                  c2++;
                  if(c2>1)
                  a[j]=" ";
              }
          }
          System.out.println(+c2);
          c2=0;
      }
    }
  }
  public static void main(String args[])throws IOException
  {
      program4 p=new program4();
      p.input();
      p.fre();
  }
}