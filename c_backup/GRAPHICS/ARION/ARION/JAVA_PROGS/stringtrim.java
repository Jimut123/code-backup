import java.util.*;
class stringtrim
{
	public static void main(String args[])
	{
		String s,tmp=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\nEnter the sentence:");
		s=sc.nextLine();
		System.out.println("\n\nThe Sentence is:"+s);
		
		int l1=s.length();
				int flag=0,ch,pos=0;
		for(int i=0;i<l1;i++)
		{
			if(s.charAt(i) == ' ' && s.charAt(i+1)==' ' )
			{
				while(s.charAt(++i+1)==' ');
			}
			tmp+=s.charAt(i);
		}
		System.out.println("\n\nThe Trimmed Sentence is:"+tmp);
	}

}