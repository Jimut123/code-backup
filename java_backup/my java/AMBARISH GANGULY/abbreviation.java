import java.io.*;
class abbreviation
{
  public static void main()throws IOException
    {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    String s;int l;int i;String w;
    System.out.print("enter a string");
    s=br.readLine();
    l=s.length();
    w="";
    for(i=0;i<l;i++)
    { if(s.charAt(i)==' ')
       { System.out.print(w.charAt(0));
        System.out.print(".");
     w="";
    }
    
    else
    w=w+s.charAt(i);
}
  System.out.print(w);
}
}
        