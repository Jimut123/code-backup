//Selection sort of 10 numbers in ascending order
import java.io.*;
import java.lang.*;
class practise_selection
{
public static void main(String args[])throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int i,j,min,t;
int m[]=new int[8];
for(i=0;i<8;i++)
{
System.out.println("Enter numbers");
m[i]=Integer.parseInt(cd.readLine());
}
for(i=0;i<=6;i++)
{
    min =i;
    for(j=(i+1);j<=8;j++)
    {
        if(m[i]>m[j])
        {
            min = j;
        }
    }
    t = m[min];
    m[min] = m[j];
    m[j]=t;
}
System.out.println("Numbers in ascending order:");
for(i=0;i<8;i++)
{
System.out.println(m[i]);
}
}
}