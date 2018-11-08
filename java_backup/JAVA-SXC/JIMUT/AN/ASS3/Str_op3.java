
import java.io.*;
class String_Ops3
{
	public static void main(String args[])throws IOException
    {
    	InputStreamReader ab = new InputStreamReader(System.in);
    	BufferedReader cd = new BufferedReader(ab);
    	String str_1, trim_str;
    	System.out.println("\n Enter a string : ");
    	str_1 = cd.readLine();
    	trim_str = str_1.replaceAll("\\s+"," ");
    	trim_str = trim_str.trim();
    	System.out.println("\n The original string : <"+str_1+">");
    	System.out.println("\n The new string : <"+trim_str+">");
    }
}
