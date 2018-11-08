import java.io.*;
class Encoding_Decoding
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException 
  {
      int i,j;String s,w;
      s=br.readLine();
      decode(s);
      s=br.readLine();
      encode(s);
    }
void decode(String s)throws IOException
  {
      String w="";
      int j;
      s=s+"kk";
      for(j=0;j<s.length();j++)
      {
          if(s.charAt(j)=='k'&&s.charAt(j+1)=='k')
          {
             change(w);
              System.out.print(" ");
              w="";
              j=j+1;
              
            }
          else
          {
              w=w+s.charAt(j);
            }
        }
        
    }
  void change(String s)throws IOException
  {
      
      for(int i=0;i<s.length();i++)
      {int m=(int)s.charAt(i);
      if(m==122)
        {
           m=98;
        }
        else if(m==121)
        {
            m=97;
        }
        else if(m==90)
        {
            m=66;
        }
        else if(m==89)
        {
           m=63;
        }
        else
        {
            m=m+2;
        }
        System.out.print((char)m);
    }
}
void encode(String s)throws IOException
  {
      String w="";
      int j;
      s=s+" ";
      for(j=0;j<s.length();j++)
      {
          if(s.charAt(j)==' ')
          {
             change2(w);
              System.out.print("kk");
              w="";
              j=j+1;
              
            }
          else
          {
              w=w+s.charAt(j);
            }
        }
        
    }
void change2(String s)throws IOException
{   for(int i=0;i<s.length();i++)
      {int m=(int)s.charAt(i);
      if(m==97)
        {
           m=121;
           System.out.print((char)m);
        }
        else if(m==98)
        {
            m=122;
            System.out.print((char)m);
        }
        else if(m==65)
        {
            m=89;
            System.out.print((char)m);
        }
        else if(m==66)
        {
           m=90;
           System.out.print((char)m);
        }
        else
        if(m>=65&&m<=90) 
        {
            m=m-2;
            System.out.println(m);
            System.out.print((char)m);
        }
        else
        if(m>=97&&m<=122)
        {
        m=m-2;
        //System.out.println(m);
        System.out.print((char)m);
    }
        
    }
}
}