package gr;

import java.io.*;
class para_sort
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s,w;
    String s1[]=new String[100];
    int i,j,t;
    void input()throws IOException
    {
        System.out.println("Enter String;");
        s=br.readLine();
        send();
        sort();
    }
    void send()
    {
      t=0;
      w="";
      for(i=0;i<s.length();i++)
      {
          if(s.charAt(i)=='.' && s.charAt(i+1)==' ')
          {  
          w=w+s.charAt(i);    
          s1[t++]=w;
          w="";
          i=i+1;
        }
          else
           if(s.charAt(i)==',' && s.charAt(i+1)==' ')
             {   
          w=w+s.charAt(i);    
                 s1[t++]=w;
          w="";
          i=i+1;
        }
           else
            if(s.charAt(i)==';' && s.charAt(i+1)==' ')
             {   
          w=w+s.charAt(i);    
                 s1[t++]=w;
          w="";
          i=i+1;
        }
            else
             if(s.charAt(i)=='!' && s.charAt(i+1)==' ')
             {   
          w=w+s.charAt(i);    
                 s1[t++]=w;
          w="";
          i=i+1;
        }
             else
              w=w+s.charAt(i);
}
System.out.println("before sort:");
for(i=0;i<t;i++)
System.out.println(s1[i]);
}
void sort()
{
 int i,j,k;
 String w1;
 
 for(k=0;k<t;k++)
 {
 //s1[k]=s1[k]+" ";
     for(i=65;i<=90;i++)
 {
   
   w1="";
     //System.out.print("pass");
   for(j=0;j<s1[k].length();j++)
   {
       //
       if(s1[k].charAt(j)==' ')
          {
              System.out.println(w1+",");
              if(w1.charAt(0)==(char)i)
                {
                    System.out.print(w+" ");
                    break;
                }
              else
                if(w1.charAt(0)==(char)(i+32))
                {
                    System.out.print(w+" ");
                    break;
                }
                w1="";
            }
            else
            w1=w1+s1[k].charAt(j);
        }
       //if(w.charAt(0)==(char)i)
                //{
                    //System.out.print(w1+" ");
                    //w1="";
                //} 
    }
}
for(i=0;i<t;i++)
System.out.println(s1[i]);
}
        
}

