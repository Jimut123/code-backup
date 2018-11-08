import java.io.*;
class ternaryth
{
public static void main(String args[])throws IOException
{
int d,p;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter value");
p=Integer.parseInt(br.readLine());
d=(p<10000?(10*p)/100:p<25000?(15*p)/100:p<50000?(p*25)/100:(p*30)/100);
System.out.println(d); 
}  
}