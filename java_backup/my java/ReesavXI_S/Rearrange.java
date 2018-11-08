import java.util.*;
class Rearrange
{
    String Txt="";
    String Cxt="";
    int len=0;
    void readWord()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word in UPPERCASE ");
        Txt=sc.nextLine();
    }
    void convert()
    {
        String last="";int j=0;;
        char ch=Txt.charAt(0);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        Cxt=Txt+"Y";
        else
        {
           for(int i=0;i<Txt.length();j++,i++)
           {
               ch=Txt.charAt(i);
               if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
               break;
               while(ch!='A'||ch!='E'||ch!='I'||ch!='O'||ch!='U')
                {
                    last=last+ch;
                    break;
                }
            }
            for(int k=j;k<Txt.length();k++)
            Cxt=Cxt+Txt.charAt(k);
            Cxt=Cxt+last+"C";
        }
    }
    void display()
    {
        System.out.print("Rearranged word ="+Cxt);
    }
}
            