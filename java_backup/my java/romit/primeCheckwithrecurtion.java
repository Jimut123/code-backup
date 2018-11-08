import java.io.*;
class primeCheckwithrecurtion
{
int i,j,k;
primeCheckwithrecurtion( )
{
i=1;
j=2;
}
void input()
{
int x;
if(i>100)
{
return;
}
else 
{
x=primecheck(i);
if(x==0)
{
System.out.println(i);
}
i++;
j=2;
input();

}
}
int primecheck(int x)
{
if(j>(x-1))
{
return 0;
}
else 
{
if(x%j==0)
{
return 1;
}
else
{
j++;
return(primecheck(x));
}
}
}
}