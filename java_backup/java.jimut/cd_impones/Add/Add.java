// Project folder:  ...\Source_IX\Chapter 17\Add
		class Add {
		  	int add(int j)
			{
				if (j>=4)
					j = j * j;
				else
					j = j * 2;
				return (j);
			}
			public static void main(String args[]) {
				Add NA = new Add();
				int i = 4;
			    	int a;
				a = NA.add(i);
				System.out.println(a);
 			}
		}