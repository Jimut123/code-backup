import java.io.*;
class primefile2
{void main()throws IOException
{String fprime="prime.txt";
FileReader ob1=new FileReader(fprime);
BufferedReader ob2=new BufferedReader(ob1);
//PrintWriter ob3=new PrintWriter(ob2);
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i;
while(ob2.readLine()!=null)
{
i=Integer.parseInt(ob2.readLine());
System.out.println(i);
}
}
}