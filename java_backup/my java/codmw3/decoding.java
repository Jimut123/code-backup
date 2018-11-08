import java.util.*;
public class decoding
{
    Scanner sc=new Scanner(System.in);
    String s;
    void input()
    {
        System.out.println("Enter code");
        s=sc.nextLine();
    }
    void coding()
    {
        int a,a1,a2,a3,b,j,fl,m;
        String i="";
        char k,l,n;
        for(a=0;a<s.length();a++)
            {
                i+=s.charAt(a);
                b=Integer.parseInt(i);
                if(b>=(int)'a' && b<=3*((int)'z'))
                    {
                        k='a';
                        l='a';
                        n='a';
                        j=0;
                        fl=0;
                        for(m=0;m<26;m++)
                        {
                            if(b==(int)k)
                            {
                                System.out.println(+k);
                                fl=1;
                                break;
                            }
                            k=(char)((int)k+1);
                        }
                        if(fl==1)
                        {
                            i="";
                            continue;
                        }
                        k='a';
                        l='a';
                        n='a';
                        j=0;
                        fl=0;
                        for(a1=0;a1<26;a1++)
                        {
                            j=(int)k;
                            for(a2=0;a2<26;a2++)
                            {
                                if(j+(int)l==b)
                                {
                                    System.out.println(+k+l);
                                    fl=1;
                                    break;
                                }
                                l=(char)((int)l+1);
                            }
                            k=(char)((int)k+1);
                        }
                        if(fl==1)
                        {
                            i="";
                            continue;
                        }
                        k='a';
                        l='a';
                        n='a';
                        j=0;
                        fl=0;
                        for(a1=0;a1<26;a1++)
                        {
                            j=(int)k;
                            for(a2=0;a2<26;a2++)
                            {
                                j+=(int)l;
                            for(a3=0;a3<26;a3++)
                            {
                                if(j+(int)n==b)
                                {
                                    System.out.println(+k+""+l+""+n);
                                    i="";
                                    fl=1;
                                    break;
                                }
                                n=(char)((int)n+1);
                            }
                            l=(char)((int)l+1);
                        }
                            k=(char)((int)k+1);
                        }
                    }
                }
            }
        }