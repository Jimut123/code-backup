/*Write a Java program to extract all words from a input sentence.
Sort those words in alphabetical order.
Display all those  sorted  words on screen.
The program should also display how many words were extracted.*/
import java.io.*;
class q7a
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str,wo="",temp="";
        String w[] = new String[10];
        int i,nw=0,flag=1,l,x=0,pass=0,m,ch;
        char ch1;
	System.out.println("\nEnter a sentence : ");
	str=br.readLine();
	l=str.length();
        for(i=0;i<l;i++){
	    ch1=str.charAt(i);
            ch=(int)ch1;
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
            {
                if(flag==1)
                {
                    nw++;
                    flag=0;
                 }
                 wo=wo+(char)ch;
                 System.out.print((char)ch);
            }
           else if(flag==0)
           {
                w[x++]=wo;
                wo="";
                System.out.println();
                flag=1;
                if((nw%20)==0)
                {
                   System.out.print("\nPress Enter Key--->");
                   br.readLine();
                 }
            }
         }
         System.out.println("\nTotal number of words extracted = "+nw);
         System.out.println("Unsorted List");
         for(i=0;i<x;i++)
            System.out.println(w[i]);
         flag=pass=0;
		m=x;
			while(flag==0)
			{
			flag=1;
			pass=pass+1;
			m=m-1;
				for(i=0;i<m;i++)
				{
					if(w[i].compareTo(w[i+1])>0)
					{
					temp=w[i];
					w[i]=w[i+1];
					w[i+1]=temp;
					flag=0;
					}
				System.out.println("\nPass="+pass+" Step="+(i+1));
					for(int k=0;k<x;k++)
					System.out.println(w[k]);
				System.out.print("\nPress enter key--->");
				br.readLine();
				}
			}
		System.out.println("\nSorted List");
                for(i=0;i<x;i++)
                  System.out.println(w[i]);
    }
}