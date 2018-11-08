import java.io.*;
class PrimeFactors
{
public static void main() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
System.out.print("Enter a Number : ");
n=Integer.parseInt(br.readLine());
System.out.print("The Prime Factors of "+n+" are : ");
int i=2;
while(n>1)
{
if(n%i == 0)
{
System.out.print(i+" ");
n=n/i;
}
else
i++;
}
}
}
/**
  Enter a Number : 378
The Prime Factors of 378 are : 2 3 3 3 7 
 */