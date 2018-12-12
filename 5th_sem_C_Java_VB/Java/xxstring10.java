import java.io.*;
	class xxstring10
	{
		public static void main(String args[])throws IOException
		{
		String s1,s2;
		int i,n,m,count;
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter any sentence = ");
		s1=br.readLine();
		System.out.print("Enter your pattern to be searched = ");
		s2=br.readLine();
		n=s1.length();
		count=0;
			for(i=0;i<n;i++)
			{
			m=s1.indexOf(s2,i);
				if(m !=-1)
				{
				System.out.println(s2+" found at position = "+m);
				count++;
				i=m;
				}
				else
				break;
			}
			if(count !=0)
			System.out.println("Number of times "+s2+" found = "+count);
			else
			System.out.println(s2+" not found");
		}
	}