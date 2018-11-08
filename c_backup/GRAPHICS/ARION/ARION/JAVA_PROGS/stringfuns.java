import java.io.*;
import  java.util.*;
class stringprogs
{
	static int strcmp(String s1,String s2)
	{
		int l1=s1.length();
		int l2=s2.length();
		int i=0,j=0;
		while(i<l1||j<l2)
		{
			if(s1.charAt(i++)!=s2.charAt(j++))
			{
				return 0;
			}
		}
		return 1;
	}
	static int strcmp(char w1[],char w2[],int l1,int l2)
	{

		int i=0,j=0;
		while(i<l1||j<l2)
		{
			if(w1[i++]!=w2[j++])
			{
				return 0;
			}
		}
		return 1;
	}

	static String strcat(String s1,String s2)
	{
		String s;
		s=s1;
		s+=s2;
		return s;
	}
	static String strrev(String s)
	{
		int l1=s.length();
		String r=new String();
		
		while(l1>0)
		{
			r+=s.charAt(l1-1);
			l1--;
		}
		return r;
	}
	static String capstosmall(String s)
	{
		String t=new String();
		int i=0,l=s.length();
		 while(i<l)
		 {
		 	if((int)s.charAt(i)>=65&&(int)s.charAt(i)<=90)
		 			t+=(char)((int)s.charAt(i)+32);
		 		i++;
		 }
		 return t;
	}
	static String smalltocaps(String s)
	{
		String t=new String();
		int i=0,l=s.length();
		 while(i<l)
		 {
		 	if((int)s.charAt(i)>=97&&(int)s.charAt(i)<=122)
		 		t+=(char)((int)s.charAt(i++)-32);
		 	i++;
		 }
		 return t;
	}
	static void countalpha(String s)
	{
		int i=0,cv=0,cc=0,cd=0,cs=0;
		int l=s.length();
		char c;
		String s1=smalltocaps(s);
		while(i<l)
		{
			c=s1.charAt(i++);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				cv++;
			else if(c>=48&&c<=57)
				cd++;
			else if(c==' ')
				cs++;
			else cc++;
		}
		System.out.println("\nIn String :"+s+"\nNo of Vowels"+cv+"No of Consonaunts"+cc+"No of Digits"+cd+"No of Spaces"+cs);
	}
	static void extractwrds(String s)
	{
		char wd[]=new char[20];
		int l=s.length(),i=0,k=0;
		System.out.println("\nIn String :"+s);
		while(i<l)
		{
			k=0;
			if(s.charAt(i)!=' ')
			{
				while(s.charAt(i)!=' ')
					wd[k++]=s.charAt(i++);
			}
			System.out.println("\nWord is:"+wd);
		}
	}
	static void cmpgrtsubstring(String s1,String s2)
	{
		int l1=s1.length(),l2=s2.length(),k1=0,k2=0,l11=0,l22=0,i=0,j=0,cmp=0,l=0;
		 
		while(i<l1||j<l2)
		{
			char wd1[]=new char[20],wd2[]=new char[20];
			l11=0;
			l22=0;
			k1=0;
			k2=0;
			if(s1.charAt(i)==s2.charAt(j))
			{
				while(s1.charAt(k1)!=' ')
					wd1[l11++]=s1.charAt(k1++);
				while(s2.charAt(k2)!=' ')
					wd2[l22++]=s2.charAt(k2++);
				cmp=strcmp(wd1,wd2,l11,l22);
				if(cmp==1)
				{
					if(l1>l)
						l=l1;
				}
			}
		}
		System.out.println("\nThe length of greatest common substring is: "+l );
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1="",s2="",s3="",s4=new String(),s5=new String(),s6="",s7="";
		int ch;
		System.out.println("\nEnter the 1st String :");
		s1=sc.nextLine();
		System.out.println("\nEnter the 1st String :");
		s2=sc.nextLine();
		do
		{
			System.out.println("String Prog\n1.String comp\n2.String concat\n3.String reverse\n4.Caps to small\n5.small to caps\n6.Count Alphabets\n7.Compare largest Substring\n8.Extract words\n9.Exit\nEnter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:if(strcmp(s1,s2)==1)
							System.out.println("Strings are same");
							else System.out.println("Strings are not same");
						break;
				case 2:s3=strcat(s1,s2);
						System.out.println("Concatenated String is:"+s3);
						break;
				case 3:s4=strrev(s1);
					   s5=strrev(s2);
					   System.out.println("Reversed Strings are :"+s4+"\n"+s5);
					   break;
				case 4:s6=capstosmall(s1);
				System.out.println("Strings after caps to small :"+s6);
						break;
				case 5:s7=smalltocaps(s2);
						System.out.println("Strings after small to caps: "+s7);
						break;
				case 6:countalpha(s1);
						break;
				case 7: cmpgrtsubstring(s1,s2);
						break;
				case 8: extractwrds(s1);
						extractwrds(s2);
						break;
				case 9:return;
				default: System.out.println("Wrong Choice!!!");

			}			
		}while(ch!=9);
	}
}
 