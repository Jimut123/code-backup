import java.util.*;
class Exchange
{
    String s="";
    String rev="";
    int size=0;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence ");
        s=sc.nextLine();
        size=s.length();
        s=s+" ";
    }
    void exFirlstLast()
    {
        String z="";
        for(int i=0;i<size;i++)
        {
            if(s.charAt(i)!=' ')
             z=z+s.charAt(i);
            else
            {
                char F=z.charAt(0);
                char L=z.charAt(z.length()-1);
                rev=rev+L;
                for(int j=1;j<z.length()-1;j++)
                rev=rev+z.charAt(j);
                rev=rev+F;
                rev=rev+" ";
                z="";
            }
        }
    }
        void display()
    {
        System.out.println("Original sentence "+s);
        System.out.println("Reversed sentence "+rev);
    }
}