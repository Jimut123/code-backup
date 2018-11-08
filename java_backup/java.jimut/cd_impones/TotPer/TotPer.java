// Project folder:  ...\Source_IX\Chapter 15\TotPer
	import java.io.*;
	public class TotPer
	{
	    public static void main(String[] args) throws Exception
	    {
        			BufferedReader Din =
				new BufferedReader(new InputStreamReader(System.in));
			int mEng, mHin, mMath, mSc; // Four variables for input marks
			float totMark = 0, perMark = 0; // Two variables for calculation
			String strNumber;
			System.out.print("Enter english mark : ");
			strNumber = Din.readLine();
			mEng = Integer.parseInt(strNumber);
			System.out.print("Enter hindi mark : ");
			strNumber = Din.readLine();
			mHin = Integer.parseInt(strNumber);
			System.out.print("Enter maths mark : ");
			strNumber = Din.readLine();
			mMath = Integer.parseInt(strNumber);
			System.out.print("Enter science mark : ");
			strNumber = Din.readLine();
			mSc = Integer.parseInt(strNumber);
			totMark = mEng + mHin + mMath + mSc;
			perMark = totMark / 4;
        			System.out.println("Your total marks is : " + totMark);
		        	System.out.println("Your percentaage of marks is : " + perMark);
    		}
	}