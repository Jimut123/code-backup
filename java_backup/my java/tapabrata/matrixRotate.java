

import java.io.*;

class matrixRotate
{
	public static int ar[][]=new int[10][10];
	public static int dummy[][]=new int[10][10];
	public static int r,c;
	
	public static void getElement()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,j;
		System.out.print("Enter no. of rows : ");
		r=Integer.parseInt(br.readLine());
		System.out.print("Enter no. of cols : ");
		c=Integer.parseInt(br.readLine());
		
		System.out.println("");
		for(i=0;i<r;i++)				
		{
			for(j=0;j<c;j++)
			{
				System.out.println("Enter an element  : ");
				ar[i][j]=Integer.parseInt(br.readLine());				
			}
		}
	}  
//=======================================================
		
	public static void rotate_90_Degrees()
	{
		int C,tmp=0,i,j;
		C=r-1;
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				dummy[j][C]=ar[i][j];
			}
			C--;
		}
		//-----------------------				
		tmp=r;
		r=c;
		c=tmp;
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				ar[i][j]=dummy[i][j];
			}			
		}		
	}  

//=======================================================
		
	public static void display()
	{
		int i,j;				
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(ar[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}  
	
	
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,angle,time;
		
		getElement();
		System.out.print("\nElemts before rotation\n");
		display();
		
		System.out.println("Enter the +ve agngle multiple of 90 degrees :");
		angle=Integer.parseInt(br.readLine());
		time=angle/90;
		
			
		for(i=1;i<=time;i++)
		{
			rotate_90_Degrees();
		}
		System.out.print("\nElemts after rotation\n");
		display();
		
		
	}  // end of main
		
		
}// end of class