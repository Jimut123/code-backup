import java.util.*;
class Abriv
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,w;
        s=sc.nextLine();
        w="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                System.out.print(w.charAt(0));
                System.out.print(".");
                w="";
            }
            else
            w=w+s.charAt(i);
        }
        System.out.println(w);
    }
}
        