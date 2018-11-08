import java.io.*;
class stringtwo
{
  public static void main()throws IOException
   {
  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
  String s;int l;int i;char c;
  System.out.print("Enter string");
  s=br.readLine();
  l=s.length();
  for(i=0;i<l;i++)
  {
  c=s.charAt(i);
  if(s.charAt(i)==' ')
  System.out.println("");
  else
  System.out.print(c);
}
}
}
  