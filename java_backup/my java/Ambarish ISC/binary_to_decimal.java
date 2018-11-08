import java.io.*;

class binary_to_decimal
{
public static void main ()throws IOException 
{
String input;
int n,d1,d2,d3,d4,result;
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the binary number:");
n = Integer.parseInt(br.readLine());

d1 = ((n % 10000) - (n % 10000 % 1000)) / 1000;
d2 = ((n % 1000) - (n % 1000 % 100)) / 100;
d3 = ((n % 100) - (n % 100 % 10)) / 10;
d4 = (n % 10);
result = (d1 * 8) + (d2 * 4) + (d3 * 2) + (d4 * 1);
System.out.println (result);
} 
}

