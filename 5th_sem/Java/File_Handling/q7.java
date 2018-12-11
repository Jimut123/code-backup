/*Write a Java program to extract all words from any text file.
Sort those words in alphabetical order.
Display all those  sorted  words on screen and write those words in some output file.
The program should also display how many words were extracted.*/
import java.io.*;
class q7
{
    public static void main(String args[])throws IOException
    {
        String file1,file2,wo="",temp="";
        String w[] = new String[10];
        int ch,nw,flag,pass,m,l,i,x=0;
        char ch1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter Input File Name = ");
        file1=br.readLine();
        System.out.print("Enter Output File Name = ");
        file2=br.readLine();
        FileInputStream fp1 = new FileInputStream(file1);
        FileOutputStream fp2=new FileOutputStream(file2);
        flag=1;
        nw=0;
        while((ch=fp1.read())!=-1)
        {
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
         wo="";
         for(i=0;i<x;i++)
            wo=wo+w[i]+" ";
         wo=wo.trim();
         l=wo.length();
         for(i=0;i<l;i++)
         {
           ch1=wo.charAt(i);
           if((ch1>=65 && ch1<=90) || (ch1>=97 && ch1<=122))
           fp2.write(ch1);
           else
           {
             fp2.write(13);
             fp2.write(10);
           }
         }
         fp1.close();
         fp2.close();
    }
}