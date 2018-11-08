import java.io.*;
class word_reverse
{
 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
 String s;int i; int p=0; int m=0;String w=""; String w1="";int l=0;String w2="";
 void insert()throws IOException
 {
     System.out.println("Enter your line of text");
     s=in.readLine();
     s=s+" ";
      l=s.length();
     i=0;
     check(s,i);
    }
 void check(String s,int i)
 {
     if(i==l)
     return;
     else
     if(s.charAt(i)==' ')
     {
         p=i;
         w=s.substring(m,p);
         w2=rev(w);
         System.out.print(w2+" ");
         m=p+1;w="";w2="";
         check(s,i+1);
         //m=p;
        }
        else
        if(s.charAt(i)!=' ')
        check(s,i+1);
    }
    String rev(String w)
    {
        w1="";
        for(int j=w.length()-1;j>=0;j--)
        w1=w1+w.charAt(j);
        return w1;
        //System.out.print(w1);
        //System.out.print("  ");
        //w1="";
    }
    public void main()throws IOException
    {
        insert();
        //check(s,i);
        //rev(w);
    }
}
