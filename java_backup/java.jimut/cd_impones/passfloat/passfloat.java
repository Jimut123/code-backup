// Project folder:  ...\Source_IX\Chapter 17\passfloat
	// Program to demonstrate int type parameter
	import java.io.*;
	class passfloat {
		void area_circle(float radius)
		{
			double area = 0;
			area = 3.14 * radius * radius;
			System.out.println("The area of circle is : " + area);
		}
		public static void main(String args[]) throws IOException{
      			BufferedReader stdin = 
				new BufferedReader (new InputStreamReader(System.in));
	   		passfloat Cr = new passfloat();
			float r;
			System.out.println("Enter the radius of circle : ");
			r = Integer.parseInt(stdin.readLine());
			Cr.area_circle(r);
		}
	}