import java.io.*;
class array3
{
public void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int i,j;
char m[][]=new char[3][4];
System.out.println("Enter the characters all at a time");
for(i=0;i<3;i++)
{
for(j=0;j<4;j++)
{
m[i][j]=(char)(cd.read());
}
}
System.out.println("The characters in the cells are:");
for(i=0;i<3;i++)
{
for(j=0;j<4;j++)
{
System.out.print(m[i][j]+"");
}
}
}
}
