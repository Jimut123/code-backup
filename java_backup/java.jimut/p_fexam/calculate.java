import java.io.*;
class calculate
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int tc,amount;
System.out.println("Enter total cost");
tc=Integer.parseInt(cd.readLine());
amount=Integer.parseInt(cd.readLine());
if(tc<=2000)
amount=tc*5;
else if((tc>=2001)&&(tc<=5000))
amount=tc*25;
else if((tc>=5001)&&(tc<=10000))
amount=tc*35;
else if(tc>=10000)
amount=tc*50;
System.out.println("The amount="+amount);
}
}