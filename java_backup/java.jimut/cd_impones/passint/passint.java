// Project folder:  ...\Source_IX\Chapter 17\passint
	// Program to demonstrate int type parameter
	import java.io.*;
	class passint {
		void cal_side(int side)
		{
			int area, volume, cube;
			area = side * side;
			volume = side * side * side;
			cube = 6 * area;
			System.out.println("The side is : " + side);
			System.out.println("The area is : " + area);
			System.out.println("The volume is : " + volume);
			System.out.println("The cube is : " + cube);
		}
		public static void main(String args[]) throws IOException{
      			BufferedReader stdin = 
				new BufferedReader (new InputStreamReader(System.in));
   			passint Sd = new passint();
			int length;
			System.out.println("Enter the length : ");
			length = Integer.parseInt(stdin.readLine());
			Sd.cal_side(length);
		}
	}