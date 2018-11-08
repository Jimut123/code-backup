
import java.io.*;
public class datediff
{
    
	public static void main ()throws IOException
	{
	int arrm1[]={31,29,31,30,31,30,31,31,30,31,30,31};
	int arrm[]={31,28,31,30,31,30,31,31,30,31,30,31};
	int dd;
	int mm;
	int yy;
	int dd1;
	int mm1;
	int yy1;
	 do
	 {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter Date");
	 dd=Integer.parseInt(br.readLine());
	 System.out.println("Enter Month");
	 mm=Integer.parseInt(br.readLine());
	 System.out.println("Enter Year");
	 yy=Integer.parseInt(br.readLine());
	 
	 }while(validity(mm,dd,yy)==false);
	 
	 int datedif=0;
	 
	 do
	 {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter Date");
	 dd1=Integer.parseInt(br.readLine());
	 System.out.println("Enter Month");
	 mm1=Integer.parseInt(br.readLine());
	 System.out.println("Enter Year");
	 yy1=Integer.parseInt(br.readLine());
	 
	 }while(validity(mm1,dd1,yy1)==false);
	 if(yy==yy1)
	 {
	  
	  int c=mm+1;
	  if (yy%4==0 && yy%100!=0 || yy%400 ==0)
	 { 
	 if(mm1==mm)
	 datedif=datedif+dd1-dd;
	 else
	 datedif=datedif+(arrm1[mm-1])-dd+dd1;

	  while(c<mm1)
	  {
	  
	   datedif=datedif+arrm1[c-1];
	   c++;
	  }
	 }
	 else
	 { 
	  if(mm1==mm)
	 datedif=datedif+dd1-dd;
	 else
	    datedif=datedif+(arrm[mm-1])-dd+dd1;
	    
	    while(c<mm1)
	    {
	  
	     datedif=datedif+arrm[c-1];
	     c++;
	    }
	 }
	}
	System.out.println("The date difference is "+datedif);
  }
	
	public static boolean validity(int d,int m,int y)
	{
	    int v=0;
	    int l=0;
	    int arrm1[]={31,29,31,30,31,30,31,31,30,31,30,31};
	    int arrm[]={31,28,31,30,31,30,31,31,30,31,30,31};
		if(m>12 || m<1)
		return false;
		if(d>31)
		return false;
		if (y%4==0 && y%100!=0 || y%400 ==0)
		for(int i=0;i<12;i++)
		{
		  
		  if(d>arrm1[m-1])
		  v=1;
		}
		else
		
		for(int i=0;i<12;i++)
		{
		  
		  if(d>arrm[m-1])
		  v=1;
		}
		if(v==1)
		{
	     System.out.println("Date not valid");
	     return false;
		}
		return true;
	}
}
