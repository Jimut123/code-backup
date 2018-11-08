import java.io.*;
class switch_string
    {
        void choice()throws IOException
            {
                int i,p=0,n;
                 String s;
                 InputStreamReader ISR=new InputStreamReader(System.in);
                 BufferedReader br=new BufferedReader(ISR);
                 System.out.println("Give string:");
                 s=br.readLine();
                System.out.println("Press 1 for uppercase");
                System.out.println("Press 2 for lowercase");
                System.out.println("Press 3 for vowels");
                System.out.println("Enter choice:");
                n=Integer.parseInt(br.readLine()); 
                 switch(n)
                    {
                        case 1:
                        p=0;
                        for(i=0;i<s.length();i++)
                            {
                               int m=(int)s.charAt(i); 
                                if(m>=65&&m<=90)
                                {
                                p++;
                               System.out.println((char)(m));
                            }
                            }
                                System.out.println("count is:"+p);
                                           break;
                        case 2:
                        p=0;
                        for(i=0;i<s.length();i++)
                            {
                                int m=(int)s.charAt(i); 
                                 if(m>=97&&m<=122)
                                 {
                                 p++;
                                System.out.println((char)(m));
                            }
                            }
                                System.out.println("count is:"+p);
                                           break;
                        case 3:
                        p=0;
                            for(i=0;i<s.length();i++)
                                {
                                    if(s.charAt(i)=='a'||
                                    s.charAt(i)=='A'||
                                    s.charAt(i)=='E'||
                                    s.charAt(i)=='e'||
                                    s.charAt(i)=='i'||
                                    s.charAt(i)=='I'||
                                    s.charAt(i)=='o'||
                                    s.charAt(i)=='O'||
                                    s.charAt(i)=='u'||
                                    s.charAt(i)=='U')
                                    {
                                    p++;
                                    System.out.println(s.charAt(i));
                                }
                                
                            }
                                System.out.println("count is:"+p);
                                           break;
                                             default :
                        System.out.print("error");
                    }
                }
            }
            
                        