import java.io.*;
class getprime
{
void getnextprime(int x)
{
int y,j,f;
y=x+1;
while(true)
{
f=0;
for(j=2;j<y;j++)
if(y%j==0)
{
f=1;
break;
}
if(f==0)
{
System.out.print("new prime"+y);
break;
}
y++;
}
}
}
