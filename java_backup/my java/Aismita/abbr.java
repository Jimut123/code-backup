import java.io.*;
class abbr
{
    public static void main(String s)
    {
         s=s+" ";
        String w="";
        //String w1="";
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
               // for(int j=0;j<w.length();j++)
              //  {
                System.out.print(Character.toUpperCase(w.charAt(0)));
               w="";
               // break;
            //}
            }
            else
            w=w+s.charAt(i);
            
        }
    }   
}