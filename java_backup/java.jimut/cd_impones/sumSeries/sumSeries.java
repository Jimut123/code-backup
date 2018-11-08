// Project folder:  ...\Source_IX\Chapter 16\sumSeries
		import java.io.*;
		public class sumSeries
		{
         			public static void main(String[] args) throws IOException 
            			{
					BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));      
                					int x, i=0, ctr;
                					float sum = 0, f, p = 1;
                					int k = 3;
                					System.out.println("Enter the value of x : ");
					x = Integer.parseInt(stdin.readLine());
					while (i <= 5)
					{
				    		/*Find the x to the power k */
                    						for(ctr = 1; ctr<= k; ctr++)
                        							p = p * x;
						f = 1;
						for(int j = 1; j <= k; j++)
							f = f * j;
						sum = sum + p / f;
						k = k + 2;
						i = i + 1;
                 					}   
					System.out.println("Sum of the first 5 terms of the series is : " + sum);
            				}
		}