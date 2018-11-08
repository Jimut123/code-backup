/* Program to implement bubble sort to sort list of names */

import java.io.*;
class String_Ops1
{
	public static void main(String args[])throws IOException
    {
    	InputStreamReader ab = new InputStreamReader(System.in);
    	BufferedReader cd = new BufferedReader(ab);
    	String 	names[] = new String[20];
    	String 	addr[] = new String[20];
    	String 	tele[] = new String[20];
    	String conct[] = new String[20];
    	int n_names,i;
    	System.out.println("\n Enter the number of names : ");
    	n_names = Integer.parseInt(cd.readLine());
    	System.out.println("\n Enter the names : ");
    	for(i=0;i<n_names;i++)
    	{
    		System.out.println("\n Enter the "+(i+1)+" names : ");
    		names[i] = cd.readLine();
    		System.out.println("\n Enter the "+(i+1)+" addr : ");
    		addr[i] = cd.readLine();
    		System.out.println("\n Enter the "+(i+1)+" tele : ");
    		tele[i] = cd.readLine();
    		conct[i] = names[i]+" "+addr[i]+" "+tele[i];
    	}
    	String_Ops1 ob = new String_Ops1();
    	ob.Sort_me_Bubble(n_names,conct);
		ob.print_names(n_names,conct);
    }
    void Sort_me_Bubble(int n, String arr[])
    {
	    int i, j,d;
	    String nam;
		for (i = 0; i < n-1; i++)      
		   // Last i elements are already in place   
		   for (j = 0; j < n-i-1; j++) 
		       {
		       	if (arr[j].compareTo(arr[j+1])>0)
		          {
					//swap(&arr[j], &arr[j+1]);
					nam = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = nam;
		          }
		      }
    }
    void print_names(int n,String arr[])
    {
    	int i;
    	System.out.println("\n The Details : ");
    	System.out.println("\n Name \t Addr \t Tele \n: ");
    	for(i=0;i<n;i++)
    	{
    		System.out.print(arr[i]+"\n");
    	}
    }
}