//Decoding a message
import java.util.*;
class Decode
{
   Scanner sc=new Scanner(System.in);
   int len;
   String msg="",msg1="",msg2="",w;
   public void get()
   {
       int i,l;
       System.out.println("enter encoded message");
         msg=sc.nextLine();
       len=msg.length();
       for(i=0;i<len;i++)
       {
           if (msg.charAt(i)!=' ')
             w=w+msg.charAt(i);
           else
           {
               l=w.length();
               if (l%2==0 && w.charAt(0)=='2')
               {
                   for(int j=1;j<l;j++)
                    msg1=msg1+w.charAt(j);
                }
                else
                  msg1=msg1+w;
                msg1=msg1+" ";
                w="";
            }
        }
        l=w.length();
        if (l%2==0 && w.charAt(0)=='2')
        {
            for(int j=1;j<l;j++)
              msg1=msg1+w.charAt(j);
           }
           else
             msg1=msg1+w;
           arrange();
        }
        public void arrange()
        {
            int i,mid,c=1,p=1,l;
           
            for(i=0;i<len;i++)
            {
                if (msg1.charAt(i)!=' ')
                  w=w+msg.charAt(i);
                else
                {
                    l=w.length();
                    mid=l/2;
                    if (l%2==0)
                      mid--;
                    
                    msg2=msg2+w.charAt(mid);
                    while (c<l-1)
                    {
                        msg2=msg2+w.charAt(mid+p);
                        c++;
                        int p1=mid-p;
                        if (c<l && p1>=0)
                          {
                              msg2=msg2+w.charAt(mid-p);
                              c++;
                            }
                            p++;
                        }
                        msg2=msg2+" ";
                    }
                }
                l=w.length();
                    mid=l/2;
                    if (l%2==0)
                      mid=mid-1;
                    c=1;
                    msg2=msg2+w.charAt(mid);
                    while (c<l-1)
                    {
                        msg2=msg2+w.charAt(mid+p);
                        c++;
                        int p1=mid-p;
                        if (c<l && p1>=0)
                          {
                              msg2=msg2+w.charAt(mid-p1);
                              c++;
                            }
                            p++;
                        }
                        
                        rev();
                    }
                    public void rev()
                    {
                        int i;
                        String dcm="";
                        for(i=len-1;i>=0;i++)
                        {
                            dcm=dcm+msg2.charAt(i);
                        }
                        System.out.println("decoded message : "+dcm);
                    }
                }
                          
                        
                        
                      
            
            
               
               