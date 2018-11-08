	// This program to demonstrate a class object
	import java.io.*;
	public class Cube {
		int length = 10;
		int breadth = 10;
		int height = 10;
		public int getVolume() {
			return (length * breadth * height);
		}
		public static void main(String[] args) {
			Cube cubeObj; // Creates a Cube Reference
			cubeObj = new Cube(); // Creates an Object of Cube
			System.out.println("Volume of Cube is : " + cubeObj.getVolume());
		}
	}
