import java.io.*;
class palfile1
{void main()throws IOException
{String fprime="palfile.txt";
FileReader ob1=new FileReader(fprime);
BufferedReader ob2=new BufferedReader(ob1);
//PrintWriter ob3=new PrintWriter(ob2);
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s="";
System.out.println("Output of File :");
while((s=ob2.readLine())!=null)
System.out.println(s);
ob2.close();
}
}

