// Project folder:  ...\Source_IX\Chapter 16\Pyramid
		/*Program to print pyramid */
		public class Pyramid
		{
         			public static void main(String[] args)
            			{
				int loop, count;
                				for( loop = 1; loop <= 5; loop = loop + 1 )
                				{
                   					for( count = 1; count <= loop; count  = count + 1 )
                      						System.out.print(loop + "   ");
                    					System.out.println();
				}
			}
		}