import java.io.*;
import java.util.Arrays;

import java.lang.*;
class fuckYou
{
	public static void main(String[] args) throws IOException
	{

		InputStreamReader ab = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(ab);
		int fuck_me;
		System.out.println("\nEnter the fuckin No. :");
		fuck_me = Integer.parseInt(cd.readLine());
		int d,no,is;
		no = fuck_me;
		int array_harami_kaisa_hai[] = new int[10],i=0;
		while(no>0)
		{
			d = no%10;
			array_harami_kaisa_hai[i++] = d;
			no=no/10;
		}
		System.out.println("array :");
		print_Array(array_harami_kaisa_hai,i);
		Arrays.sort(array_harami_kaisa_hai);
		print_Array(array_harami_kaisa_hai,i);
		
	}
static	int Is_Prime(int n)
	{
		int is;
		for(is=2;is<n;is++)
		{
			if(n%is == 0)
				return 0;
		}
		if(is>=n)
			return 1;
		return -1;
	}
static	void print_Array(int array_harami_kaisa_hai[],int n)
	{
		for(int is=0;is<n;is++)
                        System.out.println(array_harami_kaisa_hai[is]);
		
	}
}
