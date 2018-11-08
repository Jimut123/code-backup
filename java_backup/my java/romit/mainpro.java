import java.io.*;
class mainpro
{
public static void main(String args[])throws IOException
{



BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int x;
do
{
System.out.println("Press 1 for class V & VI");
System.out.println("Press 2 for class VII & VIII");
System.out.println("Press 3 for class IX & X");
System.out.println("Press 4 for Exit");
System.out.println("Enter choice:");
x=Integer.parseInt(Input.readLine());
switch(x)
{
case 1:project p=new project();
        p.input1();
       p.calculation1();
       p.display1();
       break;
 case 2:project2 p1=new project2();
        p1.input();
       p1.calculation1();
       p1.display1();
       break;
case 3:project3 p2=new project3();
       p2.input();
       p2.calculation1();
       p2.display1();
       break;  
case 4: System.exit(0);
}
}while(true);
}
}
       