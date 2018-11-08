import java.io.*;
class armstrong100to999
{
void gen()
{
for(int i=100;i<=999;i++)
{
if(check(i)==1)
System.out.println(i);
}
}
int check(int x)
{
int y,z,k;
k=0;
y=x;
while(y>0)
{
z=y%10;
k=k+(z*z*z);
y=y/10;
}
//System.out.println(k);
if(k==x)
{
return 1;
}
else
return 0;
}
}

