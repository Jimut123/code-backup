import java.io.*;
class recurprime
{
int i=1,j,f=0;
void prime()
{
if(i>100)
{
return;
}
else
{
f=0;
for(j=2;j<i;j++)
{
if(i%j==0)
{
f=1;
break;
}
}
if(f==0)
{
System.out.println("Prime:"+i);
}
i++;
prime();
}
}
}