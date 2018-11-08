
import java.io.*;
class stringbuff
{
	public static void main(String args[])throws IOException
	{
	DataInputStream d=new DataInputStream(System.in);
	StringBuffer sb;
	String s;
	int pos,i;
	pos=0;
	System.out.println("Give String:");
	sb=new StringBuffer(d.readLine());
	 System.out.println(sb);
	for(i=0;i<sb.length();i++)
	{
	if(sb.charAt(i)==' ')
	 {
	 pos=i;
	 break;
	 }
	 }
	 System.out.println("Give new String for insert:");
	s=d.readLine();
	s=" "+s;
	 sb.insert(pos,s);
	  System.out.println(sb);
	 System.out.println("Give new String for append:");
	s=d.readLine();
	s=" "+s;
	 sb.append(s);
	 System.out.println(sb);
}
}
