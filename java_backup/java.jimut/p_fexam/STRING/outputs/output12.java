package STRING.outputs;



import java.io.*;
import java.lang.*;
class output12
{
public static void main(String[]args)
{
String S1="Hi";
String S2="Hi";
String S3="there";
String S4="HI";
System.out.println(S1 +"equals"+S2+"        "+S1.equals(S2));
System.out.println(S1 +"equals"+S3+"        "+S1.equals(S3));
System.out.println(S1 +"equals"+S4+"        "+S1.equals(S4));
System.out.println(S1 +"equalsIgnoreCase"+S4+"        "+S1.equalsIgnoreCase(S4));
}
}