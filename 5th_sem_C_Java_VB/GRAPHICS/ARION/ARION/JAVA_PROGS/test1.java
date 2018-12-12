import java.io.*;
class test
{
	public static void main(String args[])
	{
	char a[][]=new char[10][10];
	int k=65;
	for(int i=0;i<10;i++)
		for(int j=0;j<10;j++)
			a[i][j]=(char)k++;
	for(int i=0;i<10;i++)
		for(int j=0;j<10;j++)
			System.out.print(a[i][j]);
	}
}
