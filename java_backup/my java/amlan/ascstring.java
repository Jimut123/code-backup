
import java.io.*;
class ascstring
{
	String s;
	int i,j,t;
	char ch;
	BufferedReader br=new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
	void input()throws IOException
	{
	System.out.println("Give Code:");
	s=br.readLine();
	for(i=0;i<s.length();i++)
	{
	ch=s.charAt(i);
	conv(ch);
	}
	t=0;
	}
	void conv(char ch)
	{
	if(ch=='0')
	t=(t*10)+0;
	else
	if(ch=='1')
	t=(t*10)+1;
	else
	if(ch=='2')
	t=(t*10)+2;
	else
	if(ch=='3')
	t=(t*10)+3;
	else
	if(ch=='4')
	t=(t*10)+4;
	else
	if(ch=='5')
	t=(t*10)+5;
	else
	if(ch=='6')
	t=(t*10)+6;
	else
	if(ch=='7')
	t=(t*10)+7;
	else
	if(ch=='8')
	t=(t*10)+8;
	else
	if(ch==9)
	t=(t*10)+9;
	if(t>=65 && t<=90)
	{
	System.out.print((char)t);
	t=0;
	}
	else
	if(t>=97 && t<=122)
	{
	System.out.print((char)t);
	t=0;
	}
	else
	if(t==32)
	{
	System.out.print((char)t);
	t=0;
	}
	
}
}
