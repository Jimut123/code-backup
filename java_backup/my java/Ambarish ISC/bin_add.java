import java.io.*;
class bin_add
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,c,k=0;String s,s1,s2;
System.out.print("Enter the number");
s=br.readLine();
s1=br.readLine();
if(s.length()>s1.length())
{
  k=s.length()-s1.length();
  i=1;
  while(i<=k)
  {
      s1="0"+s1;
      i++;
    }
}
else if(s1.length()>s.length())
{
  k=s1.length()-s.length();
  i=1;
  while(i<=k)
  {
      s="0"+s;
      i++;
    }
}
 c=0;
 s2="";
for(i=s.length()-1;i>=0;i--)
{
    //System.out.println(c);
    if(s.charAt(i)=='0'&&s1.charAt(i)=='0'&&c==0)
    {
        s2="0"+s2;
        c=0;
    }
    else if(s.charAt(i)=='0'&&s1.charAt(i)=='0'&&c==1)
    {
        s2="1"+s2;
        c=0;
    }
    else if(s.charAt(i)=='1'&&s1.charAt(i)=='0'&&c==0)
    {
        s2="1"+s2;
        c=0;
    }
    else if(s.charAt(i)=='1'&&s1.charAt(i)=='0'&&c==1)
    {
        s2="0"+s2;
        c=1;
    }
    else if(s.charAt(i)=='0'&&s1.charAt(i)=='1'&&c==1)
    {
        s2="0"+s2;
        c=1;
    }
     else if(s.charAt(i)=='0'&&s1.charAt(i)=='1'&&c==0)
    {
        s2="1"+s2;
        c=0;
    }
     else if(s.charAt(i)=='0'&&s1.charAt(i)=='1'&&c==1)
    {
        s2="0"+s2;
        c=1;
    }     else if(s.charAt(i)=='1'&&s1.charAt(i)=='1'&&c==0)
    {
        s2="0"+s2;
        c=1;
    }
    else
    {
        s2="1"+s2;
        c=1;
    }
}
s2=c+s2;
System.out.print(s2);
}
}
    