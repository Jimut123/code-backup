package testpaper.proj.number1;

public class count
{
public int cal(int n)
{
int c=0;
while(n>0)
{
c++;
n=n/10;
}
return c;
}
}