import java.io.*;
public class Select
{
  public static void main()throws IOException
  {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
   System.out.println("Enter first string :");
      String f=br.readLine();
      System.out.println ("Enter second string :");
       String s=br.readLine();
    int i,j,f1;   
    for(i=0;i<f.length();i++)
    {
        f1=0;
        for(j=0;j<s.length();j++)
         {
           if(f.charAt(i)==s.charAt(j))
             f1++;
            }
            if(f1==0)
            System.out.print(f.charAt(i));
        }
     for(i=0;i<s.length();i++)
    {
        f1=0;
       for(j=0;j<f.length();j++)
         {
           if(s.charAt(i)==f.charAt(j))
            f1++;
            }
           if(f1==0)
            System.out.print(s.charAt(i));
        }    
   
}
}