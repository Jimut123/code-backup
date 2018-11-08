import java.io.*;
class rearrange
{
String txt,cxt;
int len;
public rearrange()
{
txt="tapabrata";
cxt="";
len=9;
}
void readWord()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader( System.in));
System.out.println(" Enter a word in uppercase ");
txt=br.readLine();
}
void convert()
{
char ch;
int i,flag=0;
len=txt.length();
ch=txt.charAt(0);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
cxt=txt+"Y";
else
{
for(i=0;i<len;i++)
{
ch=txt.charAt(i);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
cxt=txt.substring(i)+txt.substring(0,i) +"C";
flag=1;
break;
}
}
if(flag==0)
cxt=txt+"N";
}

}
void display()
{
System.out.println(" Original word " +txt);
System.out.println(" Changed word " +cxt);
}
public static void main(String args[])throws IOException
{
rearrange ob=new rearrange();
ob.readWord();
ob.convert();
ob.display();
}
}
