package finalprojectwork.twowhileanddowhile;


// Project folder:  ...\Source_IX\Chapter 16\SwitchDay
import java.io.*;
class SwitchDay {
    public static void main(String args[]) throws java.io.IOException {
            BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));       
        int mon; // Variable hold the month number.
        int day=0; // Month days
        String cmonth; // Character month
        System.out.print("Enter month number : ");
        mon = Integer.parseInt(stdin.readLine());
        switch (mon)
		{
			case 1: day = 31;
				cmonth = "January";
				break;
			case 2: day = 28;
				cmonth = "February";
				break;
			case 3: day = 31;
				cmonth = "March";
				break;
			case 4: day = 30;
				cmonth = "April";
				break;
			case 5: day = 31;
				cmonth = "May";
				break;
			case 6: day = 30;
				cmonth = "June";
				break;
			case 7: day = 30;
			    cmonth = "July";
			    break;
			case 8: day = 31;
				cmonth = "August";
				break;
			case 9: day = 30;
				cmonth = "September";
				break;
			case 10: day = 31;
				cmonth = "October";
				break;
			case 11: day = 30;
				cmonth = "November";
				break;
			case 12: day = 31;
				cmonth = "December";
				break;
			default: cmonth = "Invalid input";
		}
		System.out.println("You choose the month -> " + cmonth);
		System.out.println("This month has -> " + day + " days");
    }
}