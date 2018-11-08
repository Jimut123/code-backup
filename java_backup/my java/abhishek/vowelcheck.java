import java.io.*;
class vowelcheck
{DataInputStream in=new DataInputStream(System.in);
 String str;
 void input()throws IOException
 {System.out.println("enter string:");
     str=in.readLine();
    }
  void disp()
  { System.out.println("required string is:"+str);
    }
   int vow_chk()
   {int c,i;
       String ch;
       char ch1;
       c=0;
       for(i=0;i<str.length();i++)
       {
           ch=str.toLowerCase();
           ch1=ch.charAt(i);
           if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
            {c++;
            }
        }
      return c;
    }
}
   