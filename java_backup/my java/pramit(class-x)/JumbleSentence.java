import java.io.*;
class JumbleSentence
{
public static void main(String[]args)throws IOException
{
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader bb=new BufferedReader(aa);
String s,w;
w="";
int i,j;
System.out.print("input sentence 4 jmbling=");
s=bb.readLine();
for(i=0,j=1,i<s.length()-1,j<s.length(),i=j+2,j=j+1)
{
if(s.charAt(i)!=' '&& s.charAt(j)!=' ')
{
w=w+s.charAt(j);
w=w+s.charAt(i);
}
}
System.out.println(w);
}
}



