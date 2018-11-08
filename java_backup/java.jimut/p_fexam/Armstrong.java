import java.io.*;
		public class Armstrong
		{
    			public static void main(String[] args) throws IOException 
    			{
        				BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));      
        				int  n, i, k, s, d;
        				System.out.println("Enter the end limit : ");
        				n = Integer.parseInt(stdin.readLine());
        				System.out.println("The numbers are : ");
				for (i = 1 ;i <= n; i++)
				{
	   	   			s = 0;
					k = i;
					while (k != 0)
					{
						d = k % 10;
						s = s + d * d * d;
						k = k / 10;
	      				}
					if ( s == i)
						System.out.println(i);
	    			}
			}
		}