import java.io.*;
class bin2oct
{
 InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
  String s,w;
  int i,c;
  
  void input()throws IOException
  {
  System.out.println("Enter the string");
  s=input.readLine();
  c=0;
  w="";
  for(i=0;i<s.length();i++)
  {
  char ch=s.charAt(i);
  
  if(c==3)
  {
  check(w);
  c=0;
  w="";
  }
  
  if(ch=='1')
  {
  w=w+ch;
  c++;
  }
  else
  if(ch=='0')
  {
  w=w+ch;
  c++;
  }
  
   if(ch=='.')
  System.out.print(".");
  }
 
  if(c==3)
  {
  check(w);
  c=0;
  w="";
  }
  }
  void check(String w)
  {
  if(w.compareTo("000")==0)
    System.out.print("0");
  else
   if(w.compareTo("001")==0)
    System.out.print("1");
   else 
    if(w.compareTo("010")==0)
    System.out.print("2"); 
   else 
    if(w.compareTo("011")==0)
    System.out.print("3");  
    else 
    if(w.compareTo("100")==0)
    System.out.print("4"); 
    else
    if(w.compareTo("101")==0)
    System.out.print("5"); 
    else 
    if(w.compareTo("110")==0)
    System.out.print("6"); 
    else 
    if(w.compareTo("111")==0)
    System.out.print("7"); 
    }
    }