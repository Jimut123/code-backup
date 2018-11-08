import java.util.*;   
public class  NO_TO_WORD
{
void sum()            
{
Scanner sc=new Scanner(System.in);
int a,c,b=1,d=1,e,k=1, z=0;

System.out.println("ENTER 3 DIGIT number");
a=sc.nextInt();
c=3; ;
while(c>1)
{
b=a%10;
d=(d*10)+b;
a=a/10;
c--;
}
e=3;
while(e>0)
{
k=d%10;
if(e==3)
{
hundred(k);
}
else if(e==2 && (z%100)>19)
{
tens(k);
}
else if(e==1 && (z%100)>19)
{
units(k,z);
}
d=d/10;
e--;
}
}
void hundred (int g)
{
switch (g)
{
case 1:
System.out.print("one hundred");
break;
case 2:
System.out.print("two hundred");
break;
case 3:
System.out.print("THREE HUNDRED");
break;
case 4:
System.out.print("four hundred");
break;
case 5:
System.out.print("five hundred");
break;
case 6:
System.out.print("SIX HUNDRED");
break;
case 7:
System.out.print("SEVEN HUNDRED");
break;
case 8:
System.out.print("EIGHT HUNDRED");
break;
case 9:
System.out.print("NINE HUNDRED");
break;}
}
void tens(int h)
{
switch (h)
{
case 2:
System.out.print("twenty");
break;
case 3:
System.out.print("thirty");
break;
case 4:
System.out.print("forty");
break;
case 5:
System.out.print("fifty");
break;
case 6:
System.out.print("sixty");
break;
case 7:
System.out.print("seventy");
break;
case 8:
System.out.print("eighty");
break;
case 9:
System.out.print("ninety");
break;
}
}
void units(int i,int l)
{

switch (i)
{
case 1:
System.out.print("one");
break;
case 2:
System.out.print("two ");
break;
case 3:
System.out.print("THREE");
break;
case 4:
System.out.print("four");
break;
case 5:
System.out.print("five ");
break;
case 6:
System.out.print("SIX ");
break;
case 7:
System.out.print("SEVEN ");
break;
case 8:
System.out.print("EIGHT");
break;
case 9:
System.out.print("NINE");
break;
}
if ((l%100)==11)
{
System.out.print("eleven");
}
else if((l%100)==12)
{
System.out.print("twelve");
}
else if((l%100)==13)
{
System.out.print("thirteen");
}
else if((l%100)==14)
{
System.out.print("fourteen");
}
else if((l%100)==15)
{
System.out.print("fifteen");
}
else if((l%100)==16)
{
System.out.print("sixteen");
}
else if((l%100)==17)
{
System.out.print("seventeen");
}
else if((l%100)==18)
{
System.out.print("eighteen");
}
else if((l%100)==19)
{
System.out.print("nineteen");
}
}
}