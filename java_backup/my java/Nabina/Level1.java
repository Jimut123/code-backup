import java.io.*;
class Level1
{
public static void main(String agrs[])throws IOException
{
int f=0,f1=0,i,j,k=0,r,c,n,w,g=0;
String s;
int a[][]=new int[9][9];
int b[][]={{5,3,2,6,8,9,7,1,4},{8,6,1,7,4,2,5,3,9},{7,9,4,1,3,5,8,2,6},{9,7,8,5,1,3,4,6,2},{6,1,5,4,2,8,9,7,3},{4,2,3,9,6,7,1,5,8},{3,5,7,2,9,4,6,8,1},{1,8,9,3,7,6,2,4,5},{2,4,6,8,5,13,9,7}};
BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Press 5 to choose level 1");
w=Integer.parseInt(input.readLine());
if(w==5)
{
a[0][0]=5;
a[0][7]=1;
a[1][3]=7;
a[1][5]=2;
a[1][8]=9;
a[2][5]=5;
a[2][6]=8;
a[3][1]=7;
a[3][4]=1;
a[3][6]=4;
a[3][7]=6;
a[4][3]=4;
a[4][5]=8;
a[5][1]=2;
a[5][2]=3;
a[5][4]=6;
a[5][7]=5;
a[6][2]=7;
a[6][3]=2;
a[7][0]=1;
a[7][3]=3;
a[7][5]=6;
a[8][1]=4;
a[8][8]=7;

System.out.print(" ");
g=0;
for(i=0;i<9;i++)
{
System.out.print(g+"_");
for(j=0;j<9;j++)
{
System.out.print(g+"|");
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
g++;
}
while(k<=68)
{

System.out.println("Enter row: ");
r=Integer.parseInt(input.readLine());
System.out.println("Enter column: ");
c=Integer.parseInt(input.readLine());
System.out.println("Enter no.: ");
n=Integer.parseInt(input.readLine());
a[r][c]=n;

for(i=0;i<9;i++)
{
f=0;
for(j=0;j<9;j++)
{
if(a[i][j]==0)
{
f=1;
break;
}
}
}

if(f==1)
{
System.out.println("Your new chart: ");
System.out.print(" ");
g=0;
for(i=0;i<9;i++)
{
for(j=0;j<9;j++)
{
System.out.print(g+"_");
System.out.print(a[i][j]+" ");
}
System.out.println(g+"|");
g++;
}
}
else
{

System.out.println("Do you want to make any more changes? Y/N");
s=input.readLine();
if((s.charAt(0)=='Y')||(s.charAt(0)=='y'))
{
System.out.println("Enter row: ");
r=Integer.parseInt(input.readLine());
System.out.println("Enter column: ");
c=Integer.parseInt(input.readLine());
System.out.println("Enter no.: ");
n=Integer.parseInt(input.readLine());
a[r][c]=n;

System.out.println("Your new chart: ");
System.out.print(" ");
g=0;
for(i=0;i<9;i++)
{
for(j=0;j<9;j++)
{
System.out.print(g+"_");
System.out.print(a[i][j]+" ");
}
System.out.println(g+"|");
g++;
}
}
else
{
k=68;

for(i=0;i<9;i++)
{
f1=0;
for(j=0;j<9;j++)
{
if(a[i][j]==b[i][j])
{
f1=1;
break;
}
}
}
if(f1==1)
System.out.print(" Congratulations !! You WIN ");
else
System.out.println("You lose!! Better luck next time ");
}
}
k++;
}
}
}
}

//System.out.println("");System.out.println("");//System.out.println("");
//System.out.println("");System.out.println("");//System.out.println("");
//System.out.println("");

