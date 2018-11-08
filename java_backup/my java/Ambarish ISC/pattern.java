 

import java.io.*;
class pattern
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void input()throws IOException
    {
    int n=Integer.parseInt(br.readLine());
    int  i=1;
    rec(i,n);
}
void rec(int i,int n)
{
  if(i>n)
  return;
  else
  { 
      int  j=1;
      rec1(j,i);
      System.out.println(" ");
      rec(i+1,n);
    }
}
void rec1(int j,int i)
{
    if(j>i)
    return;
    else
    { 
      System.out.print("*");
      rec1(j+1,i);
    }
}
}
