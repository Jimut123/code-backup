// Project folder:  ...\Source_IX\Chapter 17\Square
class Square {
			void sqr(int i, int j)
			{	
				i = i * j;
				j = j * j;
				System.out.println(i);
				System.out.println(j);
			}
			public static void main(String args[]) {
				Square SQ = new Square();
				int i = 4, j;
				j = 10;
				SQ.sqr(i, j);
			}
}