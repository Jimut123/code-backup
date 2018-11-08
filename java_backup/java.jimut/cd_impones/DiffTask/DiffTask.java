// Project folder:  ...\Source_IX\Chapter 16\DiffTask
import java.io.*;
class DiffTask {
    public static void main(String args[]) throws IOException {
        BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));       
		int num1, num2;
        int r, l, b, ch;
        double a, c;
        System.out.println("1. For area of circle");
        System.out.println("2. For area of rectangle");
		System.out.println("3. For circumference of circle");
		System.out.println("4. For area of square");
		System.out.print("Enter your choice ");
		ch = Integer.parseInt(stdin.readLine());
		switch (ch)
		{
		  case 1: System.out.print("Enter the radius of the circle ");
		      r = Integer.parseInt(stdin.readLine());
		      a = 3.14 * r * r;
		      System.out.println("Area of circle is => " + a);
		      break;
		  case 2: System.out.print("Enter the length ");
		      l = Integer.parseInt(stdin.readLine());
		      System.out.print("Enter the breadth ");
		      b = Integer.parseInt(stdin.readLine());
		      a = l * b;
		      System.out.print("Area of rectangle is => " + a);
		      break;
		  case 3: System.out.print("Enter the radius of the circle ");
		      r = Integer.parseInt(stdin.readLine());
		      c = 2 * 3.14 * r;
		      System.out.print("Circumference of circle is => " + c);
		      break;
		  case 4: System.out.print("Enter the side of square ");
		      l = Integer.parseInt(stdin.readLine());
		      a = l * l;
		      System.out.print("Area of square is => " + a);
		      break;
      }
    }
}