import java.io.*;
class recurodd
{
int i=1;
void odd()
{
if(i>100)
{
return;
}
else
{
if(i%2!=0)
{
System.out.println("Odd:"+i);
}
i++;
odd();
}
}
}