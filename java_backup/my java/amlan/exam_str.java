import java.io.*;
class exam_str
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
String s,w="";
String s1[]=new String[100];
int l,t=0;
int i,j,k;
char ch,ch1;
void input()throws IOException
{
System.out.println("Enter string:");
s=input.readLine();
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(ch=='!'||ch=='.'||ch=='?'||ch==',')
{
w=w+ch;
s1[t++]=w;
w="";
    }
    else
    {
    if(ch!=' ')
    w=w+ch;
}
    }
}    
    void arrange_str()
    {
        for(i=0;i<t;i++)
        {
        for(k=65;k<=90;k++)
        {
        for(j=0;j<s1[i].length()-1;j++)
        {
            ch1=s1[i].charAt(j);
            if(ch1==' ')
            {
                if((char)k==w.charAt(0))
                System.out.print(w+" ");
                    w="";
                }
                else
                   w=w+ch1;
                
            }
            if((char)k==w.charAt(0))
                System.out.print(w+s1[i].charAt(s1[i].length()-1));
                    w="";
                }
            }
        }
        
        void vowelfind_str()
        {
            for(i=0;i<t;i++)
        {
        
        for(j=0;j<s1[i].length();j++)
        {
            ch1=s1[i].charAt(j);
            if(ch1==' ')
            {
                if(w.charAt(0)=='A'||w.charAt(0)=='E'||w.charAt(0)=='I'||w.charAt(0)=='O'||w.charAt(0)=='U')
                System.out.println(w);
                w="";
            }
            else
            w=w+ch1;
        }
        if(w.charAt(0)=='A'||w.charAt(0)=='E'||w.charAt(0)=='I'||w.charAt(0)=='O'||w.charAt(0)=='U')
                System.out.println(w);
                w="";
            }
        }
    }


