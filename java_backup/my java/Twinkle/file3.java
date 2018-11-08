import java.io.*;
class file3
{
public static void main(String args[])throws IOException
{
BufferedReader fileInput=new BufferedReader(new FileReader("primes.txt"));;
String p;
while((p=fileInput.readLine())!=null)
{
System.out.println("Prime "+p);
}
fileInput.close();
}
}