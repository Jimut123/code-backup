import java.util.*;
import java.io.*;
class vecto
{
	public static void main(String args[])throws IOException
	{
	DataInputStream d=new DataInputStream(System.in);
	Vector list=new Vector();
	String s[]=new String[5];
	int i,k;
	double pos;
	
	 
	for(i=0;i<5;i++)
	{
	System.out.println("Give String:");
	s[i]= d.readLine();
	 }
	 //for(i=0;i<5;i++)
	//{
	//System.out.println(s[i]);
	
	 //}
	 for(i=0;i<5;i++)
	{
	list.addElement(s[i]);
	 }
	for(i=0;i<5;i++)
	{
	list.elementAt(i);
	 } 
	 k=Integer.parseInt(d.readLine());
	 //Integer kk=new Integer(k);
	 pos=Double.parseDouble(d.readLine());
	 //Double pos1=new Double(pos);
	 String str=Integer.toString(k);
	 
	 list.insertElementAt(str,2);
	 str=Double.toString(pos);
	 list.insertElementAt(str,3);
	 s=new String[7];
	 list.copyInto(s);
	 for(i=0;i<7;i++)
	{
	System.out.println(s[i]);
	 } 
	 list.elementAt(0);
}
}
