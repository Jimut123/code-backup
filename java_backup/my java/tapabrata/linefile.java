import java.io.*;
class linefile
{void main()throws IOException
{String fline="line.txt";
FileWriter ob1=new FileWriter(fline);
BufferedWriter ob2=new BufferedWriter(ob1);
PrintWriter ob3=new PrintWriter(ob2);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line;
String y;
y="Yes";
System.out.println("Give Lines of Texts");
while(y.equalsIgnoreCase("Yes")==true)
{line=br.readLine();
ob3.println(line);
System.out.println("Give another:");
y=br.readLine();
}
ob3.close();
}
}