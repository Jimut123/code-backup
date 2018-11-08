//Displaying a no. in words
import java.io.*;
class NoInWords
{
  String s;
  int a[]=new int[10];
  String tens[]={"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
  String units[]={"one","two","three","four","five","six","seven","eight","nine"};
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void number()throws IOException
  {
      int i,c=9,l,n;
      String s1="";
      System.out.println("enter a number");
       s=br.readLine();
      l=s.length();
      String w="";
      for(i=l-1;i>=0;i--)
      {
          w="";
          char ch=s.charAt(i);
          System.out.println(ch);
           w=w+ch;
          int d=Integer.parseInt(w);
          a[c--]=d;
        }
        for(i=0;i<10;i++)
      {
          System.out.println(a[i]);
        }
        int k=9-l;
        for(i=k;i<10;i++)
        {
            if (i%2==0 && i!=6 && i!=8)
            {
                n=a[i];
                s1=s1+tens[n-2];
            }
            else
            {
                if (i!=7)
                {
                    n=a[i];
                    s1=s1+units[n-2];
                }
            }
            if (i==7)
            {
                n=a[i];
                s1=s1+tens[n-2];
            }
            if (i==6)
             s1=s1+"hundred";
            if (i==5)
             s1=s1+"thousand";
            if (i==3)
             s1=s1+"lakh";
            if (i==1)
             s1=s1+"crore";
            }
            System.out.println(s1);
        }
    }
            
      