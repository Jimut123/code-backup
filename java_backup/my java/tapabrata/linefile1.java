import java.io.*;
class linefile1
{void main()throws IOException
{String fline="line.txt";
FileReader ob1=new FileReader(fline);
BufferedReader ob2=new BufferedReader(ob1);
//PrintWriter ob3=new PrintWriter(ob2);
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line;
while((line=ob2.readLine())!=null)
{

System.out.println(line);
}
}
}