
/**
 * Write a description of class Stringtokenizer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Stringtoken
{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
public static void main(String args[])throws IOException
{
  int c=0;
  string s =br.readline();
  String arr[];
  int total=0;
  StringTokenizer data=new StringTokenizer(s);
  c=data.countTokens;
  arr=new int[c];
  for(int i=0;i<c;i++)
  {
      arr[i]=new String(data.nextToken());
      System.out.println(arr[i]);
    }
}
}
  
    
    

