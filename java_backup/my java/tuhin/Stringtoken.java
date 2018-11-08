
/**
 * Write a description of class Stringtokenizer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class Stringtoken
{
public static void main(String args[])throws IOException
{
  int c=0;
  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the string......");
  String s =br.readLine();
  String arr[];
  int total=0;
  StringTokenizer data=new StringTokenizer(s,",");
  c=data.countTokens();
  arr=new String[c];
  String newstr="";
  String newstr1="";

  for(int i=0;i<c;i++)
  {
      arr[i]=new String(data.nextToken());
      newstr=newstr+arr[i];
    }
    System.out.println("The string without , & . is...."+newstr);
    for(int i=0;i<c;i++)
  {
      for(int j=0;j<arr[i].length();j++)
      if(arr[i].charAt(j)!='.')
      System.out.print(arr[i].charAt(j));
      System.out.print("  ");
   
      
    }
    System.out.println("The string without , & . in reverse order  ");
    for(int i=c-1;i>=0;i--)
  {
      for(int j=arr[i].length()-1;j>=0;j--)
     if(arr[i].charAt(j)!='.')
      System.out.print(arr[i].charAt(j));
      
      System.out.print(" ");
      
    }
      
}
}
  
    
    

