package LinkList;
import java.io.*;
class eachword
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String word="";
String s="";
int i,len;
char k;
linkedlist6 ob=new linkedlist6();
System.out.println(" Enter string ");
s=br.readLine();
s=s+" ";
len=s.length();
for(i=0;i<len;i++)
{
k=s.charAt(i);
if(k!=' ')
word=word+k;
else
{
ob.Insert(word);
word="";
}
}
ob.display();
}
}