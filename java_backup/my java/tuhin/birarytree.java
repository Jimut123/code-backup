import java.io.*;
public class birarytree
{
static int r;
static int c;
static int arr[][]=new int [100][100];
public  static void main(String[]args)throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter Length:");
     r=Integer.parseInt(br.readLine());
     System.out.println("Enter breadth:");
    c=Integer.parseInt(br.readLine());
    
     for(int i=0;i<r;i++)
     {
	   for(int j=0;j<c;j++)
	   {
	       System.out.println("Enter Number");
	        arr[i][j]=Integer.parseInt(br.readLine());
	   }
     }
     
     
      for(int i=0;i<r;i++)
	     {for(int j=0;j<c;j++)
	      {System.out.print(arr[i][j]+"  ");
	       }
	     System.out.println();
	     }
	     
	     
	     change(1,1);
	     for(int i=0;i<r;i++)
	     {for(int j=0;j<c;j++)
	      {System.out.print(arr[i][j]+"  ");
	       }
	     System.out.println();
	     }
	     
	     
}

    
	       public static void change(int r1,int c1)
	       {
	           if((r1-1)>=0)
	           {
	               if(arr[r1-1][c1]==1)
	               {
	                   arr[r1-1][c1]=2;
	                   change(r1-1,c1);
	               }
	           }
	           
	           
	           if((r1+1)<=r)
	           {
	               if(arr[r1+1][c1]==1)
	               {
	                   arr[r1+1][c1]=2;
	                   change(r1+1,c1);
	               }
	           }
	           
	           
	           if((c1-1)>=0)
	           {
	               if(arr[r1][c1-1]==1)
	               {
	                   arr[r1][c1-1]=2;
	                   change(r,c1-1);
	               }
	           }
	           
	           
	           if((c1+1)<=c)
	           {
	               if(arr[r1][c1+1]==1)
	               {
	                   arr[r][c1+1]=2;
	                   change(r,c1+1);
	               }
	           }
	           
	           
	           if((c1-1)>=0 && (r1-1)>=0)
	           {
	            if(arr[r1-1][c1-1]==1)
	            {
	                arr[r1-1][c1-1]=2;
	               change(r1-1,c1);
	            }
	           }
	                
	               
             if((c1-1)>=0 && (r1+1)<=r)
	           {
	            if(arr[r1+1][c1-1]==1)
	            {
	                arr[r1+1][c1-1]=2;
	               change(r1+1,c1-1);
	            }
	           }
	           
	           if((c1+1)<=c && (r1+1)<=r)
	           {
	            if(arr[r1+1][c1+1]==1)
	            {
	                arr[r1+1][c1+1]=2;
	               change(r1+1,c1+1);
	            }
	           }
	           
	           
          if((c1+1)<=c && (r1-1)>=0)
	           {
	            if(arr[r1-1][c1+1]==1)
	            {
	                arr[r1-1][c1+1]=2;
	               change(r1-1,c1+1);
	            }
	           }
	       }
     
     
     

 
}
