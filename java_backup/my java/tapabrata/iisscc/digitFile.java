package iisscc;
import java.io.*;
class digitFile
{//declaration of class
	public static int freqDig(int num,int d)
	{
		int i,c=0,dig;//declaring variables
		
		while(num!=0)
		{
			dig=num%10;
			if(dig==d)
				c++;
			num/=10;	
		}
		return c;				
	}//end of function
	public static void main(String args[])throws IOException
	{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		{int i,no,c,maxfr=0,num=0,dig;//declaring variables
		float marks;
		char ch=' ';
		FileOutputStream fo=new FileOutputStream("ALLNUMBER.txt");
		DataOutputStream dw=new DataOutputStream(fo);
        c=1;		
		do
		{//using do-while loop
			System.out.print("\nEnter a number     :");
			no=Integer.parseInt(br.readLine());
			dw.writeInt(no);
			System.out.print("\nAdd more [Y/N]:");
			ch=br.readLine().charAt(0);
			if(ch=='y' || ch=='Y')
			{
				c++;
				continue;
			}
			else
			{
				break;
			}
			
		}while(true);
		dw.close();
		FileInputStream fis=new FileInputStream("ALLNUMBER.txt");
		DataInputStream dr=new DataInputStream(fis);
		System.out.print("\nEnter a digit     :");
		dig=Integer.parseInt(br.readLine());
		maxfr=0;
		System.out.print("\nContent of ALLNUMBER.txt files\n");
		for(i=1;i<=c;i++)
		{
			no=dr.readInt();
			System.out.print(no+"\t");
			if(freqDig(no,dig)>maxfr)
			{
				maxfr=freqDig(no,dig);//max frequency
				num=no;
			}
		}
		dr.close();
		System.out.print("\nMax frequency of a number :"+num);//printing the result
		
	}
}//end of main
}//end of class