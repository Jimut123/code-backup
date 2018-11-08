package iscxi;

import java.io.*;
class series
 {
   		public  static void main(String args[])throws IOException
     			 {
        				  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        				   System.out.println("Enter 'x'");
       				   int x= Integer.parseInt(br.readLine());
      				    System.out.println("Enter limit");
      				   int n= Integer.parseInt(br.readLine());
         				 int a=1,s=1,i;
     				     for(i=1;i<=n;i++)
      					     {
             						  s=s*x;
            	   					a=a+s;
          					  }
         					   System.out.println("The Sum  is :" + a);
     				   }
 		 }   
          

