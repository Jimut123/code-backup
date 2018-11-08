import java.io.*;
public class number {
public static void main(double a){
DataInputStream in=new DataInputStream(System.in);
double r=a;
double cr=0;
while(r>0)
{
r=r/10;
cr ++;
}
double b=cr/2;
double y=Math.pow(10,b);
a=a/y;
double m=a%10;
System.out.println(m);
}
}


