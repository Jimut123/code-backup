
import java.io.*;
class areaS_developed_conc//decleration of class
{
double x,y;//initilisation
int m;
float i,j;
int a;
void areaS_developed_conc(double x,double y)
{
double z;
z=x*y;
System.out.println(z);//printing of results
}
void areaS_developed_conc(int m)
{
double o;
o=m*m;
System.out.println(o);//printing of results
}
void areaS_developed_conc(float i,float j)
{
double k;
k=(double).5*(i*j);
System.out.print(k);//printing of results
}
void areaS_developed_conc()throws IOException
{
double a;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Radius:");
a=Double.parseDouble(br.readLine());
System.out.println(22/7*a*a);//printing of results
}
}//end of class
