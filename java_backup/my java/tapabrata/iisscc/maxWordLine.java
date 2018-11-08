package iisscc;
import java.io.*;
class maxWordLine
{//declaration of class
	public static int wordCount(String text)
	{//defining function
		int i,wc,ln;
		char ch=' ';//declaring variables
		text=text.trim();
		ln=text.length();
		wc=0;
		for(i=0;i<ln;i++)
		{
			ch=text.charAt(i);
			if(ch==' ')
			{
				wc++;
			}
		}
		return wc+1;
		
	}
	public static void main(String args[])throws IOException
	{//defining main method
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String lines,tmpword,sent;
      int ln,lnc,i,j,c,maxw,wc;//declaring variables
		char ch= ' ';
	System.out.print("\nEnter  lines of text :");
		lines=br.readLine();
		lines=lines.trim();
		ln=lines.length();
		lnc=0;
		for(i=0;i<ln;i++)
		{
			ch=lines.charAt(i);
			if(ch==',' || ch=='!' || ch=='.')
				lnc++;
		}
		String text[]=new String[lnc];//string array
		c=0;
		sent="";
		for(i=0;i<ln;i++)
		{
			ch=lines.charAt(i);
			if(ch==',' || ch=='!' || ch=='.')
			{
				text[c++]=sent;
				sent="";
			}
			else
			{
				sent=sent+ch;
			}
		}
	    maxw=0;
		sent="";
		for(i=0;i<c;i++)
		{
			if(wordCount(text[i])>maxw)
			{
				maxw=wordCount(text[i]);
				sent=text[i];
			}
		}
		String word[]=new String[maxw];
		sent=sent+" ";
		ln=sent.length();
		wc=0;
		tmpword="";
		for(i=0;i<ln;i++)
		{
			ch=sent.charAt(i);
			if(ch==' ')
			{
			  word[wc++]=tmpword;
			  tmpword="";	
			}
			else
			{
				tmpword=tmpword+ch;
			}
		}
		for(i=0;i<wc-1;i++)//sorting
		{
			for(j=0;j<wc-1-i;j++)
			{
				if(word[j+1].compareToIgnoreCase(word[j])<0)
				{
					tmpword=word[j];
					word[j]=word[j+1];
					word[j+1]=tmpword;
				}
			}
		}
		System.out.print("\nLine that contains maximum number of words in asc order\n");
		for(i=0;i<wc;i++)
		{
			System.out.print(word[i]+" ");//displaying the line
		}
	}//end of main
}//end of class