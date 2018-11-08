package souvik11.string;

import java.io.*;
class bin2hex
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
  
  if(c==4)
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
 
  if(c==4)
  {
  check(w);
  c=0;
  w="";
  }
  }
  void check(String w)
  {
  if(w.compareTo("0000")==0)
    System.out.print("0");
  else
   if(w.compareTo("0001")==0)
    System.out.print("1");
   else 
    if(w.compareTo("0010")==0)
    System.out.print("2"); 
   else 
    if(w.compareTo("0011")==0)
    System.out.print("3");  
    else 
    if(w.compareTo("0100")==0)
    System.out.print("4"); 
    else
    if(w.compareTo("0101")==0)
    System.out.print("5"); 
    else 
    if(w.compareTo("0110")==0)
    System.out.print("6"); 
    else 
    if(w.compareTo("0111")==0)
    System.out.print("7"); 
    else 
    if(w.compareTo("1000")==0)
    System.out.print("8");
    else 
    if(w.compareTo("1001")==0)
    System.out.print("9");
    else 
    if(w.compareTo("1010")==0)
    System.out.print("A");
    else 
    if(w.compareTo("1011")==0)
    System.out.print("B");
    else 
    if(w.compareTo("1100")==0)
    System.out.print("C");
    else 
    if(w.compareTo("1101")==0)
    System.out.print("D");
    else 
    if(w.compareTo("1110")==0)
    System.out.print("E");
    else 
    if(w.compareTo("1111")==0)
    System.out.print("F");
    else
    if(w.compareTo(".")==0)
    System.out.print(".");
    }
    }