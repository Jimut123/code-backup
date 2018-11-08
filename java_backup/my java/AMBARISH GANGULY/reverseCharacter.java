import java.io.*;
class reverseCharacter
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
char ch;
int i;
void input()throws IOException
{
for(i=1;i<=5;i++)
System.out.println(printback());
}
char printback()throws IOException
{
char ch;
ch=(char)System.in.read();
if(ch=='.')
{
//System.out.println(ch);
return ch;
}
else 
{
return(printback());
}
}
}









