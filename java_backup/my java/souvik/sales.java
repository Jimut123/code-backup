
class sales 
{
public static void main (int a)
{
int com;
com=0;
if(a<=10000)
com=(a*10)/100;
else
if(a<= 30000)
com=((a*15)/100);
else
if(a<= 50000)
com=(a*25)/100;
else
if(a> 50000)
com=(a*30)/100;
System.out.print(com);
}
}