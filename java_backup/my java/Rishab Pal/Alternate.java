import java.util.*;
public class Alternate
{
    public static void main (string args [])
    {
        string str =" ";
        scanner sc =new scanner (system.in);
        system.out.println ("Enter any string");
        str =sc.nextline();
        str =str +" ";
        int fi =0;
        li =0;
        string substr =" ";
        for (int i=0;i <str.length ();i ++)
        {
            if (str.charAt (i) ==" ")
            {
                li =fi;
                subetr =str.substring (fi,li);
                string newstr =" ";
                for (int i =0;i <str.length ();j ++)
                {
                    if (j %== 0)
                    new str =new str +substr.charAt (j);
                    else
                    newstr =newstr +character.to lower case (substr charAt (j))
                }
                system.out.println (newstr +" ");
                fi +i +1
            }
        }
    }
}
                    
        