import java.io.*;
class string1
{
	public static void main(String args[])throws IOException
	{
	String s1,s2,s3;	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter any sentence:");
	s1=br.readLine();
	s2=s1.toLowerCase();//to conv caps to small
	s3=s1.toUpperCase();
	System.out.println("Original:"+s1);
	System.out.println("Small Case:"+s2);
	System.out.println("Upper Case:"+s3);
	}
}

