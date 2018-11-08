import java.io.*;
class Iscscores
{

int number[][]=new int[6][2];
int a[]=new int[6];
int i,p,point,j;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

 Iscscores()throws IOException
 {
  for(i=0;i<6;i++)
   {
   System.out.println("Enter Marks and Subject Code:");
   for(j=0;j<2;j++)
   {
   number[i][j]=Integer.parseInt(input.readLine());
   }
   }
 }
 
 int point()
 {
  if(p>=90)
  point=1;
  else
  if(p>=80&&p<=89)
  point=2;
  else
  if(p>=70&&p<=79)
  point=3;
  else
  if(p>=60&&p<=69)
  point=4;
  else
  if(p>=50&&p<=59)
  point=5;
  else
  if(p>=40&&p<=49)
  point=6;
  return point;   
  
  }
  }
  