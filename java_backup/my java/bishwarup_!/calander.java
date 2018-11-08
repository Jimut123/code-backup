import java.io.*;
class calander
{
void main()throws IOException
{
int i,j;
String M[][]={
{"SUN ","MON ","TUE ","WED ","THE ","FRI ","SAT "},
{" "," "," 1 "," 2 "," 3 "," 4 "," 5 "},
{" 6 "," 7 "," 8 "," 9 "," 10 "," 11 "," 12 "},
{" 13 "," 14 "," 15 "," 16 "," 17 "," 18 "," 19 "},
{" 20 "," 21 "," 22 "," 23 "," 24 "," 25 "," 26 "},
{" 27 "," 28 "," 29 "," 30 "," "," "}
};
for(i=0;i<6;i++)
{
for(j=0;j<6;j++)
{
System.out.print(M[i][j]);
}
System.out.println();
}
}
}


