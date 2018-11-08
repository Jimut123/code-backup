import java.io.*;

class consecutiveNumberSum
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num,i,s,flag,start=0,stop=0,k,j;
		System.out.println("Enter a number:");
		num=Integer.parseInt(br.readLine());
		
		for(i=1;i<=num/2+1;i++)
		{
			s=0;
			flag=0;
			start=i;
			for(j=i;j<=num/2+1;j++)
			{
				s=s+j;
				if(s==num)
				{
					stop=j;
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				for(k=start;k<=stop;k++)
					System.out.print(k+"\t");
					
				System.out.print("\n");	
			}
			
		}
		
		
		
	} 
		
		
}