import java.io.*;
class program1
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int n,i;
  String s="",s1="",str;
  void input()throws IOException
  {
      System.out.println("Enter the number");
      n=Integer.parseInt(br.readLine());
      s=s+n;
      str=s;
  }
  void clockwise()
  {
      System.out.println("The clockwise rotation is");
      System.out.println(str);
      while(str!=s1)
      {
          if(str.equalsIgnoreCase(s1)==true)
          break;
          s1="";
        for(i=1;i<s.length();i++)
        {
               s1=s1+s.charAt(i);
        }
      
        s1=s1+s.charAt(0);
        System.out.println(s1);
        s=s1;
    }
    s1="";  
  }
  void anticlockwise()
  {
      System.out.println("The anticlockwise rotation is");
      System.out.println(str);
      while(str!=s1)
      {
          if(str.equalsIgnoreCase(s1)==true)
          break;
          s1="";
        for(i=0;i<s.length()-1;i++)
        {
               s1=s1+s.charAt(i);
        }
      
        s1=s.charAt(s.length()-1)+s1;
        System.out.println(s1);
        s=s1;
    }
  }
  public static void main(String args[])throws IOException
  {
      program1 p=new program1();
      p.input();
      p.clockwise();
      p.anticlockwise();
  }
}