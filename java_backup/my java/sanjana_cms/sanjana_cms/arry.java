package sanjana_cms;

import java.io.*;
class arre
{
public static void main (String args[]) throws IOException;
InputStreamReader ab=new InputStreamReader (System.in);
BufferedReader cd=new BufferedReader(ab);
int m []=new int[10];
int i, max, min;
System.out.println("Enter ten integers");
for (i=0; i<=9; i++)
{
m[i] = Integer.parse.int(cd.readLine[]);
}
max=m[0];
min=m[0];
for(i=0; i<=9; i++)
{
if(max<m[i])
max=m[i];
if (min>m[i])
min=m[i];
}
System.out.println("Maximum value="+max);
System.out.println("Minimum value="+min);
}