import java.io.*;
class employee_details
{int s;
String n,m;
public void inputdata()throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the name of the employee");
n=br.readLine();
System.out.println("Enter the designation");
m=br.readLine();
System.out.println("Enter the basic salary");
s=Integer.parseInt(br.readLine());
}
}