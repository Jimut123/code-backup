package iisscc;
import java.io.*;
class happy
{//starting of class   
int n=0;
happy(int x)//constructor
{
n=x;//inputting the number
}
int sumofdigits(int x)
{//defining function to calculate sum of digits
int a=0,b=0;
while(x!=0)
{
a=x%10;
b=b+(a*a);
x=x/10;
}
return b;
}//end of function
void ofHappy()
{//function for checking whether sum equal to one
int s=0;
s=sumofdigits(n);
while(s>9)
{
s=sumofdigits(s);
}//end of while loop
if(s==1)
{
System.out.println(n);
}
}//end of function
public static void main(String args[])throws IOException
{//defining main function
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int start,end,i;//declaring variables
System.out.println("Enter the Starting range :");
start=Integer.parseInt(in.readLine());
System.out.println("Enter the Ending range :");
end=Integer.parseInt(in.readLine());
System.out.println("List of HAPPY NUMBERS : ");
for(i=start;i<=end;i++)
{//displaying happy numbers from starting to end
happy ob=new happy(i);
ob.ofHappy();
}//end of for loop
}//end of main
}//end of class
