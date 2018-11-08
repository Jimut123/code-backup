import java.io.*;
class str_cpy
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader ab = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(ab);
		String str1,str2,str3,str4;
		String cap1,small1,ltrims,rtrims,trims;
		System.out.println("\n Enter a string : ");
		str1 = cd.readLine();
		//strcpy(str1,str2);
		System.out.println("\n Enter another string : ");
		str2 = cd.readLine();
		str3 = str1.concat(str2);
		System.out.println("\n The  string : "+str3);
		str4 = new StringBuilder(str1).reverse().toString();
		System.out.println("\n The  string reversed : "+str4);
		cap1 = str1.toUpperCase();
		System.out.println("\n The  string : "+cap1);
		small1 = cap1.toLowerCase();
		System.out.println("\n The  string : "+small1);
		ltrims = str1.replaceAll("^\\s+","");
		//String ltrim = s.replaceAll("^\\s+","");
		//String rtrim = s.replaceAll("\\s+$","");
		System.out.println("\n The  ltrim string : <"+ltrims+">");
		rtrims = str1.replaceAll("\\s+$","");
		System.out.println("\n The  rtrim string : <"+rtrims+">");
		trims = str1.trim();
		System.out.println("\n The  trimmed string : <"+trims+">");
		
	}
}
