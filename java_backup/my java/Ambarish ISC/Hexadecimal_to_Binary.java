import java.io.*;
class Hexadecimal_to_Binary
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String s,w;
  int i,c;
  
  void input()throws IOException
  {
  System.out.println("Enter the string");
  s=br.readLine();
  c=0;
 
  for(i=0;i<s.length();i++)
  {
  char ch=s.charAt(i);
  check(ch);
  }
  }
  void check(char ch)
  {
      
  if(ch=='0')
    System.out.print("0000");
  else
   if(ch==('1'))
    System.out.print("0001");
   else 
    if(ch=='2')
    System.out.print("0010"); 
   else 
    if(ch=='3')
    System.out.print("0011");  
    else 
    if(ch=='4')
    System.out.print("0100"); 
    else
    if(ch=='5')
    System.out.print("0101"); 
    else 
    if(ch=='6')
    System.out.print("0110"); 
    else 
    if(ch=='7')
    System.out.print("0111"); 
    else 
    if(ch=='8')
    System.out.print("1000");
    else 
    if(ch=='9')
    System.out.print("1001");
    else 
    if(ch=='A')
    System.out.print("1010");
    else 
    if(ch=='B')
    System.out.print("1011");
    else 
    if(ch=='C')
    System.out.print("1100");
    else 
    if(ch=='D')
    System.out.print("1101");
    else 
    if(ch=='E')
    System.out.print("1110");
    else 
    if(ch=='F')
    System.out.print("1111");
    }
    }
