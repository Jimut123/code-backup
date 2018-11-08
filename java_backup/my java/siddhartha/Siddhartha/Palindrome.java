import java.io.*;
import java.lang.*;
public class Palindrome
{public static void main()throws IOException
 { BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the text");
    String str=br.readLine();
    int l=str.length();
    char ch=' ',revs=' ';
    for(int i=l;i>0;i--)
    {ch=str.charAt(i-1);
      System.out.print(ch);   
    }
    for(int j=0;j<l;j++)
     {revs=str.charAt(j);
     }
    if(ch==revs)
    System.out.println("-----> This string is a palindrome");
    else
       System.out.println("-----> This string is not a palindrome");
}
}     