import java.io.*;
import java.util.*;
class Prog3
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String str;
   StringTokenizer st;
   String s;
   int i=0;
    public void show()throws Exception
   {
    System.out.println("Enter the sentence:");
    str=br.readLine().toUpperCase();
    st=new StringTokenizer(str," .,?!");
    while(st.hasMoreTokens())
    {
        s=st.nextToken();
        if(palin(s))
        System.out.print(" "+s);
    }
    if(i==0)
    System.out.println("\nNo palindromic words");
    else
    System.out.println("\nNumber of palindromic words :"+i);
    }
   
    private boolean palin(String s1)
    {
         int x,j,len;
         len=s1.length();
         x=len-1;
         for(j=0;j< len/2;j++)
         {
             if(s1.charAt(j)!=s1.charAt(x))
             break;
             x--;
            }
            if(j< len/2)
            return false;
            else
{
i++;
            return true;
        }
        }
       
     public static void main(String args[]) throws Exception
     {
      Prog3 ob=new Prog3();
      ob.show();
      }
      }

