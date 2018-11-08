import java.util.*;
class Abr
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a string");
        String s;
        s=sc.nextLine();
       String w="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                System.out.print(w.charAt(0));
                System.out.print(".");
                w="";
            }
                else
                w+=s.charAt(i);
               
            }
             System.out.print(w);
        }
    }

                