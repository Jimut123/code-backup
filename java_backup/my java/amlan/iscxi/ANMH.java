package iscxi;

import java.io.*;
class ANMAH
 {
   		public  static void main(String args[])throws IOException
     			 {
        				  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        				  int x,y,i,s,s1;
        				   System.out.println("Enter 'x'");
       				    x= Integer.parseInt(br.readLine());
       				    System.out.println("Enter y");
      				    y= Integer.parseInt(br.readLine());
      				    s=0;
      				    for(i=1;i<=x;i++)
      				    {
      				        if(x%i==0)
      				        {
      				            s=s+i;
      				          }
      				      }
      				     s1=0;
      				    for(i=1;i<=x;i++)
      				    {
      				        if(y%i==0)
      				        {
      				            s1=s1+i;
      				          }
      				      } 
      				      if(s==y && s1==x)
      				       System.out.println("Amicable no");
      				       else
      				        System.out.println("non Amicable no");
      				      }
      				  }