import java.util.*;
class String_pat4
{
    String s;
    String ar[];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string ");
        s=sc.nextLine();
        calc();
    }
    void calc()
    {
        String z="";
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=','&& s.charAt(i)!=';'&& s.charAt(i)!='.'&& s.charAt(i)!='!')
            z=z+s.charAt(i);
            else
            {
                System.out.println(z);
                ar=new String[3];
                z=z+" ";
                k=0;
                for(int j=0;j<z.length();j++)
                {
                    if(z.charAt(j)!=' ')
                    ar[k]=ar[k]+z.charAt(j);
                    else
                    k=k+1;
                }
                z="";
                String temp="";
                for(int i2=0;i2<ar.length;i2++)
                {
                    for(int j2=0;j2<ar.length-i-1;j2++)
                    {
                        if(ar[j2].compareTo(ar[j2+1])>1)
                        {
                            temp=ar[j2];
                            ar[j2]=ar[j2+1];
                            ar[j2+1]=temp;
                        }
                    }
                }
                for(int i1=0;i1<ar.length;i1++)
                System.out.print(ar[i1]+" ");
                System.out.print(s.charAt(i));
                k=0;
                z="";
            }
        }
    }
}