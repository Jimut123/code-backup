// Project folder:  ...\Source_IX\Chapter 14\LiteralM
	// Demonstrate literals in Java
	public class LiteralM {
		public static void main(String[] arg) {
			char c = 0xffff; // max char hex value
			byte b = 0x7f; // max byte hex value
			System.out.println("Max char hex value : " + c);
			System.out.println("Max byte hex value : " + b);
			short s = 0x7fff; // max short hex value
			System.out.println("Max short hex value : " + s);
			int i1 = 0x2f; // Hexadecimal (lowercase)
			int i2 = 0X2F; // Hexadecimal (uppercase)
			int i3 = 0177; // Octal (leading zero)
			System.out.println("Hexadecimal lowercase hex value : " + i1);
			System.out.println("Hexadecimal uppercase hex value : " + i2);
			System.out.println("Octal leading zero : " + i3);
			// Hex and Oct also work with long.
			long n1 = 200L; // long suffix
			long n2 = 200l; // long suffix (but can be confusing)
			long n3 = 200;
			System.out.println("Long suffix values : " + n1 + " " + n2 +  " " + n3);
			// ! long l6(200); // not allowed
			float f1 = 1;
			float f2 = 1F; // float suffix
			float f3 = 1f; // float suffix
			System.out.println("Float suffix values : " + f1 + " " + f2 + " " + f3);
			float f4 = 1e-45f; // 10 to the power
			System.out.println("10 to the power : " + f4);
			float f5 = 1e+9f; // float suffix
			System.out.println("Float suffix values : " + f5);
			double d1 = 1d; // double suffix
			double d2 = 1D; // double suffix
			System.out.println("Double suffix values : " + d1 + " " + d2);
			double d3 = 47e47d; // 10 to the power
			System.out.println("10 to the power : " + d3);
		}
	}