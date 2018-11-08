import java.io.*;
import java.lang.*;
class min_max
{
public static void main(String args[])throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int i,min,t=0,max;
int m[]=new int[10];
for(i=0;i<10;i++)
{
System.out.println("Enter numbers");
m[i]=Integer.parseInt(cd.readLine());
}
min = m[0];
max = m[0];
for(i=0;i<10;i++)
{
    if(m[i]>max)
    {
        max = m[i];
    }
    else if(m[i]<min)
    {
        min = m[i];
    }
    t = t + m[i];
}
System.out.println("Maximum number : "+max);
System.out.println("Minimum number : "+min);
System.out.println("Sum of numbers : "+t);
}
}