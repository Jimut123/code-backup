
import java.io.*;
class Extract_words
{
	public static void main(String args[])throws IOException
    {
    	InputStreamReader ab = new InputStreamReader(System.in);
    	BufferedReader cd = new BufferedReader(ab);
    	String str,wrd="",arr_wrd[] = new String[100];

    	int i,l,counter=0;
    	char ch;
    	System.out.println("\n Enter a string : ");
    	str = cd.readLine();
    	l = str.length();
    	for(i=0;i<l;i++)
    	{
    		ch = str.charAt(i);
    		if(Character.isLetter(ch)||ch=='-')
    		{
    			wrd+=ch;
    		}
    		else
    		{
    			//System.out.println(wrd);
    			if(wrd!="")
    			{
					arr_wrd[counter] = wrd;
    				counter++;
    			}
    			wrd="";
    		}
    	}
    	for(i=0;i<counter;i++)
    	{
    		System.out.print(arr_wrd[i]+"\t");
    	}

    }
}